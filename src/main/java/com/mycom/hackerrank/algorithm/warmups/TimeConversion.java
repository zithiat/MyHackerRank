/*
 * https://www.hackerrank.com/challenges/time-conversion
 */
package com.mycom.hackerrank.algorithm.warmups;

/**
 * @author hongquan.doan
 *
 */
public class TimeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "07:05:45PM";
		System.out.println(conversion(input));
	}
	
	static String conversion(String s) {
		int len = s.length();
		String hrStr = s.substring(0, 2);
		String apm = s.substring(len - 2);
		if ("AM".equals(apm) && "12".equals(hrStr)) hrStr = "00";
		if ("PM".equals(apm)) {
			if ("12".equals(hrStr)) {
				hrStr = "12";
			} else {
				hrStr = "" + (Integer.parseInt(hrStr) + 12);
			}
		}
		return hrStr + s.substring(2, len - 2);
	}

}
