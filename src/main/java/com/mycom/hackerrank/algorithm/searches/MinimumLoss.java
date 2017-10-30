/*
 * https://www.hackerrank.com/challenges/minimum-loss
 */
package com.mycom.hackerrank.algorithm.searches;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class MinimumLoss {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] prices = new long[n];
        int i=0;
        while(in.hasNext()) {
            prices[i++] = in.nextLong();
        }
        System.out.println(minimumLoss(prices));
		 */
		String fileName = "./samples/minimumloss_sample.txt";
		int year = ReadFile.readFileInt(fileName, 0)[0];
		long[] prices = ReadFile.readFileLong(fileName, 1);
		System.out.println(minimumLoss(year, prices));
	}
	
	static long minimumLoss(int year, long[] prices) {
		long start, end;
		start = System.currentTimeMillis();
		long result = 0;
		// Slow solution
//		for (int i = 0; i < prices.length - 1; i++) {
//			long cur = prices[i];
//			for (int j = i + 2; j < prices.length; j++) {
//				long next = prices[j];
//				if (next < cur) {
//					long tmp = cur - next;
//					if (result == 0 || tmp < result) {
//						result = tmp;
//					}
//				}
//			}
//		}
		
		// Faster solution
		// First, put the prices into HashMap with the year order 
		// as a pair of [price, year]
		// The reason are:
		// 1. The prices will be sorted
		// 2. We will calculate from the biggest to the smallest
		// 3. The difference will be compared to the previous difference
		// 4. And if the year of the current price is the after year of the comparing price
		// which we will need to pick from the HashMap storing the year order,
		// take note: the price is a key, the year is the value in the HashMap
		// then update the new difference.
		HashMap<Long, Integer> indices = new HashMap<Long, Integer>(); 
		for (int i = 0; i < prices.length; i++) {
			indices.put(prices[i], i);
		}
		Arrays.sort(prices);
		result = Long.MAX_VALUE;
		for(int i = year - 1; i > 0; i--){
            //Make sure it is a smaller loss
            if(prices[i] - prices[i - 1] < result){
                //Verify if the pair is a valid transaction
				if (indices.get(prices[i]) < indices.get(prices[i - 1])) {
					result = prices[i] - prices[i - 1];
				}
            }
        }
		
		end = System.currentTimeMillis();
		System.out.println("Time:" + (end - start) / 1000);
		return result;
	}
}
