/*
 * https://www.hackerrank.com/challenges/30-arrays/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class Day07Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        for (int j = n - 1; j >=0; j--) {
        		System.out.print(arr[j] + " ");
        }
	}

}
