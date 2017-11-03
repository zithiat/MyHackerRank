/*
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.Arrays;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class SockMerchan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/sockmerchan.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int[] ar = ReadFile.readFileInt(f, 1);
		System.out.println(sockMerchant(n, ar));
	}
	
	static int sockMerchant(int n, int[] ar) {
		int result = 0;
		Arrays.sort(ar);
		for (int i = 0; i < n - 1; i++) {
			if (ar[i] == ar[i + 1]) {
				result++;
				i++;
			}
		}
		return result;
    }
}
