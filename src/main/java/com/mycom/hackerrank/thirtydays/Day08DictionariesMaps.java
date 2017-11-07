/*
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class Day08DictionariesMaps {

	/**
	 * Sample:
	 * 3
	 * sam 99912222
	 * tom 11122222
	 * harry 12299933
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		Map<String, Integer> phoneNames = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int number = in.nextInt();			
			phoneNames.put(name, number);
		}
        while(in.hasNext()){
        		String tmp = in.next();
        		if (phoneNames.containsKey(tmp)) {
        			System.out.println(tmp + "=" + phoneNames.get(tmp));
        		} else {
        			System.out.println("Not found");
        		}
        }
        in.close();
	}

}
