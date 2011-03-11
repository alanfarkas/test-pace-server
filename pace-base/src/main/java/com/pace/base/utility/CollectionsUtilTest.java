package com.pace.base.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.pace.base.project.excel.PafExcelValueObject;

import junit.framework.TestCase;

public class CollectionsUtilTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCreateMapFromLists() {

		List<String> keyList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		
		keyList.add("key1");
		keyList.add("key2");
		keyList.add("key3");
		
		valueList.add("value1");
		valueList.add("value2");
		valueList.add("value3");
		
		assertEquals(keyList.size(), valueList.size());
		
		Map<String, List<String>> map = CollectionsUtil.createMapFromLists(keyList, valueList);
		
		assertNotNull(map);
		assertEquals(3, map.size());
		
		keyList.remove(1);
		keyList.add(1, null);
		
		map.clear();
		map = CollectionsUtil.createMapFromLists(keyList, valueList);
		
		assertNotNull(map);
		assertEquals(2, map.size());
		
		List<String> testList1 = map.get("key1");
		
		assertNotNull(testList1);
		assertEquals(2, testList1.size());
		assertEquals("value1", testList1.get(0));
		assertEquals("value2", testList1.get(1));
		
		List<String> testList2 = map.get("key3");
		
		assertNotNull(testList2);
		assertEquals(1, testList2.size());
		assertEquals("value3", testList2.get(0));
		
		keyList.remove(1);
		keyList.add(1, "");
		
		map.clear();
		map = CollectionsUtil.createMapFromLists(keyList, valueList);
		
		assertNotNull(map);
		assertEquals(2, map.size());
		
		testList1 = map.get("key1");
		
		assertNotNull(testList1);
		assertEquals(2, testList1.size());
		assertEquals("value1", testList1.get(0));
		assertEquals("value2", testList1.get(1));

		
		testList2 = map.get("key3");
		
		assertNotNull(testList2);
		assertEquals(1, testList2.size());
		assertEquals("value3", testList2.get(0));
		
		List<Integer> valueIntList = new ArrayList<Integer>();
		
		Map<String, List<Integer>> mapInt = null;
		
		try {
				
			mapInt = CollectionsUtil.createMapFromLists(keyList, valueIntList);
				
			fail("Should have thrown a runtime excelption");
			
		} catch (RuntimeException re) {
			
		}
		
		valueIntList.add(1);
		valueIntList.add(2);
		valueIntList.add(3);
		
		mapInt = CollectionsUtil.createMapFromLists(keyList, valueIntList);
		
		assertNotNull(mapInt);
		assertEquals(2, mapInt.size());
		
		List<Integer> testIntList1 = mapInt.get("key1");
		
		assertNotNull(testIntList1);
		assertEquals(2, testIntList1.size());
		assertEquals(Integer.valueOf(1), testIntList1.get(0));
		assertEquals(Integer.valueOf(2), testIntList1.get(1));
		
		List<Integer> testIntList2 = mapInt.get("key3");
		
		assertNotNull(testIntList2);
		assertEquals(1, testIntList2.size());
		assertEquals(Integer.valueOf(3), testIntList2.get(0));
		
		List<PafExcelValueObject> testExcelKeyList1 = new ArrayList<PafExcelValueObject>();
		
		PafExcelValueObject key1PEVO = PafExcelValueObject.createFromString("key1");
		PafExcelValueObject key3PEVO = PafExcelValueObject.createFromString("key3");
		
		testExcelKeyList1.add(key1PEVO);
		testExcelKeyList1.add(PafExcelValueObject.createBlank());
		testExcelKeyList1.add(key3PEVO);
		
		List<PafExcelValueObject> testExcelValueList1 = new ArrayList<PafExcelValueObject>();
		
		testExcelValueList1.add(PafExcelValueObject.createFromString("value1"));
		testExcelValueList1.add(PafExcelValueObject.createFromString("value2"));
		testExcelValueList1.add(PafExcelValueObject.createFromString("value3"));
		
		Map<PafExcelValueObject, List<PafExcelValueObject>> mapExcelValueObject = CollectionsUtil.createMapFromLists(testExcelKeyList1, testExcelValueList1);
				
		assertNotNull(mapExcelValueObject);
		assertEquals(2, mapExcelValueObject.size());
		
		List<PafExcelValueObject> excelList1 = mapExcelValueObject.get(key1PEVO);
		
		assertNotNull(excelList1);
		assertEquals(2, excelList1.size());
		assertEquals("value1", excelList1.get(0).getValueAsString());
		assertEquals("value2", excelList1.get(1).getValueAsString());
		
		List<PafExcelValueObject> excelList2 = mapExcelValueObject.get(key3PEVO);
		
		assertNotNull(excelList2);
		assertEquals(1, excelList2.size());
		assertEquals("value3", excelList2.get(0).getValueAsString());	
		
		
	}

}
