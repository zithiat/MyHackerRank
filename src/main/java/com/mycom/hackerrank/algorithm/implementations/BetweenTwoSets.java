/*
 * https://www.hackerrank.com/challenges/between-two-sets
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.ArrayList;
import java.util.Arrays;

import com.mycom.hackerrank.algorithm.utils.LcmGcd;
import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class BetweenTwoSets {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		String f = "./samples/betweentwosets.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int m = ReadFile.readFileInt(f, 0)[1];
		int[] a = ReadFile.readFileInt(f, 1);
		int[] b = ReadFile.readFileInt(f, 2);
		System.out.println(getTotalX(n, a, m, b));
	}

	static int getTotalX(int n, int[] a, int m, int[] b) {
		int count = 0;
		int lcm = LcmGcd.lcm(a);
		int gcd = LcmGcd.findGCD(b, m);
//		System.out.println("LCM-A:" + lcm);
//		System.out.println("GCD-B:" + gcd);
		if (gcd % lcm != 0) {
			return 0;
		}
		else {
			Arrays.sort(b);
			ArrayList<Integer> b1 = LcmGcd.findFactors(b[m - 1]);
			if (m >= 2) {
				for (int i = m - 2; i >= 0; i--) {
					ArrayList<Integer> b2 = LcmGcd.findFactors(b[i]);
					b1.retainAll(b2);
				}
			}
			for (int num : b1) {
				if (num != 1 || lcm == 1) {
					if (num % lcm == 0) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
