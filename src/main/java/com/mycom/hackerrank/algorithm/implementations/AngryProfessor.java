/*
 * https://www.hackerrank.com/challenges/angry-professor/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.*;

public class AngryProfessor {
	
	private static Scanner in;

	/**
	 * Sample input
2
4 3
-1 -3 4 2
4 2
0 -1 2 1

	 * Output
YES
NO
	 * @param args
	 */
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			for (int j = 0; j < n; j++) {
				if (a[j] <= 0) {
					k--;
				}
			}
			if (k > 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
