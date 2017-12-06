/*
 * https://www.hackerrank.com/challenges/30-generics/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

public class Day21Generics {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
	}
}

class Printer <T> {
	public <E> void printArray(E[] generic){
	    for(E element : generic) {
	        System.out.println(element); 
	    }
	}
}
