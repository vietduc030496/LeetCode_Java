package com.vti.leetcode;

/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28 
 * 
 */
public class ExcelSheetColumnNumber_171 {

	public static void main(String[] args) {
		System.out.println(titleToNumber("ZY"));
	}
	
	public static int titleToNumber(String columnTitle) {
        int coulumnNumber = 0;
        int length = columnTitle.length();
        for (int i = 0; i < length; ++i) {
            coulumnNumber += Math.pow(26, length - i - 1) * getIndex(columnTitle.charAt(i));
        }

        return coulumnNumber;
    }

    private static int getIndex(char c) {
        return c - 'A'; 
    }

}
