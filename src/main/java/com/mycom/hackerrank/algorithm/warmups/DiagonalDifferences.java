/*
 * https://www.hackerrank.com/challenges/diagonal-difference
 */
package com.mycom.hackerrank.algorithm.warmups;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class DiagonalDifferences {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		String f = "./samples/diagonaldiff.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int[][] ar = new int[n][n];
		for (int i = 0; i < n; i++) {
			ar[i] = ReadFile.readFileInt(f, i + 1);
		}
		System.out.println(diagonalDiff(n, ar));
	}
	
	static int diagonalDiff(int n, int[][] ar) {
		int result = 0;
		int primaryDiagon = 0;
		int secondDiagon = 0;
		for (int i = 0; i < n; i++) {
			primaryDiagon += ar[i][i];
		}
		for (int j = n - 1; j >= 0; j--) {
			secondDiagon += ar[j][n-(j+1)];
		}
		result = Math.abs(primaryDiagon - secondDiagon);
		return result;
	}
}
