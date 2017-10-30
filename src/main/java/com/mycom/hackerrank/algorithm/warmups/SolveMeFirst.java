/*
 * https://www.hackerrank.com/challenges/solve-me-first
 */
package com.mycom.hackerrank.algorithm.warmups;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class SolveMeFirst {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		String fName = "./samples/solvemefirst_sample.txt";
		int a = ReadFile.readFileInt(fName, 0)[0];
		int b = ReadFile.readFileInt(fName, 1)[0];
		int sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
	
	static int solveMeFirst(int a, int b) {
        return a + b;
  }
}
