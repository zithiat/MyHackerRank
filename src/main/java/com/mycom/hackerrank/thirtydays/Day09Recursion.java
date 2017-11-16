/*
 * https://www.hackerrank.com/challenges/30-recursion/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class Day09Recursion {

	private static Scanner in;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(factorial(n));
	}
	
	static int factorial(int n) {
		if (n > 1) {
			return n * factorial(n - 1);
		}
		return 1;
	}
}
