/*
 *	File: @(#)Dimension.java 	Package: com.palladium.paf.view 	Project: Paf Base Libraries
 *	Created: Feb 16, 2005  		By: JavaJ
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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
package com.palladium.paf.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * This class contains the dimension name and both level and generation formatting maps.
 * 
 * @author JavaJ
 * 
 */
public class Dimension {

	//dimension name
	private String name;

	//map to hold level formats
	private Map<Integer, LevelFormat> levelFormats;

	private Map<Integer, GenFormat> genFormats;

	/**
	 * Creates empty level format and gen format maps
	 * 
	 */
	public Dimension() {

		levelFormats = new HashMap<Integer, LevelFormat>();

		genFormats = new HashMap<Integer, GenFormat>();

	}

	/**
	 * 
	 * @return dimension name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            dimension name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param levelSearch
	 * @return level format for found level
	 */
	public LevelFormat getLevelFormat(Integer levelSearch) {

		LevelFormat levelFormat = null;

		if (levelFormats != null && levelSearch != null) {
			for (Integer level : levelFormats.keySet()) {
				if (level.equals(levelSearch)) {
					levelFormat = levelFormats.get(level);
					break;
				}
			}
		}

		return levelFormat;

	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @param genSearch
	 * @return
	 */
	public GenFormat getGenFormat(Integer genSearch) {

		GenFormat genFormat = null;

		if (genFormats != null && genSearch != null) {

			for (Integer gen : genFormats.keySet()) {
				if (gen.equals(genSearch)) {
					genFormat = genFormats.get(gen);
					break;
				}
			}

		}

		return genFormat;

	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @param levelSearch
	 * @return
	 */
	public String getLevelFormatName(Integer levelSearch) {

		String formatName = null;

		LevelFormat levelFormat = getLevelFormat(levelSearch);

		if (levelFormat != null) {
			formatName = levelFormat.getFormatName();
		}

		return formatName;

	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @param genSearch
	 * @return
	 */
	public String getGenFormatName(Integer genSearch) {

		String formatName = null;

		GenFormat genFormat = getGenFormat(genSearch);

		if (genFormat != null) {
			formatName = genFormat.getFormatName();
		}

		return formatName;
	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @param levelFormat
	 */
	public void addLevelFormat(LevelFormat levelFormat) {

		if (levelFormat != null && levelFormat.getLevel() != null) {

			getLevelFormats().put(levelFormat.getLevel(), levelFormat);

		}

	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @param genFormat
	 */
	public void addGenFormat(GenFormat genFormat) {

		if (genFormat != null && genFormat.getGeneration() != null) {

			getGenFormats().put(genFormat.getGeneration(), genFormat);

		}

	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @param levelFormat
	 */
	public void removeLevelFormat(LevelFormat levelFormat) {

		if (levelFormat != null && levelFormat.getLevel() != null) {
			getLevelFormats().remove(levelFormat.getLevel());
		}

	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @param genFormat
	 */
	public void removeGenFormat(GenFormat genFormat) {

		if (genFormat != null && genFormat.getGeneration() != null) {
			getGenFormats().remove(genFormat.getGeneration());
		}

	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @return
	 */
	public Set<Integer> getLevelFormatKeys() {
		return getLevelFormats().keySet();
	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @return
	 */
	public Set<Integer> getGenFormatKeys() {
		return getGenFormats().keySet();
	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @param levelFormats
	 */
	public void setLevelFormats(Map<Integer, LevelFormat> levelFormats) {
		this.levelFormats = levelFormats;
	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @param genFormats
	 */
	public void setGenFormats(Map<Integer, GenFormat> genFormats) {
		this.genFormats = genFormats;
	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @return
	 */
	public int getNumberOfLevelFormats() {

		return getLevelFormats().size();
	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @return
	 */
	public int getNumberOfGenFormats() {

		return getGenFormats().size();
	}

	/**
	 * 
	 *	Method_description_goes_here
	 *
	 * @return
	 */
	public int getNumberOfHierFormats() {
		return getNumberOfGenFormats() + getNumberOfLevelFormats();
	}

	/**
	 * @return the genFormats
	 */
	public Map<Integer, GenFormat> getGenFormats() {

		if (genFormats == null) {
			genFormats = new HashMap<Integer, GenFormat>();
		}

		return genFormats;
	}

	/**
	 * @return the levelFormats
	 */
	public Map<Integer, LevelFormat> getLevelFormats() {

		if (levelFormats == null) {
			levelFormats = new HashMap<Integer, LevelFormat>();
		}

		return levelFormats;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		if ( genFormats != null && genFormats.size() > 0 ) {
			
			for ( Integer genKey : genFormats.keySet() ) {
				
				result = prime * result + genKey.hashCode();
				
				GenFormat gf = genFormats.get(genKey);
				
				result = prime * result
				+ ((gf == null) ? 0 : gf.hashCode());
				
			}
			
		}
		
		if ( levelFormats != null && levelFormats.size() > 0 ) {
			
			for ( Integer levelKey : levelFormats.keySet() ) {
				
				result = prime * result + levelKey.hashCode();
				
				LevelFormat lf = levelFormats.get(levelKey);
				
				result = prime * result
				+ ((lf == null) ? 0 : lf.hashCode());
				
			}
			
		}
		
		
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dimension other = (Dimension) obj;
		if (genFormats == null) {
			if (other.genFormats != null)
				return false;
		} else if (other.genFormats == null ) {
			return false;
		} else {
			
			for ( Integer genKey : genFormats.keySet() ) {
				
				if ( ! other.genFormats.containsKey(genKey)) {
					
					return false;
					
				} else {
					
					if ( ! genFormats.get(genKey).equals(other.genFormats.get(genKey))) {
						
						return false;
						
					}
					
				}
				
			}
			
		}
		
		if (levelFormats == null) {
			if (other.levelFormats != null)
				return false;
		} else if (other.levelFormats == null ) {
			
			return false;
			
		} else {
			
			for ( Integer levelKey : levelFormats.keySet() ) {
				
				if ( ! other.levelFormats.containsKey(levelKey)) {
					
					return false;
					
				} else {
					
					if ( ! levelFormats.get(levelKey).equals(other.levelFormats.get(levelKey))) {
						
						return false;
						
					}
					
				}
				
			}
			
		}
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}
