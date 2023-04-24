package com.vti.leetcode;

import java.util.Arrays;

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

	/**
	 * 1. Lặp từ phần tử cuối cùng của mảng
	 * 2. Phần tử cuối cùng nhỏ hơn 9, tăng thêm 1 và trả về digits
	 * 3. Nếu lớn hơn 9, set thành 0 và chuyển đến giá trị tiếp theo của vòng lặp và tiếp tục bước 2 đến khi có giá trị trả về hoặc hết vòng lặp
	 * 4. Nếu chạy hết vòng lặp, có nghĩa output trả về phải thêm giá trị
	 * 5. Tạo array mới có length lớn hơn digits 1, set array[0] = 1, Ex: [9, 9, 9] -> [1, 0, 0, 0]
	 *
	 */
	public static int[] plusOne(int[] digits) {
		int n = digits.length;

		for (int i = n - 1; i >= 0; --i) {
			if (digits[i] < 9) {
				return digits;
			}

			digits[n] = 0;
		}

		int[] newArr = new int[n + 1];
		newArr[0] = 1;
		return newArr;
	}

}
