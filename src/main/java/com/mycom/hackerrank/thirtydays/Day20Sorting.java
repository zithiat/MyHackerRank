/*
 * https://www.hackerrank.com/challenges/30-sorting/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

public class Day20Sorting {
	
	private static Scanner in;

	/**
	 * sample input
3
1 2 3
	 * Output
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
	 * 
	 * sample input
3
3 2 1
	 * Output
Array is sorted in 3 swaps.
First Element: 1
Last Element: 3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
		}
		int totalSwaps = 0;
		for (int i = n - 1; i > 0; i--) {
			int numberOfSwaps = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					numberOfSwaps++;
					totalSwaps++;
				}
			}
			if (numberOfSwaps == 0) {
				break;
			}
		}
		System.out.println("Array is sorted in " + totalSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);
	}
}
