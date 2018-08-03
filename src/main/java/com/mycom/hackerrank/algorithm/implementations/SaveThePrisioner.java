/*
 * https://www.hackerrank.com/challenges/save-the-prisoner
 */
package com.mycom.hackerrank.algorithm.implementations;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class SaveThePrisioner {
	public static void main(String[] args) {
		String fName = "./samples/savetheprisoner.txt";
		// the number of test cases
		int t = ReadFile.readFileInt(fName, 0)[0];
		for (int i = 0; i < t; i++) {
			// the number of prisoners 
			int n = ReadFile.readFileInt(fName, i + 1)[0];
			// the number of sweets 
			int m = ReadFile.readFileInt(fName, i + 1)[1];
			// the chair number to start passing out treats at
			int s = ReadFile.readFileInt(fName, i + 1)[2];
			// start giving sweets at prisoner[id-1]. 
			// if we have more sweets than prisoners 
			// we go back to the starting point. 
			// We just need the rest, so use %.
			// ((sweets + (id - 2)) % prisoners) + 1
			
			// Assuming we started counting the prisoners from 0, like most arrays, 
			// we could just print the result of: (startingPrisoner - 1 + candies ) % numPrisoners
			// The % keeps the index in bounds [0, numPrisoners) and the minus one to the startingPrisoner 
			// accounts for the fact the first prisoner eats the candy and 
			// we want to return their position and not the next prisoner's position. I hope this makes sense.
			// Because this problem uses 1 as the first "index" so to speak for the prisoners, 
			// we want to add one after the result of the remainder operator. 
			// But, if we do this, most things will be skewed by one, 
			// so we balance adding the one to the remainder by taking one away from the dividend. 
			// Check this:
			// 6 % 5 = 1
			// 6 % 5 + 1 = 2 (obviously not equal to the above)
			// (6 - 1) % 5 + 1 = 1
			// (startingPrisoner - 1 - 1 + candies ) % numPrisoners + 1
			// Subtracting an additional one from the dividend and adding a one to the remainder allows 
			// our math to still work out the same as:
			// (startingPrisoner - 1 + candies ) % numPrisoners
			// except, it won't allow a value of 0 and will allow numPrisoners to result as well, 
			// resulting in a range of: [1, numPrisoners]
			System.out.println(saveThePrisoner(n, m, s));
		}
	}
	
	static int saveThePrisoner(int n, int m, int s) {
//		int a = s + m - 1;
//		if (a > n) {
//			if (a % n == 0) {
//				return n;
//			}
//			return a % n;
//		}
//		return a;
		return ((m + s - 2) % n) + 1;
	}
}
