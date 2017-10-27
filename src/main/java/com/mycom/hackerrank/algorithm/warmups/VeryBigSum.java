/*
 * https://www.hackerrank.com/challenges/a-very-big-sum
 */
package com.mycom.hackerrank.algorithm.warmups;

import java.io.IOException;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class VeryBigSum {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String f = "./samples/verybigsum.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		long[] ar = ReadFile.readFileLong(f, 1);
		long result = aVeryBigSum(n, ar);
        System.out.println(result);
	}
	
	static long aVeryBigSum(int n, long[] ar) {
        long result = 0;
        for (long a : ar) {
        		result += a;
        }
        return result;
    }

}
