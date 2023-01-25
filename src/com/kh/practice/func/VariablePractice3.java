package com.kh.practice.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void exec() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.print("가로 길이 : ");
		a = sc.nextDouble();
		System.out.print("세로 길이 :");
		b = sc.nextDouble();
		
		System.out.println("면적 : "+(a*b));
		System.out.println("둘레 : "+((a+b)*2));

		sc.close();
	}
}


//키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
//계산 공식 ) 면적 : 가로 * 세로 
//둘레 : (가로 + 세로) * 2 
//ex. 
//가로 : 13.5 
//세로 : 41.7 
//면적 : 562.95 
//둘레 : 110.4
