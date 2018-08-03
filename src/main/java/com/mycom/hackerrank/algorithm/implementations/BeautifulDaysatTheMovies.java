/*
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.util.stream.IntStream;
import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class BeautifulDaysatTheMovies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fName = "./samples/beautifuldaysatthemovies.txt";
		int start = ReadFile.readFileInt(fName, 12)[0];
		int end = ReadFile.readFileInt(fName, 12)[1];
		int beautifulDay = ReadFile.readFileInt(fName, 12)[2];
		
		int count = 0;
//		for (int i = 0; i < (end - start + 1); i++) {
//			if (Math.abs((start + i) - reverseInt(start + i)) % k == 0 ) count++;
//		}
		for (int x : IntStream.rangeClosed(start, end).toArray()) {
			if (Math.abs(x - reverseInt(x)) % beautifulDay == 0) count++;
		}
		System.out.println(count);
	}
	
	static int reverseInt(int n) {
		StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.reverse();
        return Integer.parseInt(sb.toString());
	}
}
