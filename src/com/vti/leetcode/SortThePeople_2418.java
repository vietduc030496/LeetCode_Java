package com.vti.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * You are given an array of strings names, and an array heights that consists
 * of distinct positive integers. Both arrays are of length n.
 * 
 * For each index i, names[i] and heights[i] denote the name and height of the
 * ith person.
 * 
 * Return names sorted in descending order by the people's heights.
 * 
 */
public class SortThePeople_2418 {

	public static void main(String[] args) {

		System.out.println(
				Arrays.toString(sortPeople(new String[] { "Mary", "John", "Emma" }, new int[] { 180, 165, 170 })));
		System.out.println(
				Arrays.toString(sortPeople(new String[] { "Alice", "Bob", "Bob" }, new int[] { 155, 185, 150 })));
	}

	public static String[] sortPeople(String[] names, int[] heights) {
		Map<Integer, String> map = new TreeMap<>();
		for (int i = 0; i < heights.length; ++i) {
			map.put(heights[i], names[i]);
		}

		String[] result = new String[names.length];
		int i = names.length - 1;
		for (int key : map.keySet()) {
			result[i--] = map.get(key);
		}
		return result;
	}

}
