/*
 * https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

/**
 * @author hongquan.doan
 *
 */
public class Day25RunningTimeComplexity {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int num = sc.nextInt();
			checkPrime(num);
		}
	}

	static void checkPrime(int n) {
		boolean f = true;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				f = false;
				break;
			}
		}
		if (n == 1)
			f = false;
		String s = (f) ? "Prime" : "Not prime";
		System.out.println(s);
	}
}
