package com.vti.leetcode;

import java.util.Arrays;

/**
 * 
 * Write a function to find the longest common prefix string amongst an array of
 * strings.If there is no common prefix, return an empty string "".
 *
 */
public class Longest_Common_Prefix_14 {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}

		Arrays.sort(strs);

		String firstElement = strs[0];
		String lastElement = strs[strs.length - 1];
		int end = Math.min(firstElement.length(), lastElement.length());
		int start = 0;

		String prefix = "";
		while (start < end && firstElement.charAt(start) == lastElement.charAt(start)) {
			prefix += firstElement.charAt(start);
			start++;
		}

		return prefix;
	}

}
