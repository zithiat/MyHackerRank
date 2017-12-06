/*
 * https://www.hackerrank.com/challenges/30-interfaces/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

public class Day19Interfaces {

	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Day19Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
	}

}

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Day19Calculator implements AdvancedArithmetic {

	public int divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}
}