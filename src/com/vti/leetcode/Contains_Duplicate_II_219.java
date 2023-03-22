package com.vti.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums and an integer k, return true if there are two
 * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
 * - j) <= k.
 * 
 */
public class Contains_Duplicate_II_219 {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; ++i) {
			int temp = nums[i];
			if (map.get(temp) != null && map.get(temp) != i) {
				if (Math.abs(i - map.get(temp)) <= k) {
					return true;
				}
			}
			map.put(temp, i);

		}
		return false;
	}

}
