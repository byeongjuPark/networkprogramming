package com.kh.practice.func;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i=arr.length; i>0; i--) {
			arr[arr.length-i]=i;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("양의 정수 : ");
		a = sc.nextInt();
		
		int arr[] = new int[a];
		for(int i=0; i<a; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
	
	public void practice4() {
		String[] arr = new String[] {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(arr[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("문자열 : ");
		String str1 = sc.next();
		System.out.print("문자 : ");
		String str2 = sc.next();
		
		char arrC[] = new char[str1.length()];
		for(int i = 0; i<arrC.length; i++) {
			arrC[i]=str1.charAt(i);
			if(arrC[i]==str2.charAt(0)) {
				System.out.print(i+" ");
				count += 1;
			}
		}
		System.out.println();
		System.out.print(str1 +"에"+str2+"가 존재하는 위치(인덱스) : \n");
		System.out.println(str2 + "개수 : "+count);
		

		sc.close();
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] dayOfTheWeek = new String[]{"월", "화", "수", "목","금","토", "일"};
		int input;
		System.out.print("0~6 사이 숫자 입력 : ");
		input = sc.nextInt();
		if(input <0||input >6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(dayOfTheWeek[input]+"요일");
		}
		sc.close();
	}
}
