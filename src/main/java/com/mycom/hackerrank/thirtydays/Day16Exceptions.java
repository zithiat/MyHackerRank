/*
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

public class Day16Exceptions {

	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		String s = in.next();
		try {
			System.out.println(Integer.parseInt(s));
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
//		System.out.println(Integer.parseInt(s));
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println("Digit:" + Character.isDigit(s.charAt(i)));
//			System.out.println("Character:" + Character.isLetter(s.charAt(i)));
//			if (Character.isLetter(s.charAt(i))) {
//				f = false;
//				break;
//			}
//		}
//		if (!f) {
//			System.out.println("Bad String");
//		} else {
//			System.out.println(Integer.parseInt(s));
//		}
	}
}
