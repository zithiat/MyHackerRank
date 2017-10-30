/*
 * https://www.hackerrank.com/challenges/grading
 */
package com.mycom.hackerrank.algorithm.implementations;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class GradingStudents {

	public static void main(String[] args)  {
		String fName = "./samples/gradingstudents_sample.txt";
		int n = ReadFile.readFileInt(fName, 0)[0];
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = ReadFile.readFileInt(fName, i + 1)[0];
		}
		int[] result = solve(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
	}

	static int[] solve(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] >= 38 && grades[i] % 5 >= 3) {
				grades[i] = grades[i] + (5 - (grades[i] % 5));
			}
		}
		return grades;
	}

}
