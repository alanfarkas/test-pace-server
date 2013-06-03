/*
 *	File: @(#)SeasonList.java 	Package: com.pace.base.app 	Project: Paf Base Libraries
 *	Created: Dec 5, 2005  		By: JWatkins
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
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
package com.pace.base.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Container for all the seasons currently defined in the system
 * Simple wrapper for season objects
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class SeasonList implements Cloneable {
	
	private transient static final Logger logger = Logger.getLogger(SeasonList.class);
	
    // ucased this variable for more consistent xml via XStream
    private Set <Season> Seasons = new HashSet<Season>();

    public void addSeason(Season s) {
        Seasons.add(s);
    }
    
    public Set<Season> getSeasons() {
        return Seasons;
    }
    public void setSeasons(Set<Season> s) {
        Seasons.clear();
        Seasons.addAll(s);
    }

    public Season getSeasonById(String seasonId) {
        for (Season s : Seasons) {
            if (s.getId().equalsIgnoreCase(seasonId)) return s;
        }
        throw new IllegalArgumentException("No season defined with that id in Season List [" + seasonId + "]");
        
    }

	/**
	 * Remove all occurrences of seasons with the specified id
	 * 
	 * @param seasonId
	 */
	public void removeSeasonById(String seasonId) {
		
		List<Season> seasonsToRemove = new ArrayList<Season>();
		for (Season season : Seasons) {
			if (season.getId().equalsIgnoreCase(seasonId)) {
				seasonsToRemove.add(season);
			}
		}
		
		Seasons.removeAll(seasonsToRemove);
	}
   
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Seasons == null) ? 0 : generateSeasonHashCode());
		return result;
	}

	private int generateSeasonHashCode() {
		
		int result = 0;
		
		if ( Seasons != null ) {
			
			for ( Season season : Seasons) {
				
				result += season.hashCode();
				
			}
			
		}

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
		SeasonList other = (SeasonList) obj;
		if (Seasons == null) {
			if (other.Seasons != null)
				return false;
		} else {
			
			if ( other.Seasons == null ) {
				return false;
			} else {
			
				if ( Seasons.size() == other.Seasons.size()) {
					
					for (Season season : Seasons) {
						
						if ( ! other.Seasons.contains(season) ) {
							
							return false;
							
						}
						
					}
					
				} else {
					return false;
				}
				
			}
			
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public SeasonList clone() {

		SeasonList clonedSeasonList = null;
		
		try {
			
			clonedSeasonList = (SeasonList) super.clone();
			
			if ( this.Seasons != null ) {
				
				clonedSeasonList.Seasons = new HashSet<Season>();
				
				for ( Season thisSeason : this.Seasons ) {
					
					clonedSeasonList.Seasons.add(thisSeason.clone());
					
				}
				
			}
			
		} catch (CloneNotSupportedException e) {
			//can't happen if implements cloneable
			logger.warn(e.getMessage());
		}
		
		return clonedSeasonList;		
		
	}

    
}
