/*
 * https://www.hackerrank.com/challenges/permutation-equation
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class SequenceEquation {
	public static void main(String[] args) {
		/*
		 * n: the number of elements in the sequence 
		 * p[n]: space-separated integers (1 <= j <= n) 
		 * 3 
		 * 2 3 1
		 */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int[] p = new int[n];
		String[] pItems = s.nextLine().split(" ");
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }
		System.out.println(Arrays.toString(permutationEquation(p)));
		s.close();
	}

	static int[] permutationEquation(int[] p) {
		int[] res = new int[p.length];
		for (int i = 0; i < res.length; i++) {
			res[p[p[i] - 1] - 1] = i + 1;
		}
		return res;
	}
}
