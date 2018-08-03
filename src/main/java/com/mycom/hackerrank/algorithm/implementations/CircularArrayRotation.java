/*
 * https://www.hackerrank.com/challenges/circular-array-rotation
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.Arrays;
import java.util.Collections;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class CircularArrayRotation {
	public static void main(String[] args) {
		String fName = "./samples/circulararrayrotation.txt";
		// First line:
		// 	n: the number of elements in the integer array
		// 	k: the rotation count
		// 	q: the number of queries
		// Second line: space-separated integers
		// Each of the q subsequent lines contains a single integer denoting m
		// the index of the element to return from a
		int[] n = new int[ReadFile.readFileInt(fName, 0)[0]];
		int k = ReadFile.readFileInt(fName, 0)[1];
		int[] q = new int[ReadFile.readFileInt(fName, 0)[2]];
		n = ReadFile.readFileInt(fName, 1);
		for (int i = 0; i < q.length; i++) {
			q[i] = ReadFile.readFileInt(fName, (i + 2))[0];
		}
		System.out.println(Arrays.toString(circularArrayRotation(n, k, q)));
	}
	
	static int[] circularArrayRotation(int[] n, int k, int[] q) {
		int[] res = new int[q.length];
		int[] tmp = new int[n.length];
		Integer[] arr = new Integer[n.length];
		for (int i = 0; i < n.length; i++) {
			arr[i] = Integer.valueOf(n[i]);
		}
		
		Collections.rotate(Arrays.asList(arr), k);
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i].intValue();
		}
		
		for (int i = 0; i < res.length; i++) {
			res[i] = tmp[q[i]];
		}
		return res;
	}
}
