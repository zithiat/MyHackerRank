/*
 * https://www.hackerrank.com/challenges/stockmax/problem
 */
package com.mycom.hackerrank.algorithm.dynamicprogramming;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class StockMaximize {

	private static Scanner in;

	/**
	 * sample:
	 * 3
	 * 3
	 * 5 3 2
	 * 3
	 * 1 2 100
	 * 4
	 * 1 3 1 2
	 * 
	 * result:
	 * 0
	 * 197
	 * 3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n = in.nextInt();

		for (int t = 0; t < n; t++) {
			int numStock = in.nextInt();
			int[] stocks = new int[numStock];
			for (int i = 0; i < numStock; ++i) {
				stocks[i] = in.nextInt();
			}

			int[] maxSoFar = new int[numStock];
			int max = Integer.MIN_VALUE;
			for (int i = numStock - 1; i >= 0; --i) {
				max = Math.max(max, stocks[i]);
				maxSoFar[i] = max;
			}

			long sum = 0;
			for (int i = 0; i < numStock; i++) {
				if (maxSoFar[i] != stocks[i]) {
					sum += maxSoFar[i] - stocks[i];
				}
			}
			System.out.println(sum);
		}
		in.close();
	}

}
