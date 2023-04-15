package com.vti.leetcode;

/**
 * Given an integer n, return true if it is a power of three. Otherwise, return
 * false. An integer n is a power of three, if there exists an integer x such
 * that n == 3x.
 * 
 * Input: n = 27, Output: true, Explanation: 27 = 3 * 3 * 3
 *
 */
public class PowerOfThree_326 {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(28));
	}

	public static boolean isPowerOfThree(int n) {
		if (n < 1) {
			return false;
		}

		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}
}
