/*
 * https://www.hackerrank.com/challenges/30-linked-list/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

public class Day15LinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Day15Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

	public static void display(Day15Node head) {
		Day15Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Day15Node insert(Day15Node head, int data) {
		if (head == null) {
			return new Day15Node(data);
		} else if (head.next == null) {
			head.next = new Day15Node(data);
		} else {
			insert(head.next, data);
		}
		return head;
	}
}

class Day15Node {
	int data;
	Day15Node next;

	Day15Node(int d) {
		data = d;
		next = null;
	}
}