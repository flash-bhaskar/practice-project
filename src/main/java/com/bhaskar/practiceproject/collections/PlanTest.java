/**
 * 
 */
package com.bhaskar.practiceproject.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhaskara S
 *
 */
public class PlanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Object> testMap = new HashMap<>();
		testMap.put("youtube", 2);
		testMap.put("logo", false);
		testMap.put("facebook", 1);
		
		if((boolean)testMap.get("logo")) {
			System.out.println("done");
		}else {
			System.out.println("nothing");
		}
	}

}
