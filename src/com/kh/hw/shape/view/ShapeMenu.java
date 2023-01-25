package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		int menuNum;
		do {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			menuNum = sc.nextInt();
			if (menuNum == 9) {
				break;
			} else if (menuNum == 3) {
				triangleMenu();
				break;
			} else if (menuNum == 4) {
				squareMenu();
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		} while (true);

	}

	public void triangleMenu() {
		int menuNum;
		int type = 3;
		do {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			menuNum = sc.nextInt();
			if (menuNum == 9) {
				inputMenu();
				break;
			} else if (menuNum == 1) {
				inputSize(type, menuNum);
			} else if (menuNum == 2) {
				inputSize(type, menuNum);
			} else if (menuNum == 3) {
				printInformation(type);
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		} while (true);

	}

	public void squareMenu() {
		int menuNum;
		int type= 4;
		do {
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			menuNum = sc.nextInt();
			if (menuNum == 9) {
				inputMenu();
				break;
			} else if (menuNum == 1) {
				inputSize(type, menuNum);
			} else if (menuNum == 2) {
				inputSize(type, menuNum);
			} else if (menuNum == 3) {
				inputSize(type, menuNum);
			} else if (menuNum == 4) {
				printInformation(type);
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		} while (true);

	}

	public void inputSize(int type, int menuNum) {
		int height, width;
		String color;
		if(type == 3) {
			//삼각형일 경우
			if(menuNum == 1) {
				System.out.print("높이 :");
				height =sc.nextInt();
				System.out.print("너비 :");
				width =sc.nextInt();
				System.out.println("삼각형의 넓이 :"+tc.calcArea(height, width));
			}else if(menuNum == 2) {
				System.out.print("색깔을 입력하세요 : ");
				color = sc.next();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
		}else if(type == 4) {
			//사각형일 경우
			if(menuNum==1 || menuNum ==2) {
				System.out.print("높이 :");
				height =sc.nextInt();
				System.out.print("너비 :");
				width =sc.nextInt();
				if(menuNum == 1) {
					System.out.println("사각형의 둘레 :"+scr.calcPerimeter(height, width));
				}else if(menuNum ==2) {
					System.out.println("사각형의 둘레 :"+scr.calcArea(height, width));
				}
			}else if(menuNum ==3) {
				System.out.print("색깔을 입력하세요 : ");
				color = sc.next();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
		}
		
	}

	public void printInformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		}else if(type ==4) {
			System.out.println(scr.print());
		}
	}

}
