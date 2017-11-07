/*
 * https://www.hackerrank.com/challenges/candies/problem
 */
package com.mycom.hackerrank.algorithm.dynamicprogramming;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class Candies {

	private static int[] ranks;
	private static int[] candies;
	private static Scanner in;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n = in.nextInt();
		ranks = new int[n];
		candies = new int[n];
		Arrays.fill(candies, -1);

		for (int i = 0; i < n; i++) {
			ranks[i] = in.nextInt();
		}

		if (n == 1) {
			System.out.println("1");
			return;
		}

		int ind = 0;
		while (ind < ranks.length - 1) {
			int a = ind;

			while (ind < ranks.length - 1 && ranks[ind] >= ranks[ind + 1]) {
				ind++;
			}
			if (a != ind) {
				fill(ind, a, -1);
			}

			a = ind;
			while (ind < ranks.length - 1 && ranks[ind] <= ranks[ind + 1]) {
				ind++;
			}
			if (a != ind) {
				fill(a, ind, 1);
			}
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += candies[i];
		}
		System.out.println(sum);
	}

	static void fill(int start, int end, int step) {
		int v = 1;
		candies[start] = 1;
		for (int i = start + step; i != end; i += step) {
			v = incV(i, step, v);
			candies[i] = v;
		}
		v = incV(end, step, v);
		if (candies[end] == -1) {
			candies[end] = v;
		} else {
			candies[end] = Math.max(candies[end], v);
		}
	}

	static int incV(int i, int step, int v) {
		if (ranks[i] == ranks[i - step]) {
			v = 1;
		} else {
			v += 1;
		}
		return v;
	}
}
