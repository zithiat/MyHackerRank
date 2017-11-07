/*
 * https://www.hackerrank.com/challenges/interval-selection/problem
 */
package com.mycom.hackerrank.algorithm.dynamicprogramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;

/**
 * @author hongquan.doan
 *
 */
public class IntervalSelection {

	private static Scanner sc;

	/**
	 * This is about greedy solution
	 * Scan each end point and choose at most 2 interval whose end point is less
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int s = sc.nextInt();
		for (int i = 0; i < s; i++) {
			int n = sc.nextInt();
			Interval[] intvs = new Interval[n];
			for (int j = 0; j < n; j++) {
				intvs[i] = new Interval(sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(intvs);

			Set<Interval> last = new HashSet<>();
			int counter = 0;
			for (int k = 0; k < n; k++) {
				if (process(last, intvs[i])) {
					counter++;
				}
			}
			System.out.println(counter);
		}
	}

	static boolean process(Set<Interval> last, Interval intvl) {
		removeOld(last, intvl);
		last.add(intvl);
		if (last.size() <= 2) {
			return true;
		} else {
			removeLongest(last);
			return false;
		}
	}

	static void removeOld(Set<Interval> last, Interval intvl) {
		Iterator<Interval> ls = last.iterator();
		while (ls.hasNext()) {
			Interval i = ls.next();
			if (i.b < intvl.a) {
				ls.remove();
			}
		}
	}

	static void removeLongest(Set<Interval> last) {
		Iterator<Interval> it = last.iterator();
		Interval max = it.next();
		while (it.hasNext()) {
			Interval i = it.next();
			if (i.b > max.b) {
				max = i;
			}
		}
		last.remove(max);
	}

	static class Interval implements Comparable<Interval> {

		final int a;
		final int b;

		public Interval(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Interval cmpTo) {
			return this.a - cmpTo.a;
		}
	}
}
