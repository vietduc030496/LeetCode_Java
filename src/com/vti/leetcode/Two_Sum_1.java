package com.vti.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers {@code nums} and an integer {@code target}, return indices of the two numbers such that they add up to {@code target}.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Example: nums = [2,7,11,15], target = 9, Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 */
public class Two_Sum_1 {
	
	class Solution {
		
	    public int[] twoSum(int[] nums, int target) {
	        int[] output = new int[2];
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; ++i) {
	            int temp = target - nums[i];
	            if (map.containsKey(temp)) {
	                return new int[] { i, map.get(temp) };
	            }
	            map.put(nums[i], i);
	        }

	        return output;
	    }
	}

}
