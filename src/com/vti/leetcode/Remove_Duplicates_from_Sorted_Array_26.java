package com.vti.leetcode;

public class Remove_Duplicates_from_Sorted_Array_26 {

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int index = 1;
		int val = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index++] = nums[i];
				val = nums[i];
			}
		}
		return index;
	}

}
