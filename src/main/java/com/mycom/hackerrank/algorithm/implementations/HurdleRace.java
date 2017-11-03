/*
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.Arrays;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class HurdleRace {

	/**
	 * The wording is unambiguous, it says that "Each time Dan drinks a magic beverage, 
	 * the maximum height he can jump during the race increases by unit" 
	 * ==> each drink can increase by 01 unit
	 * 
	 * Each drink lasts the whole race, so you are correct that you only need 
	 * to calculate the difference between the highest hurdle and his current maximum.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/hurdlerace.txt";
//		int n = ReadFile.readFileInt(f, 0)[0];
		int k = ReadFile.readFileInt(f, 0)[1];
		int[] h = ReadFile.readFileInt(f, 1);
		Arrays.sort(h);
		System.out.println(Math.max(0, h[h.length - 1] - k));
	}
}
