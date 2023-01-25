package com.kh.practice.func;

import java.util.Scanner;

public class CastingPractice {
	public void castingPractice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		String a = sc.next();
		char b = a.charAt(0);

		System.out.printf("a unicode : %d", (int) b);

		sc.close();
	}

	public void castingPractice2() {
		Scanner sc = new Scanner(System.in);
		double korean, english, math;
		int sum, average;
		System.out.print("국어 : ");
		korean = sc.nextDouble();
		System.out.print("영어 : ");
		english = sc.nextDouble();
		System.out.print("수학 : ");
		math = sc.nextDouble();

		sum = (int) korean + (int) english + (int) math;
		average = sum / 3;

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		sc.close();
	}

	public void castingPractice3() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		System.out.println((int) dNum); // 2
		System.out.println(iNum1 / iNum2); // 2
		System.out.println((double) iNum1); // 10.0
		System.out.println(dNum * (double) iNum2); // 10.0
		System.out.println(dNum); // 2.5
		System.out.println((double) iNum1 / (double) iNum2); // 2.5
		System.out.println((int) fNum); // 3
		System.out.println(iNum1 / (int) fNum); // 3
		System.out.println((float) iNum1 / fNum); // 3.3333333333333335
		System.out.println((double) iNum1 / (double) fNum);// 3.3333333
		System.out.println(ch); // 'A'
		System.out.println((int) ch); // 65
		System.out.println((int) (ch + iNum1)); // 75
		System.out.println(ch + iNum1); // 'K'
	}
}
