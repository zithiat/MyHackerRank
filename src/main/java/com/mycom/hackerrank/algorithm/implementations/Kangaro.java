/*
 * https://www.hackerrank.com/challenges/kangaroo
 */
package com.mycom.hackerrank.algorithm.implementations;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class Kangaro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/kangaroo.txt";
		int[] ar = ReadFile.readFileInt(f, 0);
		System.out.println(sameLocation(ar));
	}
	
	static String sameLocation(int[] ar) {
		int aLoc = ar[0];
		int aSpd = ar[1];
		int bLoc = ar[2];
		int bSpd = ar[3];
		// if A is slower, no way A to catch B, even starting from the same location
		if (aSpd < bSpd) {
			return "NO";
		} else {
			// if A is behind B and A's speed is faster then B
			// now we need to check if the speed of A can fill up 
			// the distance between A and B from the beginning.
			// Meaning to say, if the difference between A's and B's speed
			// has modulus equaled to 0, the A can catch B
			if(aLoc < bLoc && aSpd > bSpd) {
	            int distance = Math.abs(aLoc - bLoc);
	            int speed = Math.abs(aSpd - bSpd);
	            if(distance % speed == 0) {
	                return "YES";
	            } else {
	                return "NO";
	            }
	        }
		}
		return "NO";
	}
}
