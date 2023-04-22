package com.vti.leetcode;

public class FindPivotIndex_724 {

	public static void main(String[] args) {
		int[] nums = { 1,2,3 };
		System.out.println(pivotIndex(nums));
	}

	public static int pivotIndex(int[] nums) {
		if (nums.length == 1) {
			return 0;
		}

		int size = nums.length;
		int total = 0;
		for (int i = 0; i < size; ++i) {
			total += nums[i];
		}

		int leftSum = 0;
		int rightSum = total - leftSum;
		for (int i = 0; i < size; ++i) {
			rightSum -= nums[i];
			if (leftSum == rightSum) {
				return i;
			}
			leftSum += nums[i];
		}

		return -1;
	}
}
