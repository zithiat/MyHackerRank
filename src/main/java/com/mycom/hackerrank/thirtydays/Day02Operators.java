/*
 * https://www.hackerrank.com/challenges/30-operators/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class Day02Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + ((mealCost * tipPercent) / 100) + (mealCost * taxPercent) / 100 );        
        System.out.printf("The total meal cost is %d dollars.", totalCost);
	}

}
