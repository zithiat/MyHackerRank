package com.mycom.hackerrank.algorithm.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hongquan.doan
 *
 */
public class LcmGcd {

	/**
	 * GCD for 2 long values
	 * @param x
	 * @param y
	 * @return
	 */
	public static int gcd(int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);
	}
	
	/**
	 * find a GCD of an array
	 * @param arr
	 * @param n
	 * @return
	 */
	public static int findGCD(int[] arr, int n) {
		int result = arr[0];
		for (int i = 1; i < n; i++) {
			result = gcd(arr[i], result);
		}
		return result;
    }
	
	/**
	 * LCM for 2 long values
	 * @param a
	 * @param b
	 * @return
	 */
	public static int lcm(int a, int b) {
	    return a * (b / gcd(a, b));
	}

	/**
	 * LCM for an array of long values
	 * @param input
	 * @return
	 */
	public static int lcm(int[] input) {
	    int result = input[0];
		for (int i = 1; i < input.length; i++) {
			result = lcm(result, input[i]);
		}
	    return result;
	}
	
	/**
	 * find prime number and its count from a given integer
	 * @param a
	 * @return
	 */
	public static Map<Integer, Integer> getPrimitiveNumbers(int a) {
		int count = 0;
		Map<Integer, Integer> listPrimNumber = new HashMap<Integer, Integer>();
		if (a == 1) {
			listPrimNumber.put(1, a);
		}
		for (int i = 2; i <= (a); i++) {
			count = 0;
			while (a % i == 0) {
				a /= i;
				count++;
			}
			if (count == 0) {
				continue;
			}
			listPrimNumber.put(i, count);
		}
		return listPrimNumber;
	}
	
	/**
	 * Find the list of factors of a given number
	 * @param a
	 * @return
	 */
	public static ArrayList<Integer> findFactors(int a) {
        int upperlimit = (int)(Math.sqrt(a));
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i=1;i <= upperlimit; i+= 1){
            if(a%i == 0){
                factors.add(i);
                if(i != a/i){
                    factors.add(a/i);
                }
            }
        }
        Collections.sort(factors);
        return factors;
    }
}
