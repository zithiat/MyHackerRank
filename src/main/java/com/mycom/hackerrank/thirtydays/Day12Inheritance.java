/*
 * https://www.hackerrank.com/challenges/30-inheritance/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.Scanner;

public class Day12Inheritance {

	/**
	 * Input:
	 * Heraldo Memelli 8135627
	 * 2
	 * 100 80
	 * 
	 * Output:
	 *  Name: Memelli, Heraldo
	 *  ID: 8135627
	 *  Grade: O
	 *    
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}

}

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
	Student(String fName, String lName, int id, int[] testScores) {
		super(fName, lName, id);
		this.testScores = testScores;
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
	public String calculate() {
		int sum = 0;
		for (int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		double a = sum / testScores.length;
		return (a < 40) ? "T" : (
				(a < 55) ? "D" : (
						(a < 70) ? "P" : (
								(a < 80) ? "A" : (
										(a < 90)? "E" : "O"))));
	}
}