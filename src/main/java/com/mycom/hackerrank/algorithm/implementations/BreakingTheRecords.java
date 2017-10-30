/*
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 */
package com.mycom.hackerrank.algorithm.implementations;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class BreakingTheRecords {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		String f = "./samples/breakingtherecords.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int[] ar = ReadFile.readFileInt(f, 1);
	}

}
