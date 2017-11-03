/*
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.Arrays;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class ElectronicsShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/electronicsshop.txt";
		int s = ReadFile.readFileInt(f, 0)[0];
//		int n = ReadFile.readFileInt(f, 0)[1];
//		int m = ReadFile.readFileInt(f, 0)[2];
		int[] np = ReadFile.readFileInt(f, 1);
		int[] mp = ReadFile.readFileInt(f, 2);
		System.out.println(getMoneySpent(np, mp, s));
	}
	
	static int getMoneySpent(int[] np, int[] mp, int s){
		Arrays.sort(np);
		Arrays.sort(mp);
		int total = -1;
		for (int i : np) {
			for (int j : mp) {
				if (total <= i + j && (i+j) <= s) {
					total = i + j;
				}
			}
		}
		return total;
	}
}
