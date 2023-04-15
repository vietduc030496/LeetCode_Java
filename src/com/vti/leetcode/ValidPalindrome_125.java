package com.vti.leetcode;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
 * and removing all non-alphanumeric characters, it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 */
public class ValidPalindrome_125 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("race a car"));
	}
	
	public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
        	char startChar = s.charAt(start);
        	
            if (!isLetterOrDigit(startChar)) {
                ++start;
                continue;
            }
            
            char endChar = s.charAt(end);
            if (!isLetterOrDigit(endChar)) {
                --end;
                continue;
            }
            if (startChar != endChar) {
                return false;
            }

            ++start;
            --end;
        }
        return true;
    }
	
	private static boolean isLetterOrDigit(char c) {
		return Character.isLetter(c) || Character.isDigit(c);
	}

}
