/*
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class PickingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/pickingnumbers.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int[] ar = ReadFile.readFileInt(f, 1);
		System.out.println(solve(n, ar));
	}
	
	static int solve(int n, int[] ar) {
		int[] b = new int[200];
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	            int k = 2 * i;
	            if(ar[i] == ar[j] || ar[i] == ar[j] + 1) {
	                b[k]++;
	            }
	            if(ar[i] == ar[j] || ar[i] == ar[j] - 1) {
	                b[k+1]++;
	            }
	        }
	    }
	    for(int i = 0; i < 200; i++) {
	        if(b[i] > b[0]) {
	            b[0] = b[i];
	        }
	    }
	    return b[0];
	}
}
