/*
 * https://www.hackerrank.com/challenges/30-linked-list/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

public class Day15LinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Node insert(Node head, int data) {
		if (head == null) {
			return new Node(data);
		} else if (head.next == null) {
			head.next = new Node(data);
		} else {
			insert(head.next, data);
		}
		return head;
	}
}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}