/*
 * https://www.hackerrank.com/challenges/compare-the-triplets
 */
package com.mycom.hackerrank.algorithm.warmups;

import java.io.IOException;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class CompareTriplets {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String fileName = "./samples/comparetriplets.txt";
		int[] a = ReadFile.readFileInt(fileName, 0);
		int[] b = ReadFile.readFileInt(fileName, 1);
		int[] res = solve(a, b);
		System.out.println(res[0] + " " + res[1]);
	}
	
	static int[] solve(int[] a, int[] b){
		int[] result = {0, 0};
		for (int i = 0; i < 3; i++) {
			result[0] += (a[i] > b[i]) ? 1 : 0;
			result[1] += (a[i] < b[i]) ? 1 : 0;
		}
        return result;
    }

}
