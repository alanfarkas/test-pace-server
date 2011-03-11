/*
 *	File: @(#)TestPafBaseMemberTree.java 	Package: com.pace.base.mdb 	Project: Essbase Provider
 *	Created: Aug 4, 2005  				By: Alan Farkas
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
package com.pace.mdb.essbase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import com.pace.base.PafErrSeverity;
import com.pace.base.PafException;
import com.pace.base.mdb.*;
import com.pace.base.mdb.PafDimTree.LevelGenType;

/**
 * Test the PafDimTree object
 *
 * @version	x.xx
 * @author Alan Farkas
 *
 */
public class PafDimTreeTest1 extends TestCase {

	final static String rootKey = "Product";
	final static String[] parentChild = {"Product.DPT110", "DPT110.CLS110-00", 
			"DPT110.CLS110-10", "DPT110.CLS110-20", "Product.DPT210",
			"DPT210.CLS210-10", "DPT210.CLS210-20"};
	final static String[] aliasTableNames = {"default"};
	private Properties props = testCommonParms.getConnectionProps();
	private Properties sampleBasicProps = testCommonParms.getConnectionSampleBasicProps();
	private Properties titanProps = testCommonParms.getConnectionProps();
	private static Logger logger = Logger.getLogger("PafDimTreeTest");

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.PafBaseTree()'
	 */
	public void testPafBaseTree() {
		
		boolean isSuccess = false;
		String newRootKey = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			PafBaseMember root = new PafBaseMember(rootKey);
			logger.info("--Test with key set to: " + root.getKey());
			PafBaseTree pafBaseTree = new PafBaseTree(root, aliasTableNames);
			PafBaseMember newRoot = pafBaseTree.getRootNode();
			newRootKey = newRoot.getKey();
			logger.info("--Root member created with key added: " + newRootKey);
			isSuccess = newRootKey.equals(rootKey);
			
		} catch (Exception e) {
			logger.info("Java Exception: " + e.getMessage());			
		} finally {
			try {
				//assertTrue(isSuccess);
			} finally {
				System.out.print(this.getName());
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
			}
		}
	}
	
	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getRootNode()'
	 */
	public void testgetRootNode() {
	
		boolean isSuccess = false;
		String newRootKey = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			PafBaseMember root = new PafBaseMember(rootKey);
			logger.info("--Verifying root key value of: " + rootKey);
			PafBaseTree pafBaseTree = new PafBaseTree(root, aliasTableNames);
			PafBaseMember newRoot = pafBaseTree.getRootNode();
			newRootKey = newRoot.getKey();
			logger.info("--Root member retrieved with key of: " + newRootKey);
			isSuccess = newRootKey.equals(rootKey);	
		} catch (Exception e) {
			logger.info("\n*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				//assertTrue(isSuccess);
			} finally {
				System.out.print(this.getName());
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
			}
		}
	}


	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.AddChild(String, PafBaseMember)'
	 */
	public void testAddChild() {

		boolean isSuccess = true;
		PafBaseMember newChild = null,  newPafBaseMember = null;
		String parentKey = null, childKey = null, newParentKey = null, newChildKey = null;

		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new tree
			PafBaseMember root = new PafBaseMember(rootKey);
			PafBaseTree pafBaseTree = new PafBaseTree(root, aliasTableNames);
			logger.info("New PafBaseTree created with a root of: " + rootKey);
			
			// Add children
			ArrayList<String[]> splitKey = new ArrayList<String[]>();
			for (int i = 0; i < parentChild.length; i++) {
				splitKey.add(parentChild[i].split("\\."));
				parentKey = splitKey.get(i)[0];
				childKey = splitKey.get(i)[1];
				logger.info("-- Adding child: " + childKey + "\tto  Parent: " + parentKey);
				newChild = new PafBaseMember(childKey);
				pafBaseTree.addChild(parentKey, newChild);
				newPafBaseMember = pafBaseTree.getMember(childKey);
				if (newPafBaseMember == null) {
					isSuccess = false;
					logger.info("-- Can't find: " + childKey);
				}
			}
						
			// Verify children
			logger.info("\nVerifying Children:");
			for (int i = 0; i < parentChild.length; i++) {
				parentKey = splitKey.get(i)[0];
				childKey = splitKey.get(i)[1];
				System.out.print("-- checking member: " + childKey);
				newPafBaseMember = pafBaseTree.getMember(childKey);
				if (newPafBaseMember == null) {
					isSuccess = false;
					logger.info("-- Can't find: " + childKey);
				} else {
					newChildKey = newPafBaseMember.getKey();
					if (!childKey.contentEquals(newChildKey)) {
						isSuccess = false;
						logger.info("   -- INCORRECT CHILD KEY VALUE OF: " + newChildKey);
					} else {
						newParentKey = newPafBaseMember.getParent().getKey();
						if (!parentKey.contentEquals(newParentKey)) {
							isSuccess = false;
							logger.info("   -- INCORRECT PARENT KEY VALUE OF: " + newParentKey);			
						} else {
							logger.info("\tVERIFIED");
						}
					}
				}
			}
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				//assertTrue(isSuccess);
			} finally {
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
			}
		}
	}


	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.AddChildByName(String, String)'
	 */
	public void testAddChildByName() {

	}


	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getCumMembers'
	 */
	public void testGetCumMembers() {
		
		boolean isSuccess = true;
		int level = 0;
		List<PafDimMember> members = null;
		String cumMbr = null;
		String branch = "Time";
		EsbMetaData esbMetaData = null;
		PafBaseTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get cumulative members for selected member
			cumMbr = "Jul";			
			logger.info("-- Getting cumulative members of member: [" + cumMbr + "]");
			members = pafBaseTree.getCumMembers(cumMbr);
			logger.info(Arrays.deepToString(members.toArray()));
			
			// Get cumulative members for selected member
			cumMbr = "Jul";	
			level = 1;
			logger.info("-- Getting cumulative members of member: [" + cumMbr + "] at level: " + level);
			members = pafBaseTree.getCumMembers(cumMbr, level);
			logger.info(Arrays.deepToString(members.toArray()));

			// Get cumulative members for selected member
			cumMbr = "WK27";			
			level = 2;
			logger.info("-- Getting cumulative members of member: [" + cumMbr + "] at level: " + level);
			members = pafBaseTree.getCumMembers(cumMbr, level);
			logger.info(Arrays.deepToString(members.toArray()));

							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getMemberNames()'
	 */
	public void testGetMemberNames() {
		
		boolean isSuccess = true;
		
		PafBaseTree pafBaseTree = null;
		PafBaseMember newChild = null,  newPafBaseMember = null;
		String parentKey = null, childKey = null;
		IMdbMetaData esbMetaData = null;

		List<String> memberList = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new tree
//			PafBaseMember root = new PafBaseMember(rootKey);
//			PafBaseMemberProps memberProps = new PafBaseMemberProps();
//			root.setMemberProps(memberProps);
//			memberProps.setGenerationNumber(1);
//			memberProps.setLevelNumber(1);
//			PafBaseTree pafBaseTree = new PafBaseTree(root, aliasTableNames);
//			logger.info("New PafBaseTree created with a root of: " + rootKey);
//			
//			// Add children
//			ArrayList<String[]> splitKey = new ArrayList<String[]>();
//			for (int i = 0; i < parentChild.length; i++) {
//				splitKey.add(parentChild[i].split("\\."));
//				parentKey = splitKey.get(i)[0];
//				childKey = splitKey.get(i)[1];
//				logger.info("-- Adding child: " + childKey + "\tto  Parent: " + parentKey);
//				newChild = new PafBaseMember(childKey);
//				pafBaseTree.addChild(parentKey, newChild);
//				newPafBaseMember = pafBaseTree.getMember(childKey);
//				if (newPafBaseMember == null) {
//					isSuccess = false;
//					logger.info("-- Can't find: " + childKey);
//				}
//			}	
			
			
			// Create new instance of EsbMetaData
			esbMetaData = new EsbMetaData(props);
			
			// Fill PafBaseMember Tree
			pafBaseTree = esbMetaData.getBaseDimension("DIV01");
			
			// Traverse PafBaseTree (Post Order)
			logger.info("\nTraversing Tree (Post Order):");
			memberList = pafBaseTree.getMemberNames(TreeTraversalOrder.POST_ORDER);
			for (String member:memberList) {
				logger.info (member);
			}
						
			// Traverse PafBaseTree down to level 1(Post Order)
			logger.info("\nTraversing Tree down to level 1 (Post Order):");
			memberList = pafBaseTree.getMemberNames(TreeTraversalOrder.POST_ORDER, 1);
			for (String member:memberList) {
				logger.info (member);
			}

			// Traverse PafBaseTree (Pre Order)
			logger.info("\nTraversing Tree (Pre Order):");
			memberList = pafBaseTree.getMemberNames(TreeTraversalOrder.PRE_ORDER);
			for (String member:memberList) {
				logger.info (member);
			}
			
		} catch (PafException pfe) {
			logger.info("\n*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("\n*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getMemberNames()'
	 */
	public void testGetMemberAliases() {
		
		boolean isSuccess = true;
		
		String branch = "DIV01";
		PafBaseTree pafBaseTree = null;
		EsbMetaData esbMetaData = null;

		List<String> memberList = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new instance of EsbMetaData
			esbMetaData = new EsbMetaData(props);
			
			// Fill PafBaseMember Tree
			logger.info("\nCreating new paf member tree for branch: " + branch);
			pafBaseTree = esbMetaData.getBaseDimension("DIV01");
			
			// Get member aliases
			logger.info("\nGetting default alias names (Post Order)");
			memberList = pafBaseTree.getMemberAliases(TreeTraversalOrder.POST_ORDER);
			for (String member:memberList) {
				logger.info (member);
			}
						
			// Get member aliases
			logger.info("\nGetting aliases for alias table [test1] (Post Order)");
			memberList = pafBaseTree.getMemberAliases(TreeTraversalOrder.POST_ORDER, "Test1");
			for (String member:memberList) {
				logger.info (member);
			}
						
			// Traverse PafBaseTree down to level 1(Post Order)
			logger.info("\nTraversing Tree down to level 1 (Post Order):");
			memberList = pafBaseTree.getMemberAliases(TreeTraversalOrder.POST_ORDER, 1);
			for (String member:memberList) {
				logger.info (member);
			}

			// Traverse PafBaseTree (Pre Order)
			logger.info("\nTraversing Tree (Pre Order):");
			memberList = pafBaseTree.getMemberAliases(TreeTraversalOrder.PRE_ORDER);
			for (String member:memberList) {
				logger.info (member);
			}
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				if (isSuccess) {
					logger.info(this.getName() + " - Successful");
					logger.info("***************************************************\n");
				}
				else {
					logger.info(this.getName() + " - Failed");			
					logger.info("***************************************************\n");
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getDescendants'
	 */
	public void testGetDescendants() {
		
		boolean isSuccess = true;
		int genLevel = 0;
		List<PafDimMember> members = null;
		String branch = "Product";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(titanProps);
			
			// Get Essbase "Product" dimension
			logger.info("-- Getting Product hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
			
			// Get all descendants for a specific branch down to level 0
			branch = "DIV01";
			genLevel = 0;
			members = pafBaseTree.getDescendants(branch);
			logger.info("Displaying descendants of " + branch + " down to level " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get all descendants for a specific branch down to level 1
			branch = "DIV01";
			genLevel = 1;
			members = pafBaseTree.getDescendants(branch, LevelGenType.LEVEL, genLevel);
			logger.info("Displaying descendants of " + branch + " down to level " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get all descendants for a specific branch at level 0
			branch = "DIV01";
			genLevel = 0;
			members = pafBaseTree.getMembersAtLevel(branch, genLevel);
			logger.info("Displaying descendants of " + branch + " at level " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get all descendants for a specific branch at generation 4
			branch = "DIV01";
			genLevel = 4;
			members = pafBaseTree.getMembersAtGen(branch, genLevel);
			logger.info("Displaying descendants of " + branch + " at generation " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get idescendants for a specific branch at generation 4
			branch = "DIV01";
			genLevel = 4;
			members = pafBaseTree.getIDescendants(branch, LevelGenType.LEVEL, genLevel);
			logger.info("Displaying descendants of " + branch + " at generation " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}

			// Get all children for a specific member
			branch = "Dir02";
			members = pafBaseTree.getChildren(branch);
			logger.info("Displaying children of " + branch);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get all children for a member that has no children
			branch = "CLS110-10";
			members = pafBaseTree.getChildren(branch);
			logger.info("Displaying children of " + branch);
			if (members.size() == 0) {
				logger.info("No children found for member [" + branch + "]");
			} else {
				String errMsg = "No children test failed";
				logger.error(errMsg);
				PafException pfe = new PafException(errMsg, PafErrSeverity.Error);
				throw pfe;
			}
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/**
	 * Test method for {@link com.pace.base.mdb.PafDimTree#getDescendants(String, LevelGenType, int)}.
	 */
	public void testGetDescendants1() {

		boolean isSuccess = false;
		
		String dimName = "Product";
		String branch = "TotProd";
		int levelGen = 3, expectedMemberCount = 9;
		LevelGenType levelGenType = LevelGenType.GEN;
		
		List<PafDimMember> members = null;
		EsbMetaData esbMetaData = null;
		PafDimTree dimTree = null;

		try {
			logger.info("");
			logger.info("Running unit test: testGetDescendants(" + branch
					+ ", " + levelGenType + ", " + levelGen + ")");
			
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(titanProps);
			
			// Get selected branch
			logger.info("-- Getting " + dimName + " hierarchy");
			dimTree = esbMetaData.getBaseDimension(branch, 0);
			
			// Get descendants down to specified level/generation
			logger.info("-- Getting descendants of " + branch); 
			members = dimTree.getDescendants(branch, levelGenType, levelGen);

			// Display descendants
			testCommonParms.displayMemberList(members, logger);
			
			// Validate number of members returned
			if (members.size() == expectedMemberCount) {
				isSuccess = true;
			}
		} catch (Exception ex) {
			logger.error("Java Exception: " + ex.getMessage());	
		} finally {
			assertTrue(isSuccess);
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getDescendantsPopDim'
	 */
	public void testGetDescendantsPopDim() {
		
		boolean isSuccess = true;
		short genLevel = 0;
		List<PafDimMember> members = null;
		String branch = "Population";
		EsbMetaData esbMetaData = null;
		PafBaseTree pafDimTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(sampleBasicProps);
			
			// Get Essbase "Product" dimension
			logger.info("-- Getting Population hierarchy");
			pafDimTree = esbMetaData.getBaseDimension(branch, 0);
			
			// Get all descendants for a specific branch down to level 0
			genLevel = 0;
			members = pafDimTree.getDescendants(branch);
			logger.info("Displaying descendants of " + branch + " down to level " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafDimTree = null;
				}
			}
		}
	}


	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getIPeers'
	 */
	public void testGetIPeers() {
		
		boolean isSuccess = true;
		List<PafDimMember> members = null;
		String branch = "Time";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peers for selected member
			String peerMbr = "May";			
			logger.info("-- Getting all peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getIPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));

			// Get peers for selected member
			peerMbr = "WK27";			
			logger.info("-- Getting all peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getIPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getPeers'
	 */
	public void testGetPeers() {
		
		boolean isSuccess = true;
		List<PafDimMember> members = null;
		String branch = "Time";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peers for selected member
			String peerMbr = "May";			
			logger.info("-- Getting exclusive peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));

			// Get peers for selected member
			peerMbr = "WK27";			
			logger.info("-- Getting exclusive peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}
	
	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getPeer1'
	 */
	public void testGetPeer1() {
		
		boolean isSuccess = true;
		String branch = "Time";
		String member = "May";	
		int index = 4;
		String expectedPeer = "Sep";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peer for selected member
			logger.info("-- Getting peer #" + index + " of member: [" + member + "]");
			String peer = pafBaseTree.getPeer(member, index).getKey();
			logger.info("-- " + peer);

			// Check results
			if (!peer.equalsIgnoreCase(expectedPeer)) {
				isSuccess = false;
			}
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getPeer2'
	 */
	public void testGetPeer2() {
		
		boolean isSuccess = true;
		String branch = "Time";
		String member = "May";	
		int index = -3;
		String expectedPeer = "Feb";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peer for selected member
			logger.info("-- Getting peer #" + index + " of member: [" + member + "]");
			String peer = pafBaseTree.getPeer(member, index).getKey();
			logger.info("-- " + peer);

			// Check results
			if (!peer.equalsIgnoreCase(expectedPeer)) {
				isSuccess = false;
			}
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getPeer3'
	 */
	public void testGetPeer3() {
		
		boolean isSuccess = true;
		String branch = "Time";
		String member = "May";	
		int index = 0;
		String expectedPeer = "May";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peer for selected member
			logger.info("-- Getting peer #" + index + " of member: [" + member + "]");
			String peer = pafBaseTree.getPeer(member, index).getKey();
			logger.info("-- " + peer);

			// Check results
			if (!peer.equalsIgnoreCase(expectedPeer)) {
				isSuccess = false;
			}
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getPeer4'
	 */
	public void testGetPeer4() {
		
		boolean isSuccess = true;
		String branch = "Time";
		String member = "May";	
		int index = -14;
		boolean wrap = true;
		String expectedPeer = "Mar";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peer for selected member
			logger.info("-- Getting peer #" + index + " of member: [" + member + "]");
			logger.info("-- Wrap is set to: " + wrap);
			String peer = pafBaseTree.getPeer(member, index, wrap).getKey();
			logger.info("-- " + peer);

			// Check results
			if (!peer.equalsIgnoreCase(expectedPeer)) {
				isSuccess = false;
			}
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getPeer5'
	 */
	public void testGetPeer5() {
		
		boolean isSuccess = true;
		String branch = "Time";
		String member = "May";	
		int index = -14;
		boolean wrap = false;
		String expectedPeer = "NULL";
		String peer = null;
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peer for selected member
			logger.info("-- Getting peer #" + index + " of member: [" + member + "]");
			logger.info("-- Wrap is set to: " + wrap);
			PafDimMember peerMbr = pafBaseTree.getPeer(member, index, wrap);
			if (peer != null) {
				peer = peerMbr.getKey();
			} else {
				peer = "NULL";
			}
			logger.info("-- " + peer);

			// Check results
			if (!peer.equalsIgnoreCase(expectedPeer)) {
				isSuccess = false;
			}
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getPeer6'
	 */
	public void testGetPeer6() {
		
		boolean isSuccess = true;
		String branch = "Time";
		String member = "May";	
		int index = 14;
		boolean wrap = true;
		String expectedPeer = "Jul";
		String peer = null;
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peer for selected member
			logger.info("-- Getting peer #" + index + " of member: [" + member + "]");
			logger.info("-- Wrap is set to: " + wrap);
			PafDimMember peerMbr = pafBaseTree.getPeer(member, index, wrap);
			if (peerMbr != null) {
				peer = peerMbr.getKey();
			} else {
				peer = "NULL";
			}
			logger.info("-- " + peer);

			// Check results
			if (!peer.equalsIgnoreCase(expectedPeer)) {
				isSuccess = false;
			}
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getPeer7'
	 */
	public void testGetPeer7() {
		
		boolean isSuccess = true;
		String branch = "Time";
		String member = "May";	
		int index = 14;
		boolean wrap = false;
		String expectedPeer = "NULL";
		String peer = null;
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peer for selected member
			logger.info("-- Getting peer #" + index + " of member: [" + member + "]");
			logger.info("-- Wrap is set to: " + wrap);
			PafDimMember peerMbr = pafBaseTree.getPeer(member, index, wrap);
			if (peer != null) {
				peer = peerMbr.getKey();
			} else {
				peer = "NULL";
			}
			logger.info("-- " + peer);

			// Check results
			if (!peer.equalsIgnoreCase(expectedPeer)) {
				isSuccess = false;
			}
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getILPeers'
	 */
	public void testGetILPeers() {
		
		boolean isSuccess = true;
		List<PafDimMember> members = null;
		String branch = "Time";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peers for selected member
			String peerMbr = "May";			
			logger.info("-- Getting inclusive left peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getILPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));

			// Get peers for selected member
			peerMbr = "WK27";			
			logger.info("-- Getting inclusive left peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getILPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getLPeers'
	 */
	public void testGetLPeers() {
		
		boolean isSuccess = true;
		List<PafDimMember> members = null;
		String branch = "Time";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peers for selected member
			String peerMbr = "May";			
			logger.info("-- Getting exclusive left peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getLPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));

			// Get peers for selected member
			peerMbr = "WK27";			
			logger.info("-- Getting exclusive left peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getLPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getIRPeers'
	 */
	public void testGetIRPeers() {
		
		boolean isSuccess = true;
		List<PafDimMember> members = null;
		String branch = "Time";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peers for selected member
			String peerMbr = "May";			
			logger.info("-- Getting inclusive right peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getIRPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));

			// Get peers for selected member
			peerMbr = "WK27";			
			logger.info("-- Getting inclusive right peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getIRPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getRPeers'
	 */
	public void testGetRPeers() {
		
		boolean isSuccess = true;
		List<PafDimMember> members = null;
		String branch = "Time";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Time" dimension
			logger.info("-- Getting Time hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
						
			// Get peers for selected member
			String peerMbr = "May";			
			logger.info("-- Getting exclusive right peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getRPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));

			// Get peers for selected member
			peerMbr = "WK27";			
			logger.info("-- Getting exclusive right peers of member: [" + peerMbr + "]");
			members = pafBaseTree.getRPeers(peerMbr);
			logger.info(Arrays.deepToString(members.toArray()));
							
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getSimpleVersion'
	 */
	public void testGetSimpleVersion() {
		
		boolean isSuccess = true;

		String validationErrors = "";
		final String branch = "DIV01";		
		EsbMetaData esbMetaData = null;
		PafBaseTree pafBaseTree = null;
		PafSimpleBaseTree simpleBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get members of Essbase "Product" dimension
			logger.info("-- Getting Product hierarchy - Branch: " + branch);
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
			
			// Get simple version of PafBaseTree
			//logger.info("Displaying descendants of " + branch + " down to level " + genLevel + ":" + "\n\n" + pafBaseTree.toString());
			
			// Get simple version of PafBaseTree
			simpleBaseTree = pafBaseTree.getSimpleVersion();
			
			// Validate PafSimpleBaseTree to PafBaseTree
			logger.info("-- Validating PafSimpleBaseTree...");
			validationErrors = validateSimpleBaseTree(simpleBaseTree, pafBaseTree);
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				if (validationErrors.length() > 0) {
					isSuccess = false;
					logger.info("Validation Error(s) Encountered:\r" + validationErrors);
				}
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/**
	 *	Validate Paf Simple Tree
	 *
	 * @param simpleBaseTree PafSimpleBaseTree object to validate
	 * @param pafBaseTree PafBaseTree object to validate against
	 * @return String containing a list any errors encountered
	 * @throws PafException 
	 */
	private String validateSimpleBaseTree(PafSimpleBaseTree simpleBaseTree, PafBaseTree pafBaseTree) throws PafException {

//		int memberCount = 0;
		String validationErrors = "";
		String[] aliasTableNames = null, simpleAliasTableNames = null;
//		String[] simpleBaseMemberKeys = null;
		PafBaseMember memberRoot = pafBaseTree.getRootNode();
		String simpleRootKey = simpleBaseTree.getRootKey();
//		PafSimpleDimMember[] simpleBaseMemberObjects = null;
		Map<String, PafSimpleBaseMember> simpleBaseMemberMap = new HashMap<String, PafSimpleBaseMember>();

		
		// Validate Alias Table Names
		logger.info("-- Validating Alias Table Names");		
		aliasTableNames = pafBaseTree.getAliasTableNames();
		simpleAliasTableNames = simpleBaseTree.getAliasTableNames();
		if (aliasTableNames.length == simpleAliasTableNames.length) {
			for (int i = 0; i < aliasTableNames.length; i++) {
				if (!simpleAliasTableNames[i].equals(aliasTableNames[i])) {
					validationErrors += "Alias table names don't match\n";			
				}	
			} 
		} else {
			validationErrors += "Number of alias table names doesn't match\n";			
		}

		
//		// Validate Member Lookup
//		logger.info("-- Validating Member Lookup Tables");		
//		memberCount = pafBaseTree.getMemberKeys().length;
//		if (simpleBaseTree.getMemberKeys().length == memberCount) {
//			simpleBaseMemberKeys = simpleBaseTree.getMemberKeys();
//			simpleBaseMemberObjects = simpleBaseTree.getMemberObjects();
//			// Validate that each member key appears in both trees and points to
//			// equivalent nodes within the PafBaseTree and PafSimpleBaseTree structures
//			for (int i = 0; i < memberCount; i++) {
//				String key = simpleBaseMemberKeys[i];
//				PafSimpleBaseMember simpleBaseMember = (PafSimpleBaseMember) simpleBaseMemberObjects[i];
//				PafBaseMember pafBaseMember = pafBaseTree.getMember(key);
//				if (!pafBaseMember.getKey().equals(simpleBaseMember.getKey())) {
//					validationErrors += "Member values don't match\n";
//					break;
//					}
//				// Build simple member map
//				simpleBaseMemberMap.put(key, simpleBaseMember);			
//			}
//		} else {
//			validationErrors += "Member count doesn't match\n";
//		}
		
		
		// Validate Simple Tree Traversal
		logger.info("-- Validating Simple Tree Traversal");	
		simpleRootKey = simpleBaseTree.getRootKey();
		validationErrors += validateSimpleTreeTraversal(simpleRootKey, memberRoot, simpleBaseMemberMap);
		
		// Return any validation errors
		return validationErrors;
	
		
	}

	/**
	 *	Traverse Paf Simple Tree & Validate All Members
	 *
	 * @param simpleKey Key of SimplePafMember object to validate
	 * @param pafBaseMember PafBaseMember object to validate against
	 * @param simpleBaseMemberMap HashMap containing simple member lookup
	 * @return String containing a list any errors encountered
	 * @throws PafException 
	 */
	private String validateSimpleTreeTraversal(String simpleKey, PafBaseMember pafBaseMember, Map<String,PafSimpleBaseMember> simpleBaseMemberMap) throws PafException {

		String validationErrors = "";
		String memberKey = pafBaseMember.getKey();
		String childKey = null, parentKey =  null;

		PafBaseMember child = null;
		PafBaseMember parent = pafBaseMember.getParent();
		PafBaseMemberProps memberAttr = pafBaseMember.getMemberProps();
		PafSimpleBaseMember simpleBaseMember = simpleBaseMemberMap.get(simpleKey);
		PafSimpleBaseMemberProps simpleAttr = (PafSimpleBaseMemberProps) simpleBaseMember.getPafSimpleDimMemberProps();
		List <PafDimMember> children = pafBaseMember.getChildren();
		String simpleParentKey = simpleBaseMember.getParentKey();
		String[] simpleChildKeys = simpleBaseMember.getChildKeys();
		final String nullKey = "{NULL}";
			
		logger.info("Validating simple member: [" + simpleKey + "]");
		// Validate member key
		if (!memberKey.equals(simpleKey)) {
			validationErrors += "Member [" + memberKey + "] does not match corresponding simple tree member\n";
		}
				
		// Validate parent key
		if (parent != null) {
			parentKey = parent.getKey();
		} else {
			parentKey = nullKey;
		}
		if (simpleParentKey == null) {
			simpleParentKey = nullKey;
		}
		if (!parentKey.equals(simpleParentKey)) {
			validationErrors += "Parent [" + parentKey + "] does not match corresponding simple tree parent of "
									+ "[" + simpleParentKey + "]";
		}

		// Validate children keys
		if (children.size() == simpleChildKeys.length) {
			for (int i = 0; i < children.size(); i++) {
				child = (PafBaseMember) children.get(i);
				childKey = child.getKey();
				if (!childKey.equals(simpleChildKeys[i])) {
					validationErrors += "Child key for member [" + memberKey + "] doesn't match\n";		
				}	
			} 
		} else {
			validationErrors += "Number of children for member [" + memberKey + "] doesn't match\n";			
		}
		
		// Validate atribute object
		validationErrors += TestPafBaseMemberProps.validateSimpleProps(simpleAttr, memberAttr);
		
    	// Iterate through children	
	    for (int i = 0; i < children.size(); i++) {
			child = (PafBaseMember) children.get(i);
			validationErrors += validateSimpleTreeTraversal(simpleChildKeys[i], child, simpleBaseMemberMap);
    	}
    	
		// Return any validation errors
		return validationErrors;
	}

	public void testGetIChildren() {
		
		boolean isSuccess = true;
		List<PafDimMember> members = null;
		String branch = "Product";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Product" dimension
			logger.info("-- Getting Product hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 1);
			
			// Get children for a specific branch - no parentFirst property
			branch = "DIV01";
			logger.info("Displaying ichildren of [" + branch + "] with parentFirst set to null");
			members = pafBaseTree.getIChildren(branch);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get children for a specific branch - no parentFirst property
			logger.info("\n\nDisplaying ichildren of [" + branch + "] with parentFirst set to false");
			members = pafBaseTree.getIChildren(branch, false);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}

		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getDescendants'
	 */
	public void testGetIDescendants() {
		
		boolean isSuccess = true;
		short genLevel = 0;
		List<PafDimMember> members = null;
		String branch = "Product";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Product" dimension
			logger.info("-- Getting Product hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(branch, 0);
			
			// Get all idescendants for a specific branch down to level 0
			branch = "DIV01";
			genLevel = 0;
			logger.info("Displaying idescendants of " + branch + " down to level " + genLevel);
			members = pafBaseTree.getIDescendants(branch);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getMembersAtGen()'
	 */
	public void testGetMembersAtGen() {
		
		boolean isSuccess = true;
		short genLevel = 0;
		List<PafDimMember> members = null;
		String branch = "DIV01", root = "TotProd";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Product" dimension
			logger.info("-- Getting Product hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(root, 0);
			
			// Get all members for a specific branch at generation 2
			genLevel = 2;
			members = pafBaseTree.getMembersAtGen(branch, genLevel);
			logger.info("Displaying members of " + branch + " at generation " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get all descendants for a specific branch at generation 3
			genLevel = 3;
			members = pafBaseTree.getMembersAtGen(branch, genLevel);
			logger.info("Displaying members of " + branch + " at generation " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get all descendants for a specific branch at generation 4
			genLevel = 4;
			members = pafBaseTree.getMembersAtGen(branch, genLevel);
			logger.info("Displaying members of " + branch + " at generation " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get all descendants for a specific branch at generation 5
			genLevel = 5;
			members = pafBaseTree.getMembersAtGen(branch, genLevel);
			logger.info("Displaying members of " + branch + " at generation " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}

			// Get all descendants for a specific branch at generation 6
			genLevel = 6;
			members = pafBaseTree.getMembersAtGen(branch, genLevel);
			logger.info("Displaying members of " + branch + " at generation " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}

	/*
	 * Test method for 'com.pace.base.mdb.PafBaseTree.getMembersAtLevel()'
	 */
	public void testGetMembersAtLevel() {
		
		boolean isSuccess = true;
		short genLevel = 0;
		List<PafDimMember> members = null;
		String branch = "DIV01", root = "TotProd";
		EsbMetaData esbMetaData = null;
		PafDimTree pafBaseTree = null;
		
		logger.info("***************************************************");
		logger.info(this.getName() +  " - Test Started");
		try {
			// Create new EsbMetaData object
			logger.info("-- Creating new EsbMetaData object");
			esbMetaData = new EsbMetaData(props);
			
			// Get Essbase "Product" dimension
			logger.info("-- Getting Product hierarchy");
			pafBaseTree = esbMetaData.getBaseDimension(root, 0);
			
			// Get all members for a specific branch down at level 0
			genLevel = 0;
			members = pafBaseTree.getMembersAtLevel(branch, genLevel);
			logger.info("Displaying members of " + branch + " at level " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get all descendants for a specific branch at level 1
			genLevel = 1;
			members = pafBaseTree.getMembersAtLevel(branch, genLevel);
			logger.info("Displaying members of " + branch + " at level " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get all descendants for a specific branch at level 2
			genLevel = 2;
			members = pafBaseTree.getMembersAtLevel(branch, genLevel);
			logger.info("Displaying members of " + branch + " at level " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
			
			// Get all descendants for a specific branch at level 3
			genLevel = 3;
			members = pafBaseTree.getMembersAtLevel(branch, genLevel);
			logger.info("Displaying members of " + branch + " at level " + genLevel);
			for (PafDimMember member:members){
				int generation = member.getMemberProps().getGenerationNumber();
				for (int i = 0; i < generation; i++)
					System.out.print("\t");
				logger.info(member.getKey());
			}
		} catch (PafException pfe) {
			logger.info("*** " + pfe.getMessage() + " ***");
			isSuccess = false;
		} catch (Exception e) {
			logger.info("*** Java Exception: " + e.getMessage() + " ***");
			isSuccess = false;
		} finally {
			try {
				assertTrue(isSuccess);
			} finally {
				System.out.print("\n" + this.getName());
				if (isSuccess) {
					logger.info(" - Successful");
				}
				else {
					logger.info(" - Failed");			
				}
				try {
					// Disconnect from Essbase
					logger.info("\nDisconnecting.........");
					esbMetaData.disconnect();
				} catch (PafException pfe) {
					logger.info("*** " + pfe.getMessage() + " ***");
					isSuccess = false;
				} catch (Exception e) {
					logger.info("*** Java Exception: " + e.getMessage() + " ***");
					isSuccess = false;
				} finally {
					logger.info("***************************************************\n");
					esbMetaData = null;
					pafBaseTree = null;
				}
			}
		}
	}
}