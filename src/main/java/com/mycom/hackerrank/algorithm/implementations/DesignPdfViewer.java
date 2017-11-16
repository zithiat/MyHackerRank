/*
 * https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.*;

public class DesignPdfViewer {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		int max = 1;
		// Using ASCII to filter the tallest character
		// 97 is the max
		for (int i = 0; i < word.length(); i++) {
			char a = word.charAt(i);
			if (h[a - 97] > max) {
				max = h[a - 97];
			}
		}
		System.out.println(max * word.length());
	}

}
