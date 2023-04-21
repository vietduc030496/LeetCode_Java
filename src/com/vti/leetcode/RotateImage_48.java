package com.vti.leetcode;

public class RotateImage_48 {

	public static void main(String[] args) {

		rotate(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
	}
	
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
	    
	    // Lật ngược ma trận theo chiều dọc
	    for (int i = 0; i < n / 2; i++) {
	        int[] temp = matrix[i];
	        matrix[i] = matrix[n - i - 1];
	        matrix[n - i - 1] = temp;
	    }
	    
	    // Đảo ngược ma trận theo đường chéo chính
	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[j][i];
	            matrix[j][i] = temp;
	        }
	    }
    }

}
