/*
 * https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

/**
 * @author hongquan.doan
 *
 */
public class Day24MoreLinkedList {

	private static Scanner sc;

	/**
	 * Sample input
	 * 6
1
2
2
3
3
4
	 * Sample output
	 * 1 2 3 4 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Day24Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
	}

	public static Day24Node insert(Day24Node head, int data) {
		Day24Node p = new Day24Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Day24Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Day24Node head) {
		Day24Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
	
	public static Day24Node removeDuplicates(Day24Node head) {
		Day24Node cur = head;
		while (cur.next != null) {
			if (cur.data == cur.next.data) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}
		}
		return head;
	}
}

class Day24Node {
	int data;
	Day24Node next;

	Day24Node(int d) {
		data = d;
		next = null;
	}

}