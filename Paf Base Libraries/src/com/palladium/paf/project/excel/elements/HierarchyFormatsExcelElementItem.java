/*
 *	File: @(#)HierarchyFormatsExcelElementItem.java 	Package: com.palladium.paf.project.excel.elements 	Project: Paf Base Libraries
 *	Created: Jan 8, 2010  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2010 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
	Date			Author			Version			Changes
	xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.palladium.paf.project.excel.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;

import com.palladium.paf.PafException;
import com.palladium.paf.app.PafApplicationDef;
import com.palladium.paf.mdb.PafDimTree.LevelGenType;
import com.palladium.paf.project.ExcelPaceProjectConstants;
import com.palladium.paf.project.PaceProjectReadException;
import com.palladium.paf.project.PaceProjectWriteException;
import com.palladium.paf.project.ProjectDataError;
import com.palladium.paf.project.ProjectElementId;
import com.palladium.paf.project.excel.IExcelDynamicReferenceElementItem;
import com.palladium.paf.project.excel.PafExcelInput;
import com.palladium.paf.project.excel.PafExcelRow;
import com.palladium.paf.project.excel.PafExcelValueObject;
import com.palladium.paf.project.utils.PafExcelUtil;
import com.palladium.paf.view.Dimension;
import com.palladium.paf.view.GenFormat;
import com.palladium.paf.view.HierarchyFormat;
import com.palladium.paf.view.LevelFormat;
import com.palladium.paf.view.PafStyle;
import com.palladium.utility.CollectionsUtil;

/**
 * Reads/writes hierarchy formats from/to an Excel 2007 workbook.
 *
 * @author jmilliron
 * @version	1.00
 *
 */
public class HierarchyFormatsExcelElementItem<T extends Map<String, HierarchyFormat>> extends PafExcelElementItem<T> {
	
	/**
	 * Creates an excel element item. Mainly used for reading hierarchy formats.
	 * 
	 * @param workbook workbook used for read/write
	 */
	public HierarchyFormatsExcelElementItem(Workbook workbook) {
		super(workbook);
	}
	
	/**
	 * Creates an excel element item. Mainly used for writing hierarchy formats.
	 * 
	 * @param workbook workbook used for read/write
	 * @param isCellReferencingEnabled true if cell referencing is enabled
	 */
	public HierarchyFormatsExcelElementItem(Workbook workbook,
			boolean isCellReferencingEnabled) {
		super(workbook, isCellReferencingEnabled);
	
	}
	
	@Override
	protected void createHeaderListMapEntries() {

		getHeaderListMap().put(getSheetName(), Arrays.asList("name", "dimension", "type (Level, Generation)", "number", "global style name"));		
		
	}

