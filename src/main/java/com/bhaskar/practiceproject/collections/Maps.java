/**
 * 
 */
package com.bhaskar.practiceproject.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhaskara S
 *
 */
public class Maps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> testMap = new HashMap<>();
		testMap.put(1, "bhaskar");
		testMap.put(2, "bhaskar1");
		testMap.put(3, "bhaskar3");
		testMap.put(45, "flash");
		testMap.put(34, "barry");
		testMap.put(34, "barryflash");

		// Elements can traverse in any order
//		for(Map.Entry<Integer, String> m : testMap.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}

		// sorting elements by key using comparator comparingByKey()
//		testMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		//sorting elements using reverseOrder y using Comparator.reverseOrder
//		testMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		//sorting elements by value
//		testMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
		//for looping all the values
//		testMap.values().forEach(System.out::println);
		

		//for looping both key and value using keySet
//		testMap.keySet().forEach(i -> System.out.println(i + "-" + testMap.get(i)));
		System.out.println(testMap);
	}

}
