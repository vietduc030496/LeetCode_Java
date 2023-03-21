package com.vti.leetcode;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right
 * and from right to left.
 *
 */
public class Palindrome_Number_9 {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		if (x < 10) {
			return true;
		}

		String strNumber = String.valueOf(x);
		StringBuilder builder = new StringBuilder(strNumber);
		builder.reverse();
		return strNumber.equals(builder.toString());
	}

}
