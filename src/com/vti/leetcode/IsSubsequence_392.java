package com.vti.leetcode;

public class IsSubsequence_392 {

	public static void main(String[] args) {
		System.out.println(isSubsequence("abc", "ahbgdc"));
		System.out.println(isSubsequence("axc", "ahbgdc"));
	}
	
	public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int index = 0;
        for (int i = 0; i < t.length(); ++i) {
            if (t.charAt(i) == s.charAt(index)) {
                ++index;
            }

            if (index == s.length()) {
                return true;
            }
        }
        return false;
    }

}
