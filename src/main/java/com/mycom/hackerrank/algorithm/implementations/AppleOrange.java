/*
 * https://www.hackerrank.com/challenges/apple-and-orange
 */
package com.mycom.hackerrank.algorithm.implementations;

import java.io.IOException;

import com.mycom.hackerrank.algorithm.utils.ReadFile;

/**
 * @author hongquan.doan
 *
 */
public class AppleOrange {

	public static void main(String[] args) throws IOException {
		String fName = "./samples/apple-orange_sample.txt";
		int s = ReadFile.readFileInt(fName, 0)[0];
		int t = ReadFile.readFileInt(fName, 0)[1];
		int a = ReadFile.readFileInt(fName, 1)[0];
		int b = ReadFile.readFileInt(fName, 1)[1];

		int[] apple = ReadFile.readFileInt(fName, 3);
        System.out.println(countFruit(apple, s, t, a, 0));

        int[] orange = ReadFile.readFileInt(fName, 4);
        System.out.println(countFruit(orange, s, t, b, 1));
    }
    
    static int countFruit(int[] fruit, int houseLocLeft, int houseLocRight, int treeLoc, int type) {
        int totalFruit = 0;
        int curPos = 0;
        for (int i = 0; i < fruit.length; i++) {
            if (type == 0 && fruit[i] >= 0) {
            		curPos = treeLoc + fruit[i];
            		if (houseLocLeft <= curPos && curPos <= houseLocRight) {
            			totalFruit++;
            		}
            } else if (fruit[i] <= 0){
				curPos = treeLoc + fruit[i];
				if (houseLocLeft <= curPos && curPos <= houseLocRight) {
					totalFruit++;
				}
        		}
        }
        return totalFruit;
    }
}
