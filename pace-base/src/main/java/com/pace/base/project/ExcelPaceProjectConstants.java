package com.pace.base.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pace.base.PafBaseConstants;
import com.pace.base.app.*;
import com.pace.base.db.membertags.MemberTagType;
import com.pace.base.view.PafAlignment;


public class ExcelPaceProjectConstants {

	public static final String GENERATION = "Generation";

	public static final String LEVEL = "Level";

	public static final String VAILD_OPTIONS_ARE = ". Vaild options are: ";

	public static final String HEX_FONT_PATTERN = "[0123456789ABCDEFabcdef]*";

	public static final String MISSING_VALUE = "Missing Value";

	public static final String MISSING_KEY = "Missing Key";

	public static final String END_OF_SHEET_IDENT = "EOS";

	public static final String REQUIRED = "Required.";

	public static final String INVALID_VALUE = "Invalid value: ";
	
	public static final String INVALID_NUMBER = "Invalid number: ";
	
	public final static int EXCEL_MAX_CELL_LIMIT = 32767;
	
	public final static String EXCEL_STRING_FIELD_DELIM = "|";
	
	public static final String COULD_NOT_CREATE_THE_REFERENCE_MAP = "Could not create the dynamic references: ";
	
	public static final String EXCEL_VIEW_SECTION_DYNAMIC_HEADER_ID = "xml";
	
	public static final String HEADER_IGNORE_IDENT = "<header ignore>";
	
	//enum maps
	public static Map<String, VersionType> VERSION_TYPE_MAP = new HashMap<String, VersionType>();
	
	public static Map<String, VersionVarianceType> VERSION_VARIANCE_TYPE_MAP = new HashMap<String, VersionVarianceType>();
	
	public static Map<String, MeasureType> MEASURE_TYPE_MAP = new HashMap<String, MeasureType>();
	
	public static Map<String, VarRptgFlag> VAR_RPTG_FLAG_MAP = new HashMap<String, VarRptgFlag>();
	
	public static List<String> VALID_FONT_ALIGNMENT_LIST = new ArrayList<String>();
	
	public static final List<String> VALID_BOOLEAN_LIST = new ArrayList<String>();
	
	public static List<String> VALID_LEVEL_GENERATION_LIST = new ArrayList<String>();
	
	public static List<String> VALID_ALIAS_MEMBER_LIST = new ArrayList<String>();
	
	public static List<String> VALID_VERSION_TYPE_LIST = new ArrayList<String>();
	
	public static List<String> VALID_PAGE_ORIENTATION_LIST = new ArrayList<String>();
	
	public static List<String> VALID_MEMBER_TAG_TYPE_LIST = new ArrayList<String>();
		
	static {
				
		//populate version type
		for ( VersionType vt : VersionType.values() ) {
			
			VERSION_TYPE_MAP.put(vt.toString(), vt);
			
		}
		
		//populate variance type
		for ( VersionVarianceType vvt : VersionVarianceType.values() ) {
			
			VERSION_VARIANCE_TYPE_MAP.put(vvt.toString(), vvt);
			
		}
		
		//populate measure type
		for (MeasureType mt : MeasureType.values()) {
			
			MEASURE_TYPE_MAP.put(mt.toString(), mt);
			
		}
		
		//populate var rptg flag
		for (VarRptgFlag flag : VarRptgFlag.values()) {
			
			VAR_RPTG_FLAG_MAP.put(flag.toString(), flag);
			
		}
				
		VALID_FONT_ALIGNMENT_LIST.addAll(Arrays.asList(PafAlignment.LEFT, PafAlignment.CENTER, PafAlignment.RIGHT, PafAlignment.FULL));
		VALID_BOOLEAN_LIST.addAll(Arrays.asList(Boolean.TRUE.toString(), Boolean.FALSE.toString()));
		VALID_LEVEL_GENERATION_LIST.addAll(Arrays.asList(ExcelPaceProjectConstants.LEVEL, ExcelPaceProjectConstants.GENERATION));
		VALID_ALIAS_MEMBER_LIST.addAll(Arrays.asList(AliasMemberDisplayType.Alias.toString(), AliasMemberDisplayType.Member.toString()));
		VALID_PAGE_ORIENTATION_LIST.addAll(Arrays.asList(PafBaseConstants.VIEW_PAGE_ORIENTATION_LANDSCAPE, PafBaseConstants.VIEW_PAGE_ORIENTATION_PORTRAIT));
		
		for (MemberTagType memberTagType : MemberTagType.values() ) {
			
			VALID_MEMBER_TAG_TYPE_LIST.add(memberTagType.toString().toUpperCase());
			
		}
		
		
	}
	
}
