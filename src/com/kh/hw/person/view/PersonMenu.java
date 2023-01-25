package com.kh.hw.person.view;

import java.util.Scanner;
import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	
	public void mainMenu() {
		//메인 메뉴를 출력하는 메소드
		int mainMenuCount;
		int escapeNum = 0;
		
		while(true) {
			
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 4명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			mainMenuCount = sc.nextInt();
			switch(mainMenuCount) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				escapeNum = 1;
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			if(escapeNum == 1){
				break;
			}
		}
		

	}
	
	public void studentMenu() {
		//학생 메뉴를 출력하는 메소드
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
	}
	
	public void employeeMenu() {
		//사원 메뉴를 출력하는 메소드
		System.out.println("사원 메뉴");
	}
	
	public void insertStudent() {
		//사용자에게 객체배열에 저장할 학생 데이터를 받는 메소드
	}
	
	public void printStudent() {
		//객체배열에 저장된 학생 데이터를 출력하는 메소드
	}
	
	public void insertEmployee() {
		//사용자에게 객체배열에 저장할 사원 데이터를 받는 메소드
	}
	
	public void printEmployee() {
		//객체배열에 저장된 사원 데이터를 출력하는 메소드
	}

}
