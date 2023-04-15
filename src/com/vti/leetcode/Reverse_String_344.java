package com.vti.leetcode;

import java.util.Arrays;

/**
 * Write a function that reverses a string. The input string is given as an
 * array of characters s. You must do this by modifying the input array in-place
 * with O(1) extra memory.
 * 
 * Input: s = ["h","e","l","l","o"], Output: ["o","l","l","e","h"]
 * 
 */
public class Reverse_String_344 {

	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		reverseString(s);
		System.out.println(Arrays.toString(s));
	}

	public static void reverseString(char[] s) {
		int start = 0;
		int end = s.length - 1;

		while (start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			++start;
			--end;
		}
	}

}
