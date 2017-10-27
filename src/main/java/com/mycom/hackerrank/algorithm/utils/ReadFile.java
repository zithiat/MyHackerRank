package com.mycom.hackerrank.algorithm.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hongquan.doan
 *
 */
public class ReadFile {
	public static int[] readFileInt(String f, int line) throws IOException {
		int[] result = { 0 };
		// Open the file
		FileInputStream fstream = new FileInputStream(f);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;
		int inLine = 0;
		while ((strLine = br.readLine()) != null) {
			if (inLine == line) {
				String[] strArr = strLine.split("\\s+");
				result = new int[strArr.length];
				int i = 0;
				for (String s : strArr) {
					result[i] = Integer.parseInt(s);
					i++;
				}
			}
			inLine++;
		}

		// Close the input stream
		br.close();

		return result;
	}
	
	public static long[] readFileLong(String f, int line) throws IOException {
		long[] result = { 0 };
		// Open the file
		FileInputStream fstream = new FileInputStream(f);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;
		int inLine = 0;
		while ((strLine = br.readLine()) != null) {
			if (inLine == line) {
				String[] strArr = strLine.split("\\s+");
				result = new long[strArr.length];
				int i = 0;
				for (String s : strArr) {
					result[i] = Long.parseLong(s);
					i++;
				}
			}
			inLine++;
		}

		// Close the input stream
		br.close();

		return result;
	}
}
