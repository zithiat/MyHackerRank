/*
 * https://www.hackerrank.com/challenges/30-bitwise-and/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;
/**
 * @author hongquan.doan
 *
 */
public class Day29BitwiseAnd {

	private static Scanner sc;
	
	/**
	 * Sample inputs
3
5 2
8 5
2 2
	 * Sample outputs
1
4
0
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if (((k - 1) | k) > n && k % 2 == 0) {
				System.out.println(k - 2);
			} else {
				System.out.println(k - 1);
			}
        }
	}
}
