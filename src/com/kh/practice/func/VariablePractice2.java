package com.kh.practice.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("첫 번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두 번째 정수 :");
		b = sc.nextInt();
		
		sc.nextLine(); //입력칸 왜 안뜸?
		
		System.out.println("더하기 결과 : "+(a+b));
		System.out.println("빼기 결과 : "+(a-b));
		System.out.println("곱하기 결과 : "+(a*b));
		System.out.println("나누기 결과 : "+(a/b));
		
		sc.close();
	}
	
}
