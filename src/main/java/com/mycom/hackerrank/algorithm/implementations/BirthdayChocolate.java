/*
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class BirthdayChocolate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/birthdaychocolate.txt";
		// first line: n pieces of chocolate
		int n = ReadFile.readFileInt(f, 0)[0];
		// array of integer numbers on each piece of chocolate bar
		int[] ar = ReadFile.readFileInt(f, 1);
		// first integer for day
		int d = ReadFile.readFileInt(f, 2)[0];
		// second integer for month
		int m = ReadFile.readFileInt(f, 2)[1];
		System.out.println(splitChocolateBar(n, ar, d, m));
	}
	
	/**
	 * Idea:
	 * 	We can use a sliding window off size m and track its' sum 
	 * 	and when it is equal to d we increment a counter
	 * 	We must visit every element of the array if m==1
	 * 
	 * @param n
	 * @param ar
	 * @param d
	 * @param m
	 * @return
	 */
	static int splitChocolateBar (int n, int[] ar, int d, int m) {
		int result = 0;
		// without checking m value against n value
//		for (int i = 0; (i + m) <= n; i++) {
//			int sum = 0;
//			for (int j = i; j < (i + m); j++) {
//				sum += ar[j];
//			}
//			if (sum == d) {
//				result++;
//			}
//		}
		if (m == n && ar[0] == d) {
			return 1;
		} else if (m > n) {
			return 0;
		} else {
			for (int i = 0; i <= n - m; i++) {
				int sum = 0;
				for (int j = i; j < i + m; j++) {
					sum += ar[j];
				}
				if (sum == d) {
					result++;
				}
			}
		}
		return result;
	}
}
