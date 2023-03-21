package com.vti.leetcode;

public class Remove_Element_27 {

	public int removeElement(int[] nums, int val) {
		int index = 0;
		for (int x : nums) {
			if (x != val) {
				nums[index++] = x;
			}
		}
		return index;
	}

}