	@Override
	public ProjectElementId getProjectElementId() {
		
		return ProjectElementId.HierarchyFormats;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	protected T readExcelSheet() throws PaceProjectReadException, PafException {
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
				.headerListMap(getHeaderListMap())
				.excludeHeaderRows(true)
				.excludeEmptyRows(true)
				.sheetRequired(true)
				.multiDataRow(true)
				.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
				.build();

		List<PafExcelRow> excelRowList = PafExcelUtil.readExcelSheet(input);

		Map<String, HierarchyFormat> hierarchyFormatMap = new HashMap<String, HierarchyFormat>();

		HierarchyFormat mapEntry = null;

		for (PafExcelRow row : excelRowList) {

			// temp excel row list, used to unmerge the consolidated row
			List<PafExcelRow> tempExcelRowList = null;

			mapEntry = new HierarchyFormat();
			
			for (Integer rowIndex : row.getRowItemOrderedIndexes()) {

				List<PafExcelValueObject> rowItemList = row
						.getRowItem(rowIndex);

				PafExcelValueObject firstValueObject = rowItemList.get(0);

				switch (rowIndex) {

				// name
				case 0:

					tempExcelRowList = new ArrayList<PafExcelRow>(
							rowItemList.size());

					// create a new row for the number of rows merged into
					// the row
					for (int i = 0; i < rowItemList.size(); i++) {

						tempExcelRowList.add(new PafExcelRow());

					}

					if (firstValueObject.isString()) {

						String hierarchyFormatName = firstValueObject
								.getString();

						String caseInsenstiveKey = CollectionsUtil
								.getCaseSenstiveKeyFromMap(hierarchyFormatMap,
										hierarchyFormatName);

						if (caseInsenstiveKey != null) {

							mapEntry = hierarchyFormatMap.get(caseInsenstiveKey);

						} else {

							mapEntry.setName(firstValueObject.getString());

						}

					} else if (firstValueObject.isBlank()) {

						addProjectDataErrorToList(ProjectDataError.createRequiredProjectDataError(
								getProjectElementId(), firstValueObject));

					} else {

						addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(
								getProjectElementId(), firstValueObject));

					}

					break;

				case 1:
				case 2:
				case 3:
				case 4:

					int tmpRowNdx = 0;

					// populate the temp row with relevant index item from
					// rowItemList
					for (PafExcelRow tempRow : tempExcelRowList) {

						tempRow.addRowItem(rowIndex, rowItemList
								.get(tmpRowNdx++));

					}

					if (rowIndex != 4) {
						break;
					}

					Dimension dimension = null;
					LevelGenType lastLevelGen = null;
					LevelFormat levelFormat = null;
					GenFormat genFormat = null;

					// populate over the temp rows to parse out dimension,
					// type, number and global style
					for (PafExcelRow tempRow : tempExcelRowList) {

						for (Integer tempRowNdx : tempRow
								.getRowItemOrderedIndexes()) {

							firstValueObject = tempRow.getRowItem(
									tempRowNdx).get(0);

							switch (tempRowNdx) {

							// dimension name
							case 1:
								if (firstValueObject.isString() || firstValueObject.isFormula()) {

									// clear last dim
									dimension = null;

									String dimName = firstValueObject.getValueAsString();

									if (mapEntry.getDimensions() != null) {

										dimension = mapEntry
												.getDimension(CollectionsUtil
														.getCaseSenstiveKeyFromMap(
																mapEntry
																		.getDimensions(),
																dimName));

									}

									if (dimension == null) {

										dimension = new Dimension();
										dimension.setName(dimName);
									}

								} else if (dimension == null
										&& firstValueObject.isBlank()) {

									addProjectDataErrorToList(ProjectDataError.createRequiredProjectDataError(
											getProjectElementId(),
											firstValueObject));

								} else if (!firstValueObject.isBlank()) {

									addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(
											getProjectElementId(),
											firstValueObject));

								}

								break;

							// type { Level, Generation }
							case 2:

								if (firstValueObject.isString()) {

									String levelGen = firstValueObject
											.getString().toLowerCase();

									if (levelGen
											.equalsIgnoreCase(ExcelPaceProjectConstants.LEVEL)) {

										lastLevelGen = LevelGenType.LEVEL;

									} else if (levelGen
											.equalsIgnoreCase(ExcelPaceProjectConstants.GENERATION)) {

										lastLevelGen = LevelGenType.GEN;

									} else {

										addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(
												getProjectElementId(),
												firstValueObject,
												ExcelPaceProjectConstants.VALID_LEVEL_GENERATION_LIST));

									}

								} else if (lastLevelGen == null
										&& firstValueObject.isBlank()) {

									addProjectDataErrorToList(ProjectDataError.createRequiredProjectDataError(
											getProjectElementId(),
											firstValueObject));

								} else if (!firstValueObject.isBlank()) {

									addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(
											getProjectElementId(),
											firstValueObject));

								}

								break;

							// level/gen number
							case 3:

								if (firstValueObject.isNumeric()) {

									Integer intValue = firstValueObject
											.getInteger();

									if (dimension != null
											&& lastLevelGen
													.equals(LevelGenType.LEVEL)
											&& intValue >= 0) {

										levelFormat = new LevelFormat();
										levelFormat.setLevel(intValue);

									} else if (dimension != null
											&& lastLevelGen
													.equals(LevelGenType.GEN)
											&& intValue >= 1) {

										genFormat = new GenFormat();
										genFormat.setGeneration(intValue);

									} else {

										addProjectDataErrorToList(new ProjectDataError(
												getProjectElementId(),
												firstValueObject,
												ExcelPaceProjectConstants.INVALID_VALUE
														+ firstValueObject
																.getValueAsString()
														+ ExcelPaceProjectConstants.VAILD_OPTIONS_ARE
														+ ExcelPaceProjectConstants.LEVEL
														+ " >= 0, "
														+ ExcelPaceProjectConstants.GENERATION
														+ " >= 1"));

									}

								} else if (levelFormat == null
										&& genFormat == null
										&& firstValueObject.isBlank()) {

									addProjectDataErrorToList(ProjectDataError.createRequiredProjectDataError(
											getProjectElementId(),
											firstValueObject));

								} else {

									addProjectDataErrorToList(ProjectDataError.createInvalidValueProjectDataError(
											getProjectElementId(),
											firstValueObject));

								}

								break;

							// global style name
							case 4:

								if (firstValueObject.isBlank()) {

									addProjectDataErrorToList(ProjectDataError.createRequiredProjectDataError(
											getProjectElementId(),
											firstValueObject));

								} else {

									if (dimension != null
											&& lastLevelGen
													.equals(LevelGenType.LEVEL)
											&& levelFormat != null) {

										levelFormat
												.setFormatName(firstValueObject
														.getValueAsString());
										dimension
												.addLevelFormat(levelFormat);

									} else if (dimension != null
											&& lastLevelGen
													.equals(LevelGenType.GEN)
											&& genFormat != null) {

										genFormat
												.setFormatName(firstValueObject
														.getValueAsString());
										dimension.addGenFormat(genFormat);

									}

								}
							}

						}

						// adds or replaces existing dimension
						mapEntry.addDimension(dimension);
					}

					break;

				}

			}							
		

			// if required vars are there, add to map
			if (mapEntry.getName() != null) {

				hierarchyFormatMap.put(mapEntry.getName(), mapEntry);

			}

		}

		return (T) hierarchyFormatMap;
		
	}

	@Override
	protected void writeExcelSheet(T t) throws PaceProjectWriteException, PafException {

		Map<String, String> globalStyleDynamicRefMap = null;
		Map<String, String> dimensionRefMap = null;
		
		//if cell referencing is enabled, read in global styles
		if ( isCellReferencingEnabled() ) {			

			//global style refs
			IExcelDynamicReferenceElementItem globalStyleElementItem = new GlobalStylesExcelElementItem<Map<String,PafStyle>>(getWorkbook());
			globalStyleDynamicRefMap = globalStyleElementItem.getDynamicReferenceMap();
			
			//dimension name refs
			IExcelDynamicReferenceElementItem appDefElementItem = new ApplicationDefExcelElementItem<List<PafApplicationDef>>(getWorkbook());
			dimensionRefMap = appDefElementItem.getDynamicReferenceMap();
			
		}
		
		PafExcelInput input = new PafExcelInput.Builder(getWorkbook(), getSheetName(), getHeaderListMap().get(getSheetName()).size())
			.endOfSheetIdnt(ExcelPaceProjectConstants.END_OF_SHEET_IDENT)
			.build();
		
		
		Map<String, HierarchyFormat> hierarchyFormatMap = t;
		
		List<PafExcelRow> excelRowList = new ArrayList<PafExcelRow>();
	
		//create and add header to list
		excelRowList.add(PafExcelUtil.createHeaderRow(getHeaderListMap().get(getSheetName())));
		
		if ( hierarchyFormatMap != null ) {
			
			for ( String hierarchyFormatName : hierarchyFormatMap.keySet() ) {
				
				HierarchyFormat hierarchyFormat = hierarchyFormatMap.get(hierarchyFormatName);
				
				PafExcelRow excelRow = new PafExcelRow();
				
				//name
				excelRow.addRowItem(0, PafExcelValueObject.createFromString(hierarchyFormat.getName()));
				
				Map<String, Dimension> dimensionMap = hierarchyFormat.getDimensions();
				
				if ( dimensionMap != null ) {
					
					for (String dimensionName : dimensionMap.keySet()) {
						
						Dimension dimension = dimensionMap.get(dimensionName);
						
						if ( dimension != null ) {
							
							Map<Integer, LevelFormat> levelFormatMap = dimension.getLevelFormats();
							
							if ( levelFormatMap != null ) {
								
								int levelFormatNdx = 0;
								
								for ( Integer levelFormatNumber : levelFormatMap.keySet()) {
									
									LevelFormat lf = levelFormatMap.get(levelFormatNumber);
									
									if ( lf != null) {
										
										if ( levelFormatNdx++ == 0 ) {
											
											//dimension name
											excelRow.addRowItem(1, PafExcelValueObject.createFromFormulaReferenceMap(dimensionName, dimensionRefMap));
											
											//type
											excelRow.addRowItem(2, PafExcelValueObject.createFromString(ExcelPaceProjectConstants.LEVEL));
																					
										} else {
											
											//blank dimension name
											excelRow.addRowItem(1, PafExcelValueObject.createBlank());
											
											//blank type
											excelRow.addRowItem(2, PafExcelValueObject.createBlank());
											
										}
										
										//level number
										excelRow.addRowItem(3, PafExcelValueObject.createFromInteger(lf.getLevel()));
										
										//global style
										excelRow.addRowItem(4, PafExcelValueObject.createFromFormulaReferenceMap(lf.getFormatName(), globalStyleDynamicRefMap));
										
									}
									
								}
								
							}
							
							Map<Integer, GenFormat> genFormatMap = dimension.getGenFormats();
							
							if ( genFormatMap != null ) {
								
								int genFormatNdx = 0;
								
								for ( Integer genFormatNumber : genFormatMap.keySet()) {
									
									GenFormat gf = genFormatMap.get(genFormatNumber);
									
									if ( gf != null) {
										
										if ( genFormatNdx++ == 0 ) {
											
											//dimension name
											excelRow.addRowItem(1, PafExcelValueObject.createFromFormulaReferenceMap(dimensionName, dimensionRefMap));
											
											//type
											excelRow.addRowItem(2, PafExcelValueObject.createFromString(ExcelPaceProjectConstants.GENERATION));
																					
										} else {
											
											//blank dimension name
											excelRow.addRowItem(1, PafExcelValueObject.createBlank());
											
											//blank type
											excelRow.addRowItem(2, PafExcelValueObject.createBlank());
											
										}
										
										//generation number
										excelRow.addRowItem(3, PafExcelValueObject.createFromInteger(gf.getGeneration()));
										
										//global style
										excelRow.addRowItem(4, PafExcelValueObject.createFromFormulaReferenceMap(gf.getFormatName(), globalStyleDynamicRefMap));
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
								
				excelRowList.add(excelRow);			
				
			}
			
		}
					
		PafExcelUtil.writeExcelSheet(input, excelRowList);
		
	}
	
}
