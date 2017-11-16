/*
 * https://www.hackerrank.com/challenges/30-scope/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

public class Day14Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
	}
}

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
	public Difference(int[] elements) {
		super();
		this.setElements(elements);
	}
	
	public void computeDifference() {
		Arrays.sort(elements);
		this.maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
	}

	public int[] getElements() {
		return elements;
	}

	public void setElements(int[] elements) {
		this.elements = elements;
	}  	
}
