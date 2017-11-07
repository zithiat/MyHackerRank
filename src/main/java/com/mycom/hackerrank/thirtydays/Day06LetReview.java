/*
 * https://www.hackerrank.com/challenges/30-review-loop/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class Day06LetReview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] s = new String[t];
		for (int i = 0; i < t; i++) {
			s[i] = in.next();
		}
		solve(s);
		in.close();
	}
	
	static void solve(String[] s) {
		String odd = "";
		String even = "";
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if (j % 2 == 0) odd = odd + s[i].charAt(j);
				else even = even + s[i].charAt(j);
			}
			System.out.println(odd + " " + even);
			odd = "";
			even = "";
		}
	}

}
