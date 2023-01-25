package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("정수 :");
		a = sc.nextInt();

		if (a > 0) {
			System.out.println("양수다.");
		} else {
			System.out.println("양수가 아니다.");
		}
		sc.close();
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("정수 :");
		a = sc.nextInt();

		if (a > 0) {
			System.out.println("양수다.");
		} else if (a == 0) {
			System.out.println("0이다.");
		} else if (a < 0) {
			System.out.println("음수다.");
		}
		sc.close();
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("정수 :");
		a = sc.nextInt();

		if ((a % 2) == 0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}
		sc.close();
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);
		int man, candy;
		System.out.print("인원 수 :");
		man = sc.nextInt();
		System.out.print("사탕 개수 :");
		candy = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + (candy / man));
		System.out.println("1인당 사탕 개수 : " + (candy % man));
		sc.close();
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		int grade, cls, clsNum;
		double score;
		String name, temp, gender;
		System.out.print("이름 :");
		name = sc.nextLine();
		System.out.print("학년(숫자만) :");
		grade = sc.nextInt();
		System.out.print("반(숫자만) :");
		cls = sc.nextInt();
		System.out.print("번호(숫자만) :");
		clsNum = sc.nextInt();
		System.out.print("성별(M/F) :");
		temp = sc.next();
		if (temp.charAt(0) == 'M') {
			gender = "남학생";
		} else {
			gender = "여학생";
		}
		System.out.print("성적(소수점 아래 둘째자리까지) :");
		score = sc.nextDouble();

		System.out.println(grade + "학년 " + cls + "반 " + clsNum + "번 " + name + gender + "의 성적은 " + score + "이다.");
		sc.close();
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이 :");
		age = sc.nextInt();

		if (age <= 13) {
			System.out.println("어린이");
		} else if (age <= 19) {
			System.out.println("청소년");
		} else if (age > 19) {
			System.out.println("성인");
		}

		sc.close();
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);
		int korean, english, math, sum;
		double average;
		System.out.print("국어 :");
		korean = sc.nextInt();
		System.out.print("영어 :");
		english = sc.nextInt();
		System.out.print("수학 :");
		math = sc.nextInt();
		sum = korean + english + math;
		average = sum / 3;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		if (korean >= 40 && english >= 40 && math >= 40 && average >= 60) {
			System.out.println("합격 ");
		} else {
			System.out.println("불합격");
		}

		sc.close();
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);
		String idCode;
		System.out.println("주민번호를 입력하세요(-포함) : ");
		idCode = sc.nextLine();
		
		if(idCode.charAt(7)=='1' || idCode.charAt(7)=='3') {
			System.out.println("남자");
		}else if(idCode.charAt(7)=='2' || idCode.charAt(7)=='4') {
			System.out.println("여자");
		}
			
		
		sc.close();
	}
	
	public void practice9() {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("정수1 : ");
		num1 = sc.nextInt();
		System.out.print("정수2 : ");
		num2 = sc.nextInt();
		System.out.print("입력 : ");
		num3 = sc.nextInt();
		
		if(num3 <=num1 || num3 > num2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		sc.close();
	}
	
	public void practice10() {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("입력1 : ");
		num1 = sc.nextInt();
		System.out.print("입력2 : ");
		num2 = sc.nextInt();
		System.out.print("입력3 : ");
		num3 = sc.nextInt();
		
		if(num3 ==num1 && num3 == num2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		sc.close();
	}
	
	public void practice11() {

		Scanner sc = new Scanner(System.in);
		int numA, numB, numC;
		double numAlphaA, numAlphaB, numAlphaC;
		System.out.print("A사원의 연봉 : ");
		numA = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		numB = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		numC = sc.nextInt();
		
		numAlphaA = numA+(numA*0.4);
		numAlphaB = numB+(numA*0);
		numAlphaC = numC+(numA*0.15);
		System.out.println("A사원의 연봉/연봉+a : "+numA+"/"+numAlphaA);
		if(numAlphaA >=3500) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		System.out.println("B사원의 연봉/연봉+a : "+numB+"/"+numAlphaB);
		if(numAlphaB >=3500) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		System.out.println("C사원의 연봉/연봉+a : "+numC+"/"+numAlphaC);
		if(numAlphaC >=3500) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
	
		sc.close();
	}


}
