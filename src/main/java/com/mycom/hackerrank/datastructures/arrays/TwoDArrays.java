/*
 * https://www.hackerrank.com/challenges/2d-array
 */
package com.mycom.hackerrank.datastructures.arrays;

import java.util.Arrays;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class TwoDArrays {
	public static void main(String[] args) {
		String f = "./samples/2darrays.txt";
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			arr[i] = ReadFile.readFileInt(f, i);
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println(maxHourglass(arr));
	}
	
	static int maxHourglass(int[][] arr) {
		int[] max = new int[16];
		int c = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				max[c] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				c++;
			}
		}
		Arrays.sort(max);
		return max[15];
	}
}
