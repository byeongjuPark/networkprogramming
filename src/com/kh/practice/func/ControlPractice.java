package com.kh.practice.func;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;
		default:
			System.out.println("없는 메뉴입니다.");
		}
		sc.close();
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("숫자를 한 개 입력하세요.");
		num = sc.nextInt();

		if (num <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else if ((num % 2) == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("짝수다");
		}
		sc.close();
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		int korean, english, math;
		int sum;
		double average;
		System.out.print("국어점수 : ");
		korean = sc.nextInt();
		System.out.print("수학점수 : ");
		math = sc.nextInt();
		System.out.print("영어점수 : ");
		english = sc.nextInt();

		sum = korean + math + english;
		average = sum/3;
		
		System.out.println("국어 : "+korean);
		System.out.println("수학 : "+math);
		System.out.println("영어 : "+english);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+average);
		if(average >=40) {
			System.out.println("축하합니다, 합격입니다! ");
		}else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
	}
	
	public void practice4() {

		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("1~12 사이의 정수 입력 : ");
		month = sc.nextInt();
	//12~2 겨울 3~5 봄 6~8 여름 9~11가을
		switch(month) {
		case 12:case 1:case 2:
			System.out.println(month+"월은 겨울입니다.");
			break;
		case 3:case 4:case 5:
			System.out.println(month+"월은 봄입니다.");
			break;
		case 6:case 7:case 8:
			System.out.println(month+"월은 여름입니다.");
			break;
		case 9:case 10:case 11:
			System.out.println(month+"월은 가을입니다.");
			break;
		default:
			System.out.println(month+"월은 잘못 입력된 날입니다.");
		}
		sc.close();
	}
	
	public void practice5() {

		Scanner sc = new Scanner(System.in);
		String id = "myId";
		String pw = "myPassword12";
		System.out.print("아이디 : ");
		String idTemp = sc.next();
		System.out.print("비밀번호 : ");
		String pwTemp = sc.next();
		
		if(id.equals(idTemp)) {
			if(pw.equals(pwTemp)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		sc.close();
	}
	
	public void practice6() {

		Scanner sc = new Scanner(System.in);
		String admin = "관리자";
		String member = "회원";
		String nonMember = "비회원";
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String permission = sc.next();
		
		if(permission.equals(admin)) {
			System.out.println("회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회");
		}else if(permission.equals(member)) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(permission.equals(nonMember)) {
			System.out.println("게시글 조회");
		}else {
			System.out.println("없는 권한입니다.");
		}
		sc.close();
		
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		double height, weight, bmi;
		System.out.print("키(m)를 입력해 주세요 : ");
		height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = sc.nextDouble();
		bmi = weight/(height*height);
		System.out.println("BMI 지수 : "+bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi >=18.5 && bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi >=23 && bmi < 25) {
			System.out.println("과체중");
		}else if(bmi >=25 && bmi < 30) {
			System.out.println("비만");
		}else if(bmi >= 30) {
			System.out.println("고도 비만");
		}
		sc.close();
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("피연산자1 입력 : ");
		a = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		b = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String cal = sc.next();
		
		if(cal.equals("+")) {
			System.out.println(a+" "+cal+" " +b+" = "+(a+b) );
		}else if(cal.equals("-")) {
			System.out.println(a+" "+cal+" " +b+" = "+(a-b) );
		}else if(cal.equals("*")) {
			System.out.println(a+" "+cal+" " +b+" = "+(a*b) );
		}else if(cal.equals("/")) {
			System.out.println(a+" "+cal+" " +b+" = "+((double)a/(double)b) );
		}else if(cal.equals("%")) {
			System.out.println(a+" "+cal+" " +b+" = "+(a%b) );
		}
		
		sc.close();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		double mE, fE, ass, att; //중간고사, 기말고사, 과제, 출석
		System.out.print("중간 고사 점수 : ");
		mE = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		fE = sc.nextDouble();
		System.out.print("과제 점수 : ");
		ass = sc.nextDouble();
		System.out.print("출석 회수 : ");
		att = sc.nextDouble();
		
		mE *=0.2;
		fE *=0.3;
		ass *=0.3;
		double sum = mE+fE+ass+att;
		System.out.println("중간 고사 점수(20) : "+mE);
		System.out.println("기말 고사 점수(30) : "+fE);
		System.out.println("과제 점수(30) : "+ass);
		System.out.println("출석 점수(20) : "+att);
		System.out.println("총점 : "+sum);
		
		if(att<14||sum<70) {
			System.out.println("Fail [점수 미달]");
		}else if(sum >=70) {
			System.out.println("Pass");
		}
		sc.close();
	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1:practice1();break;
		case 2:practice2();break;
		case 3:practice3();break;
		case 4:practice4();break;
		case 5:practice5();break;
		case 6:practice6();break;
		case 7:practice7();break;
		case 8:practice8();break;
		case 9:practice9();break;
		default:
			
		}
		sc.close();
	}
}
