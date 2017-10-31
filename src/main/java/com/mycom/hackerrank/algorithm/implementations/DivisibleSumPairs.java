/*
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class DivisibleSumPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/divisiblesumpairs.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int k = ReadFile.readFileInt(f, 0)[1];
		int[] ar = ReadFile.readFileInt(f, 1);
		System.out.println(countDivisibleSumPairs(n, k, ar));
	}
	
	static int countDivisibleSumPairs (int n, int k, int[] ar) {
		int result = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar[i] + ar[j]) % k == 0) {
					result++;
				}
			}
		}
		return result;
	}
}
