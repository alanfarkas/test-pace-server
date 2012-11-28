/*
 *	File: @(#)PafViewGroupUtil.java 	Package: com.pace.base.utility 	Project: Paf Base Libraries
 *	Created: Jan 29, 2007  		By: jmilliron
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
package com.pace.base.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.pace.base.comm.PafViewTreeItem;
import com.pace.base.view.PafViewGroup;
import com.pace.base.view.PafViewGroupItem;

/**
 * Paf View Group Utility.
 * 
 * @author jmilliron
 * @version x.xx
 * 
 */
public class PafViewGroupUtil {
	
	private static Logger logger = Logger.getLogger(PafViewGroupUtil.class);

	/**  
	 *	Converts new style view groups into old sytle view groups.  
	 *
	 *	1st. Loaded new 
	 * @param pafViewGroupMap
	 * @return
	 */
	public static Map<String, PafViewTreeItem> convertPafViewGroups(
			Map<String, PafViewGroup> pafViewGroupMap) {

		Map<String, PafViewTreeItem> pafViewTreeItemMap = new HashMap<String, PafViewTreeItem>();

		if (pafViewGroupMap != null && pafViewGroupMap.size() > 0) {

			for (String key : pafViewGroupMap.keySet()) {

				logger.debug("Populating map with key : " + pafViewGroupMap.get(key));

				PafViewGroup pafViewGroup = pafViewGroupMap.get(key);

				/*if paf view group is not null, create old style of paf view tree item group, populate
				 * with new view group data, set as a group, then create children
				 * 
				 */
				if (pafViewGroup != null) {

					PafViewTreeItem pafViewTreeItemGroup = new PafViewTreeItem();
					pafViewTreeItemGroup.setLabel(pafViewGroup.getName());
					pafViewTreeItemGroup.setDesc(pafViewGroup.getDesc());
					pafViewTreeItemGroup.setGroup(true);

					List<PafViewTreeItem> pafViewTreeItemList = new ArrayList<PafViewTreeItem>();

					//loop over children and create new pafViewTreeItem's
					if( pafViewGroup.getPafViewGroupItems() != null ) {
						for (PafViewGroupItem pafViewGroupItem : pafViewGroup
								.getPafViewGroupItems()) {
	
							PafViewTreeItem pafViewTreeItem = new PafViewTreeItem();
							pafViewTreeItem.setLabel(pafViewGroupItem.getName());
							pafViewTreeItem
									.setGroup(pafViewGroupItem.isViewGroup());
	
							pafViewTreeItemList.add(pafViewTreeItem);
	
						}
						//set new items to parent group
						pafViewTreeItemGroup.setItems(pafViewTreeItemList
								.toArray(new PafViewTreeItem[0]));

						//add to map
						pafViewTreeItemMap.put(key, pafViewTreeItemGroup);
					}
				}

			}

			//if number of view tree items is greater than 0
			if (pafViewTreeItemMap.size() > 0) {

				//loop over values and create children
				for (PafViewTreeItem pafViewTreeItemGroup : pafViewTreeItemMap
						.values()) {

					PafViewTreeItem[] items = pafViewTreeItemGroup.getItems();

					if (items != null) {

						for (int t = 0; t < items.length; t++) {

							items[t] = createPafViewTreeItems(items[t],
									pafViewTreeItemMap);

						}

					}

				}

			}
		}

		return pafViewTreeItemMap;
		
	}

	/**
	 * 
	 *	Recursively creates PafViewTreeItem with children from map passed in
	 *
	 * @param item
	 * @param pafViewTreeItemMap
	 * @return
	 */
	private static PafViewTreeItem createPafViewTreeItems(PafViewTreeItem item, Map<String, PafViewTreeItem> pafViewTreeItemMap) {
		
		PafViewTreeItem returnedItem = item;
		
		//if item passed in is a group and is in the map
		if ( item.isGroup() && pafViewTreeItemMap.containsKey(item.getLabel())) {
			
			try {
				
				//get item from map and clone
				returnedItem = (PafViewTreeItem) pafViewTreeItemMap.get(item.getLabel()).clone();
								
				//get children from cloned item				
				PafViewTreeItem[] children = returnedItem.getItems();
			
				//if children exists, try to clone them as well
				if ( children != null) {					
					
					for (int i = 0; i < children.length; i++ ) {
						
						children[i] = createPafViewTreeItems(children[i], pafViewTreeItemMap);
					}

				}
				
			} catch (CloneNotSupportedException e) {
				//should never happen
			}
			
		} 
		
		return returnedItem;
	}
	
}
