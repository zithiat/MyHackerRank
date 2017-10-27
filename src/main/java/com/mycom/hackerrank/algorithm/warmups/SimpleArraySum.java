/*
 * https://www.hackerrank.com/challenges/simple-array-sum
 */
package com.mycom.hackerrank.algorithm.warmups;

import java.io.IOException;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class SimpleArraySum {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String fileName = "./samples/simplearraysum.txt";
		int n = ReadFile.readFileInt(fileName, 0)[0];
		int[] ar = ReadFile.readFileInt(fileName, 1);
		System.out.println(simpleArraySum(n, ar));
	}
	
	static int simpleArraySum(int n, int[] ar) {
		int sum = 0;
        for (int i = 0; i < n; i++) {
        		sum += ar[i];
        }
        return sum;
    }
}
