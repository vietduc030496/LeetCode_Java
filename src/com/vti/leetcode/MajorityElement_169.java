package com.vti.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
 * may assume that the majority element always exists in the array.
 *
 */
public class MajorityElement_169 {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 3, 2, 3 }));
		System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));

	}

	public static int majorityElement(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		int majority = nums.length / 2;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			if (map.get(i) == null) {
				map.put(i, 1);
			} else if (map.get(i) >= majority) {
				return i;
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		return -1;
	}

}
