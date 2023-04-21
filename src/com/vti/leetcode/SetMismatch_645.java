package com.vti.leetcode;

import java.util.Arrays;

/**
 * You have a set of integers s, which originally contains all the numbers from
 * 1 to n. Unfortunately, due to some error, one of the numbers in s got
 * duplicated to another number in the set, which results in repetition of one
 * number and loss of another number.
 * 
 * You are given an integer array nums representing the data status of this set
 * after the error.
 * 
 * Find the number that occurs twice and the number that is missing and return
 * them in the form of an array.
 *
 */
public class SetMismatch_645 {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 2 };
		System.out.println(Arrays.toString(findErrorNums(nums)));
	}

	public static int[] findErrorNums(int[] nums) {

		int size = nums.length;
		int[] ans = new int[size + 1];
		for (int i = 0; i < size; ++i) {
			ans[nums[i]] = ans[nums[i]] + 1;
		}

		int[] result = new int[2];
		for (int i = 0; i < ans.length; ++i) {
			if (ans[i] == 2) {
				result[0] = i;
			} else if (ans[i] == 0) {
				result[1] = i;
			}
		}

		return result;
	}

}
