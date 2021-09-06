/**
 * 
 */
package com.bhaskar.practiceproject.interviewquestions;

import java.util.Scanner;

/**
 * @author Bhaskara S
 *
 */
public class CalculateCarDistance {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Accept value for n1");
		int n1 = sc.nextInt();
		System.out.println("Accept value for n2");
		int n2 = sc.nextInt();
		System.out.println("Accept value for X");
		int x = sc.nextInt();
		sc.close();
		int first = x,second = 0, i;
		for(i = 1;i<=1000;i++) {
			first +=n1;
			second +=n2;
			if(second > first) {
				break;
			}
			if(i == 1000) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		System.out.println(i);
		
	}
}
