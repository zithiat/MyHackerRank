/*
 * https://www.hackerrank.com/challenges/30-binary-numbers/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day10BinaryNumbers {
	static List<Integer> remainder = new ArrayList<>();
	private static Scanner in;
	
	/*
	 * 524275 = [1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1] = 15
	 * 524283 = [1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1] = 16
	 * 439 = [1, 1, 1, 0, 1, 1, 0, 1, 1] = 3
	 */
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(maxConsecutive(n));
	}
	
	static int maxConsecutive(int n) {
		parseBinaryNumber(n);
//		System.out.println(Arrays.toString(remainder.toArray()));
		String s = Arrays.toString(remainder.toArray());
		String[] ss = s.substring(1, s.length() - 1).replaceAll(",", "").replaceAll("\\s", "").split("0");
		int[] len = new int[ss.length];
		int i = 0;
		for (String a : ss) {
			len[i] = a.length();
			i++;
		}
		Arrays.sort(len);
		return len[len.length - 1];
	}
	
	static void parseBinaryNumber(int n) {
		while (n > 0) {
			remainder.add(n % 2);
			n = n / 2;
		}
	}
}
