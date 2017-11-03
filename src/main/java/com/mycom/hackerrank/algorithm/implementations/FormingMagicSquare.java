/*
 * https://www.hackerrank.com/challenges/magic-square-forming/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.Arrays;
import java.util.HashSet;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class FormingMagicSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/formingmagicsquare.txt";
		int[][] ar = new int[3][3];
		for (int i = 0; i < 3; i++) {
			ar[i] = ReadFile.readFileInt(f, i);
		}
		System.out.println(solve(ar));
	}
	
	static int solve(int[][] ar) {
		/*
		 * pairs:
		 * - central number: 5
		 * - corners: 4 - 6, 2 - 8
		 * - middle: 1 - 9, 3 - 7
		 */
		int[][] possibilities = new int[8][9];
		int t = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				// i, 15 - i - j, j, 5 + j - i, 5, 5 + a - b, 10 - j, i + j - 5, 10 - i
				int[] a = {i, 15 - i - j, j, 5 + j - i, 5, 5 + i - j, 10 - j, i + j - 5, 10 - i};
				if (inRange1to9(a)) {
					if (!containsDuplicates(a)) {
						possibilities[t] = a;
						t++;
					}
				}
			}
		}
		// Convert the given matrix to linear array
		int[] tmp = new int[9];
		int tt = 0;
		for (int[] a : ar) {
			for (int n : a) {
				tmp[tt] = n;
				tt++;
			}			
		}

		int minCost = 81; // Max total value of a square matrix of all 9 is 81
		for (int[] b : possibilities) {
			int cost = 0;
			for (int k = 0; k < 9; k++) {
				cost += Math.abs(tmp[k] - b[k]);
			}
			if (cost < minCost) {
				minCost = cost;
			}
		}
		return minCost;
	}
	
	static boolean inRange1to9(int[] x) {
		for (int n : x) {
			if (n >= 10 || n <= 0) {
				return false;
			}
		}
		return true;
	}
	
	static boolean containsDuplicates(int[] x) {
		Integer[] newArray = new Integer[9];
		int i = 0;
		for (int value : x) {
		    newArray[i++] = Integer.valueOf(value);
		}
		return new HashSet<Integer>(Arrays.asList(newArray)).size() != newArray.length;
	}
}
