/**
 * 
 */
package com.bhaskar.practiceproject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhaskara S
 *
 */
public class TestOrCondition {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 0);
		map.put("b", 1);
		map.put("c", 0);
		map.put("d", 0);
		
		boolean flag = false;
		for(Map.Entry<String, Integer> result : map.entrySet()) {
			flag |= result.getValue() == 0 ? false : true;
		}
		System.out.println(flag);
	}
}
