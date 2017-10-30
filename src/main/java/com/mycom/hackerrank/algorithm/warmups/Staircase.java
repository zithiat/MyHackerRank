/*
 * https://www.hackerrank.com/challenges/staircase
 */
package com.mycom.hackerrank.algorithm.warmups;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class Staircase {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		String f = "./samples/staircase.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		drawStaircase(n);
	}
	
	static void drawStaircase(int n) {
		for (int i = 1; i <= n; i++) {
			String space = (i == n) ? "" : String.format("%"+ (n - i) +"s", " ");
			String hash = String.format("%" + i + "s", " ").replace(' ', '#');
			System.out.println(space + hash);
		}
	}

}
