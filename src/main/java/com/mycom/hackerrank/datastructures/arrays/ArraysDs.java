/*
 * https://www.hackerrank.com/challenges/arrays-ds/
 */
package com.mycom.hackerrank.datastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class ArraysDs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(reverseArray(a)));
		s.close();
	}
	
	static int[] reverseArray(int[] a) {
		int[] b = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			b[j] = a[i];
			j++;
		}
		return b;
	}
}
