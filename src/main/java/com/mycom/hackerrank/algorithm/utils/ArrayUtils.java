package com.mycom.hackerrank.algorithm.utils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author hongquan.doan
 *
 */
public class ArrayUtils {
	public static int[] intToIntArray(final Collection<Integer> data) {
		int[] result;
		// null result for null input
		if (data == null) {
			result = null;
			// empty array for empty collection
		} else if (data.isEmpty()) {
			result = new int[0];
		} else {
			final Collection<Integer> effective;
			// if data contains null make defensive copy
			// and remove null values
			if (data.contains(null)) {
				effective = new ArrayList<Integer>(data);
				while (effective.remove(null)) {
				}
				// otherwise use original collection
			} else {
				effective = data;
			}
			result = new int[effective.size()];
			int offset = 0;
			// store values
			for (final Integer i : effective) {
				result[offset++] = i.intValue();
			}
		}
		return result;
	}
	
	public static long[] intToLongArray(final Collection<Integer> data) {
		long[] result;
		// null result for null input
		if (data == null) {
			result = null;
			// empty array for empty collection
		} else if (data.isEmpty()) {
			result = new long[0];
		} else {
			final Collection<Integer> effective;
			// if data contains null make defensive copy
			// and remove null values
			if (data.contains(null)) {
				effective = new ArrayList<Integer>(data);
				while (effective.remove(null)) {
				}
				// otherwise use original collection
			} else {
				effective = data;
			}
			result = new long[effective.size()];
			int offset = 0;
			// store values
			for (final Integer i : effective) {
				result[offset++] = i.intValue();
			}
		}
		return result;
	}
	
	public static long[] longToLongArray(final Collection<Long> data) {
		long[] result;
		// null result for null input
		if (data == null) {
			result = null;
			// empty array for empty collection
		} else if (data.isEmpty()) {
			result = new long[0];
		} else {
			final Collection<Long> effective;
			// if data contains null make defensive copy
			// and remove null values
			if (data.contains(null)) {
				effective = new ArrayList<Long>(data);
				while (effective.remove(null)) {
				}
				// otherwise use original collection
			} else {
				effective = data;
			}
			result = new long[effective.size()];
			int offset = 0;
			// store values
			for (final Long i : effective) {
				result[offset++] = i.intValue();
			}
		}
		return result;
	}
}
