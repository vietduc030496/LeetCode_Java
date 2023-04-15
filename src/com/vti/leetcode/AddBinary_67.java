package com.vti.leetcode;

/**
 * Given two binary strings a and b, return their sum as a binary string. Input:
 * a = "11", b = "1", Output: "100"
 *
 */
public class AddBinary_67 {

	public static void main(String[] args) {
		System.out.println(addBinary("1111", "1111"));
	}

	public static String addBinary(String a, String b) {
		int remember = 0;
		StringBuilder sb = new StringBuilder();

		int lastIndexA = a.length() - 1;
		int lastIndexB = b.length() - 1;

		while (lastIndexA >= 0 && lastIndexB >= 0) {
			if (a.charAt(lastIndexA) == '1' && b.charAt(lastIndexB) == '1') {
				sb.append(remember);
				remember = 1;
			} else if (a.charAt(lastIndexA) == '0' && b.charAt(lastIndexB) == '0') {
				sb.append(remember);
				remember = 0;
			} else if (a.charAt(lastIndexA) == '1' || b.charAt(lastIndexB) == '1') {
				if (remember > 0) {
					sb.append("0");
				} else {
					sb.append("1");
					remember = 0;
				}
			}

			--lastIndexA;
			--lastIndexB;
		}
		while (lastIndexA >= 0) {
			if (a.charAt(lastIndexA) == '0') {
				sb.append(remember);
				remember = 0;
			} else {
				if (remember > 0) {
					sb.append("0");
				} else {
					sb.append("1");
					remember = 0;
				}
			}
			--lastIndexA;
		}

		while (lastIndexB >= 0) {
			if (b.charAt(lastIndexB) == '0') {
				sb.append(remember);
				remember = 0;
			} else {
				if (remember > 0) {
					sb.append("0");
				} else {
					sb.append("1");
					remember = 0;
				}
			}
			--lastIndexB;
		}
		if (remember > 0) {
			sb.append(remember);
		}
		return sb.reverse().toString();
	}

}
