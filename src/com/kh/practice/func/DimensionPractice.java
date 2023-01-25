package com.kh.practice.func;

public class DimensionPractice {
	public void practice1() {
		String arr[][] = new String[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + " ," + j + ")";
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int arr[][] = new int[4][4];
		int count = 17;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				count -= 1;
				arr[i][j] = count;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
		int arr[][] = new int[4][4];
		arr[0][0] = 6; arr[0][1] = 6; arr[0][2] = 1; arr[0][3] = 0;
		arr[1][0] = 4; arr[1][1] = 10; arr[1][2] = 8; arr[1][3] = 0;
		arr[2][0] = 8; arr[2][1] = 6; arr[2][2] = 5; arr[2][3] = 0;
		arr[3][0] = 0; arr[3][1] = 0; arr[3][2] = 0; arr[3][3] = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[3][i] += arr[j][i];
			}
		}
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				arr[j][3] += arr[j][i];
			}
		}
		for(int i = 0; i <3; i++) {
			for(int j = 0 ; j <3; j++) {
				arr[3][3] += arr[i][j];
				arr[3][3] += arr[j][i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
// arr[3][0] = arr[0][0] ~ arr[2][0] 의 합
// arr[3][1] = arr[0][1] ~ arr[2][1] 의 합
// arr[3][2] = arr[0][2] ~ arr[2][2] 의 합
