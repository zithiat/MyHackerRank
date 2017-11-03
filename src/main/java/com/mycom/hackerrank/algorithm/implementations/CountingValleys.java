/*
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class CountingValleys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 8
		 * UDDDUDUU
		 * ==> 1
		 * 
		 * 12
		 * DDUUDDUDUUUD
		 * ==> 2
		 */
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		String s = in.next();
		int updown = 0;
		int count = 0;
		for (char c : s.toCharArray()) {
//			n--;
			if (c == 'U') {
				updown++;
			} else if (c == 'D') {
				updown--;
			}
			if (updown == 0 && c == 'U') {
				count++;
			}
//			if (n-- == 0) {
//				break;
//			}
		}
		System.out.println(count);
	}
}
