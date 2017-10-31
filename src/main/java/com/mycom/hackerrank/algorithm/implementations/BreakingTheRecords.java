/*
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.Arrays;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class BreakingTheRecords {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		String f = "./samples/breakingtherecords.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int[] ar = ReadFile.readFileInt(f, 1);
		System.out.println(Arrays.toString(getRecord(n, ar)));
	}
	
	static int[] getRecord(int n, int[] ar){
		// Array for highest and lowest records: { highest_count, lowest_count }
        int[] records = new int[2];
		int max = ar[0];
		int min = ar[0];
		for(int i = 1; i < n; i++){
            if (ar[i] > max) {
            		records[0]++;
            		max = ar[i];
            }
            if (ar[i] < min) {
            		records[1]++;
            		min = ar[i];
            }
        }
        return records;
    }
}
