/*
 * https://www.hackerrank.com/challenges/plus-minus
 */
package com.mycom.hackerrank.algorithm.warmups;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class PlusMinus {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int[] ar = new int[n];
//		for (int i = 0; i < n; i++) {
//			ar[i] = in.nextInt();
//		}
		String f = "./samples/plusminus.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int[] ar = ReadFile.readFileInt(f, 1);
		double[] plusMinus = calPlusMinus(n, ar);
		for (int i = 0; i < plusMinus.length; i++) {
			//String numberAsString = String.format ("%.06f", number);
			System.out.println(String.format ("%.6f", plusMinus[i]));			
		}
	}
	
	static double[] calPlusMinus(int n, int[] ar) {
		double[] result = new double[3];
		int plus = 0;
		int zero = 0;
		int minus = 0;
		for (int i = 0; i < n; i++) {
			plus += (ar[i] > 0) ? 1 : 0;
			minus += (ar[i] < 0) ? 1 : 0;
			zero += (ar[i] == 0) ? 1 : 0;
		}
		result[0] = (double)plus / n;
		result[1] = (double)minus / n;
		result[2] = (double)zero / n;
		return result;
	}
}
