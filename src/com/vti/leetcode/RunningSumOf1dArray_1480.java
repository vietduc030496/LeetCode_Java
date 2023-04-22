package com.vti.leetcode;

import java.util.Arrays;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] =
 * sum(nums[0]…nums[i]).
 * 
 * Return the running sum of nums.
 *
 */
public class RunningSumOf1dArray_1480 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(runningSum(nums)));
	}

	public static int[] runningSum(int[] nums) {
		int total = nums[0];
		for (int i = 1; i < nums.length; i++) {
			nums[i] += total;
			total = nums[i];
		}
		return nums;
	}

}