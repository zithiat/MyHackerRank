/*
 * https://www.hackerrank.com/challenges/30-loops/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class Day05Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
        		System.out.println(n + " x " + i + " = " + (i * n));
        }
        in.close();
	}

}
