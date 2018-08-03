/*
 * https://www.hackerrank.com/challenges/strange-advertising
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class ViralAdvertising {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		viralAdvertising(n);
		s.close();
	}
	
	static int viralAdvertising(int n) {
		int res = 0;
		int m = 5;
		while (n > 0) {
			res += m / 2;
			m = (m / 2) * 3;
			n--;
		}
		return res;
	}
}
