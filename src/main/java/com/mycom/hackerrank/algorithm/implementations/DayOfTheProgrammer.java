/*
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

/**
 * @author hongquan.doan
 *
 */
public class DayOfTheProgrammer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int year = 2400;
		System.out.println(solve(year));
	}
	
	static String solve(int year) {
		// Jan + Mar + Apr + May + Jun + Jul + Aug
		int daysOfMonths = 215;
		int dayOfFeb = (year < 1918) ? ((year % 4 == 0) ? 29 : 28 ) : ((year > 1918) ? (((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) ? 29 : 28 ) : 15);
		int dayInSep = 257 - daysOfMonths - dayOfFeb - 1;
		return dayInSep + ".09." + year; 
	}
}
