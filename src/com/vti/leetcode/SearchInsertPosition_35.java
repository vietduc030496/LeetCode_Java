package com.vti.leetcode;

/**
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order. You must write an algorithm with O(log n) runtime
 * complexity.
 * 
 * Input: nums = [1,3,5,6], target = 5, Output: 2
 */
public class SearchInsertPosition_35 {

	public static void main(String[] args) {

	}

	public static int searchInsert(int[] nums, int target) {
		int temp = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] == target) {
				return i;
			} else if (nums[i] < target) {
				temp = i + 1;
			}
		}
		return temp;
	}

}
