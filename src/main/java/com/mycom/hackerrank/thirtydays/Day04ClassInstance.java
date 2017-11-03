/*
 * https://www.hackerrank.com/challenges/30-class-vs-instance/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @author hongquan.doan
 *
 */
public class Day04ClassInstance {

	private int age;
	
	public Day04ClassInstance(int initialAge) {
		if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			this.age = 0;
		} else {
			this.age = initialAge;
		}
	}
	
	public void amIOld() {
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
		} else if (age >= 18) {
			System.out.println("You are old.");
		}
	}
	
	public void yearPasses() {
		this.age++;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i< n; i++) {
			int age = in.nextInt();
			Day04ClassInstance d = new Day04ClassInstance(age);
			d.amIOld();
			for (int j = 0; j < 3; j++) {
				d.yearPasses();
			}
			d.amIOld();
			System.out.println();
		}
		in.close();
	}

}
