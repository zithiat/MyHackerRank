/*
 * https://www.hackerrank.com/challenges/mini-max-sum
 */
package com.mycom.hackerrank.algorithm.warmups;

import java.io.IOException;
import java.util.Arrays;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class MinMaxSum {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String f = "./samples/minmaxsum.txt";
		int[] ar = ReadFile.readFileInt(f, 0);
		long[] result = minMaxSum(ar);
        System.out.println(result[0] + " " + result[1]);
	}
	
	static long[] minMaxSum(int[] ar) {
		Arrays.sort(ar);
		long[] result = new long[2];
		for (int i = 0; i < 4; i++) {
			result[0] += ar[i];
		}
		for (int i = 1; i < 5; i++) {
			result[1] += ar[i];
		}
		return result;
	}

}
