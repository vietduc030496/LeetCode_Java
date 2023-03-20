package com.vti.leetcode;

/**
 * Given an integer num, repeatedly add all its digits until the result has only
 * one digit, and return it. 
 * Example: 38 -> 3 + 8 = 11 -> 1 + 1 = 2
 *
 */
public class Add_Digits_258 {

	class Solution {

		/**
		 * Solution 1: Use recursion
		 * 
		 * @param num
		 */
		public int addDigits1(int num) {
			if (num < 10) {
				return num;
			}

			return addDigits1((num / 10) + (num % 10));
		}

		/**
		 * Solution 2: Use math
		 * 
		 * @param num
		 * @return
		 */
		public int addDigits(int num) {
			if (num == 0) {
				return 0;
			}

			if (num % 9 == 0) {
				return 9;
			}

			return num % 9;
		}
	}

}
