package com.vti.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * You are given a large integer represented as an integer array digits, where
 * each digits[i] is the ith digit of the integer. The digits are ordered from
 * most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 */
public class PlusOne_66 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] { 1, 2, 3 })));
		System.out.println(Arrays.toString(plusOne(new int[] { 4, 3, 2, 1 })));
		System.out.println(Arrays.toString(plusOne(new int[] { 9 })));

	}

	public static int[] plusOne(int[] digits) {
		int lastIndex = digits.length - 1;
		int valueRemember = 0;

		List<Integer> list = new ArrayList<>();
		for (int i = lastIndex; i >= 0; --i) {
			int total = 0;
			if (i == lastIndex) {
				total = digits[i] + valueRemember + 1;
			} else {
				total = digits[i] + valueRemember;
			}

			if (total > 9) {
				valueRemember = 1;
			} else {
				valueRemember = 0;
			}

			list.add(lastIndex - i, total % 10);
			valueRemember = total / 10;
		}

		if (valueRemember > 0) {
			list.add(valueRemember);
		}

		Collections.reverse(list);

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

}
