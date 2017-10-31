/*
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class BonAppetit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/bonappetit.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int k = ReadFile.readFileInt(f, 0)[1];
		int[] ar = ReadFile.readFileInt(f, 1);
		int b = ReadFile.readFileInt(f, 2)[0];
		System.out.println(bonAppetit(n, k, b, ar));
	}
	
	static int bonAppetit(int n, int k, int b, int[] ar) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
        		sum += (i == k) ? 0 : ar[i]; 
        }
        return b - (sum / 2);
    }

}
