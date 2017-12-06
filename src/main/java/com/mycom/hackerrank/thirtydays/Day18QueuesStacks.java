/*
 * https://www.hackerrank.com/challenges/30-queues-stacks/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

public class Day18QueuesStacks {

	private static Stack<Character> stack = new Stack<>();
	private static Queue<Character> queues = new LinkedList<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18QueuesStacks p = new Day18QueuesStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}
		
	void pushCharacter(char c) {
		stack.push(c);
	}
	
	void enqueueCharacter(char c) {
		queues.add(c);
	}
	
	char popCharacter() {
		return stack.pop();
	}
	
	char dequeueCharacter() {
		return queues.remove();
	}
}
