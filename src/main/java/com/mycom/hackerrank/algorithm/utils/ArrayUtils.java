package com.mycom.hackerrank.algorithm.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author hongquan.doan
 *
 */
public class ArrayUtils {
	
	/**
	 * Convert from an Integer Collection to integer array
	 * @param data
	 * @return
	 */
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
	
	/**
	 * Convert from an Integer collection to long array
	 * @param data
	 * @return
	 */
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
	
	/**
	 * Convert from a Long collection to long array
	 * @param data
	 * @return
	 */
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

	/**
	 * To sort a Map by value
	 * @param unsortMap
	 * @return
	 */
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> unsortMap) {
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
	
	/**
	 * To convert int array to Integer array
	 * @param ids
	 * @return
	 */
	public static Integer[] toConvertInteger(int[] ids) {
		Integer[] newArray = new Integer[ids.length];
		for (int i = 0; i < ids.length; i++) {
			newArray[i] = Integer.valueOf(ids[i]);
		}
		return newArray;
	}
	
	/**
	 * To convert from Integer array to int array
	 * @param WrapperArray
	 * @return
	 */
	public static int[] toint(Integer[] WrapperArray) {
		int[] newArray = new int[WrapperArray.length];
		for (int i = 0; i < WrapperArray.length; i++) {
			newArray[i] = WrapperArray[i].intValue();
		}
		return newArray;
	}
	
	/**
	 * Binary search in array
	 * @param s
	 * @param start
	 * @param end
	 * @param alice
	 * @return
	 */
	public static int binarySearch(int[] s, int start, int end, int value) {
		if (value < s[end]) {
			return -1;
		}
		if (value >= s[start]) {
			return 0;
		}
		if (end - start <= 1) {
			return end;
		}
		int mid = (start + end) / 2;
		if (s[mid] < value) {
			return binarySearch(s, start, mid, value);
		} else if (s[mid] == value) {
			return mid;
		} else {
			return binarySearch(s, mid, end, value);
		}
    }
}
