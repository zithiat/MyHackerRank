/*
 * https://www.hackerrank.com/challenges/drawing-book
 */
package com.mycom.hackerrank.algorithm.implementations;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class DrawingBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/drawingbooks.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int p = ReadFile.readFileInt(f, 1)[0];
		System.out.println(solve(n, p));
	}
	
	static int solve(int n, int p) {
		return Math.min(p/2, n/2 - p/2);
	}
}
