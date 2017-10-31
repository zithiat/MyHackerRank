/*
 * https://www.hackerrank.com/challenges/30-data-types
 */
package com.mycom.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class Day01DataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        int n = scan.nextInt();
        double db = scan.nextDouble();
        // Need to move to next line when
        // A call to scan.nextLine(); returns everything after f until the beginning of the next line; 
        // because there are no characters there, it returns an empty String.
        // A call to scan.nextLine(); returns g.
        scan.nextLine();
        String ss = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(n + i);
        /* Print the sum of the double variables on a new line. */
		System.out.println(db + d);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + ss);
        scan.close();
	}

}
