/*
 * https://www.hackerrank.com/challenges/30-nested-logic/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * @author hongquan.doan
 *
 */
public class Day26NestedLogic {
	
	private static Scanner sc;

	/**
	 * Sample inputs
9 6 2015
6 6 2015 
	 * Sample outputs
45

31 8 2004
20 1 2004
3500

24 12 1898
18 9 1898
1500
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] retArr = new int[3];
		int[] expArr = new int[3];
		for (int i = 0; i < 3; i++) retArr[i] = sc.nextInt();
		for (int i = 0; i < 3; i++) expArr[i] = sc.nextInt();
		String retDate = retArr[0] + "-" + retArr[1] + "-" + retArr[2];
		String expDate = expArr[0] + "-" + expArr[1] + "-" + expArr[2];
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Timestamp retTs = new Timestamp(((java.util.Date)df.parse(retDate)).getTime());
			Timestamp expTs = new Timestamp(((java.util.Date)df.parse(expDate)).getTime());
			if (retTs.compareTo(expTs) == -1) {
				System.out.println(0);
			} else {
				long diff = retTs.getTime() - expTs.getTime();
//				System.out.println(retTs.getTime() + "----" + expTs.getTime() + "===" + diff + ">>>" + (diff / 86400000));
				double days = diff / 86400000;
//				System.out.println("days" + days);
				if (retArr[2] == expArr[2]) {
					if (retArr[1] == expArr[1]) {
						System.out.println("same month:" + String.format("%.0f", days * 15));
					} else {
						System.out.println("diff month:" + String.format("%.0f", Math.ceil((int)days / 30) * 500));
					}
				} else {
					System.out.println("diff year:" + 10000);
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
