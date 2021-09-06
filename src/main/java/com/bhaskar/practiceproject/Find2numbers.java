/**
 * 
 */
package com.bhaskar.practiceproject;

import java.util.Arrays;

/**
 * @author Bhaskara S
 *
 */
public class Find2numbers {

	public static void main(String args[]) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 8;
		Arrays.sort(arr);
		int l = 0;
		int h = arr.length - 1;
		
		while (l<h) {
			if(arr[l] + arr[h] == sum 	) {
				System.out.println(arr[l] + " " + arr[h]);
				break;
			}else if(arr[l] + arr[h] < sum) {
				l++;
			}else {
				h--;
			}
		}
		
	}
}
