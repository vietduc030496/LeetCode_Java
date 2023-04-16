package com.vti.leetcode;

import java.util.Arrays;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return
 * the only number in the range that is missing from the array.
 *
 */
public class MissingNumber_268 {

	public static void main(String[] args) {
		System.out.println(new int[] { 3, 0, 1 });
		System.out.println(new int[] { 0, 1 });
		System.out.println(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 });

	}

	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int actualTotal = n * (n + 1) / 2;
		int arrayTotal = Arrays.stream(nums).sum();
		return actualTotal - arrayTotal;
	}
}
