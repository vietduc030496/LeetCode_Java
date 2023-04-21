package com.vti.leetcode;

/**
 * You have a long flowerbed in which some of the plots are planted, and some
 * are not. However, flowers cannot be planted in adjacent plots.
 * 
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty
 * and 1 means not empty, and an integer n, return true if n new flowers can be
 * planted in the flowerbed without violating the no-adjacent-flowers rule and
 * false otherwise.
 * 
 */
public class CanPlaceFlowers_605 {

	public static void main(String[] args) {
		int[] flowerbed = { 1, 0, 0, 0, 0, 1 };
		System.out.println(canPlaceFlowers(flowerbed, 2));

	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		if (n == 0) {
			return true;
		}

		int size = flowerbed.length;
		int count = 0;

		for (int i = 0; i < size; ++i) {
			if (flowerbed[i] == 1) {
				++i;
				continue;
			}

			boolean isEmptyLeft = i == 0 || flowerbed[i - 1] == 0;
			boolean isEmptyRight = i == size - 1 || flowerbed[i + 1] == 0;

			if (isEmptyLeft && isEmptyRight) {
				if (++count == n) {
					return true;
				}
				++i;
			}
		}
		return false;
	}

}
