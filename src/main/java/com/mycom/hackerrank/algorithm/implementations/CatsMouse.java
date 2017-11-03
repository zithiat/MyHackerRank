/*
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class CatsMouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/catsmouse.txt";
		int q = ReadFile.readFileInt(f, 0)[0];
		int[] ar = new int[3];
		for (int i  = 0; i < q; i++) {
			ar = ReadFile.readFileInt(f, i + 1);
			int a = Math.abs(ar[0] - ar[2]);
			int b = Math.abs(ar[1] - ar[2]);
			System.out.println((a == b) ? "Mouse C" : (a > b) ? "Cat B" : "Cat A");
		}
	}
}
