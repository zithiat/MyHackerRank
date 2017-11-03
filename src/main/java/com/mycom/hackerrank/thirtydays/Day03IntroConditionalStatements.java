/*
 * https://www.hackerrank.com/challenges/30-conditional-statements/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class Day03IntroConditionalStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
//		if (n % 2 == 1) {
//			ans = "Weird";
//		} else {
//			if (n <= 5 && n >= 2) {
//				ans = "Not Weird";
//			} else if (n <= 20 && n >= 6) {
//				ans = "Weird";
//			} else {
//				ans = "Not Weird";
//			}
//		}
		ans = (n % 2 == 1) ? "Weird" : ((n <= 5 && n >= 2) ? "Not Weird" : ((n <= 20 && n >= 6) ? "Weird" : "Not Weird") ) ;
		System.out.println(ans);

	}

}
