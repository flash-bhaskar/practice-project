package com.bhaskar.practiceproject.collections;

import java.util.Arrays;

/**
 * @author Bhaskara S
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {20,10,30,100,50,60,67,172,1982,19283,2};
		
		for(int j=1;j<arr.length;j++) {
			int key = arr[j];
			int i = j-1;
			while(i>=0 && arr[i] > key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
		
		for(int i=0; i< arr.length; i++)
			System.out.println(arr[i]);
	}

}
