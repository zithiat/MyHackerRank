/*
 * https://www.hackerrank.com/challenges/30-binary-search-trees/problem
 */
package com.mycom.hackerrank.thirtydays;

import java.util.*;

public class Day22BinarySearchTree {

	private static Scanner sc;
	
	public static void main(String args[]) {
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		Day22Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}

	public static int getHeight(Day22Node root) {
		if (root == null) {
			return -1;
		}
		int left = 1 + getHeight(root.left);
		int right = 1 + getHeight(root.right);
		return Math.max(left, right);
	}

	public static Day22Node insert(Day22Node root, int data) {
		if (root == null) {
			return new Day22Node(data);
		} else {
			Day22Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}
}

class Day22Node {
	Day22Node left, right;
	int data;

	Day22Node(int data) {
		this.data = data;
		left = right = null;
	}
}