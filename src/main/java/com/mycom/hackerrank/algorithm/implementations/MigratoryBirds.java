/*
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.HashMap;
import java.util.Map;
import com.mycom.hackerrank.algorithm.utils.ArrayUtils;
import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class MigratoryBirds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String f = "./samples/migratorybirds.txt";
		int n = ReadFile.readFileInt(f, 0)[0];
		int[] ar = ReadFile.readFileInt(f, 1);
		System.out.println(migratoryBirds(n, ar));
	}
	
	static int migratoryBirds(int n, int[] ar) {
		int result = 0;
		// Prepare a bird type HashMap
		HashMap<Integer, Integer> birdMap = new HashMap<Integer, Integer>();
		for (int i = 1; i <=5 ; i++) {
			birdMap.put(i, 0);
		}
		// Count the birds based on the type from the HashMap
		for (int j = 0; j < ar.length; j++) {
			birdMap.put(ar[j], (birdMap.get(ar[j]) + 1));
		}
//		System.out.println(birdMap);
		Map<Integer, Integer> sortedMap = ArrayUtils.sortByValue(birdMap);
//		System.out.println(sortedMap);
		int cur = 0;
		for (Map.Entry<Integer, Integer> e: sortedMap.entrySet()) {
			if (cur < e.getValue()) {
				cur = e.getValue();
				result = e.getKey();
			}
		}
		return result;
		
		// other resolution: to use array with index
//		int[] count = new int[6];
//		for (int i = 0; i < n; i++) {
//			count[ar[i]]++;
//		}
//		int min_count = count[1];
//		int min_count_id = 1;
//		
//		for (int i = 2; i < 5; i++) {
//			if (min_count < count[i]) {
//				min_count = count[i];
//				min_count_id = i;
//			}
//		}
//		return min_count_id;
	}

}
