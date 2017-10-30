/*
 * https://www.hackerrank.com/challenges/birthday-cake-candles
 */
package com.mycom.hackerrank.algorithm.warmups;

import java.util.Arrays;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class BirthdayCakeCandles {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		String f = "./samples/birthdaycakecandles.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int[] ar = ReadFile.readFileInt(f, 1);
		System.out.println(countTallestCandle(n, ar));
	}
	
	static int countTallestCandle(int n, int[] ar) {
		int result = 1;
		Arrays.sort(ar);
		for (int i = n - 2; i >= 0; i--) {
			if (ar[i] == ar[n - 1]) {
				result++;
			}
		}
		return result;
	}
}
