package com.kh.practice.func;

public class AjPractice {
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				int num = (int)(Math.random()*10)+1;
				arr[i][j] = num;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
