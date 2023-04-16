package com.vti.leetcode;

public class RomanToInteger_13 {

	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		int result = 0;
		int previousValue = 0;
		for (char c : s.toCharArray()) {
			int value = getValue(c);
			if (value <= previousValue) {
				result += value;
			} else {
				result += value - 2 * previousValue;
			}
			previousValue = value;
		}
		return result;
	}

	private static int getValue(char c) {
		return switch (c) {
		case 'I' -> 1;
		case 'V' -> 5;
		case 'X' -> 10;
		case 'L' -> 50;
		case 'C' -> 100;
		case 'D' -> 500;
		case 'M' -> 1000;
		default -> 0;
		};
	}
}
