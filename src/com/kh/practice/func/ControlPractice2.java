package com.kh.practice.func;

import java.util.Scanner;

public class ControlPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// practice1();
		// practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice8();
//		practice9();
//		practice10();
//		practice11();
//		practice13();
		practice14();

	}

	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		a = sc.nextInt();

		if (a <= 0) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 0; i < a; i++) {
				System.out.print((i + 1) + " ");
			}
		}
		sc.close();
	}

	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		int a;

		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			a = sc.nextInt();
			if (a > 0) {
				break;
			}
		} while (true);
		for (int i = 1; i <= a; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		sc.close();
	}

	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		int a;

		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			a = sc.nextInt();
			if (a > 0) {
				break;
			}
		} while (true);

		for (int i = a; i > 0; i--) {
			System.out.print(i + " ");
		}
		sc.close();
	}

	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		int a;

		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			a = sc.nextInt();
			if (a > 0) {
				break;
			}
		} while (true);

		for (int i = a; i > 0; i--) {
			System.out.print(i + " ");
		}
		sc.close();
	}

	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		int a, sum = 0;

		System.out.print("정수를 하나 입력하세요 : ");
		a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			sum += i;
			if (i < (a)) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i + " = " + sum);
			}

		}
		sc.close();
	}

	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		int a, b;

		do {
			System.out.print("첫 번째 숫자 : ");
			a = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			b = sc.nextInt();
			if (a <= 0 || b <= 0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			if (a <= 0 || b <= 0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else if (a > b) {
				for (int i = b; a >= i; i++) {
					System.out.print(i + " ");
				}
			} else if (a < b) {
				for (int i = b; b >= i; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("두 수가 동일합니다.");
			}
			break;
		} while (true);
		sc.close();
	}

	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.print("숫자 : ");
		dan = sc.nextInt();
		System.out.println("===== " + dan + "단" + " =====");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}

		sc.close();
	}

	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.print("숫자 : ");
		dan = sc.nextInt();
		if (dan > 10) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {
			for (int j = dan; j < 10; j++) {
				System.out.println("===== " + j + "단" + " =====");
				for (int i = 1; i < 10; i++) {
					System.out.println(j + " * " + i + " = " + (j * i));
				}
			}
		}
		sc.close();
	}

	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		int dan;

		do {
			System.out.print("숫자 : ");
			dan = sc.nextInt();
			if (dan >= 10) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			} else {
				for (int j = dan; j < 10; j++) {
					System.out.println("===== " + j + "단" + " =====");
					for (int i = 1; i < 10; i++) {
						System.out.println(j + " * " + i + " = " + (j * i));
					}
				}
				break;
			}

		} while (true);
		sc.close();
	}

	public static void practice11() {
		Scanner sc = new Scanner(System.in);
		int num, d, sum;
		System.out.print("시작 숫자 : ");
		num = sc.nextInt();
		System.out.print("공차 : ");
		d = sc.nextInt();
		sum = num;

		for (int i = 0; i < 10; i++) {
			System.out.print(sum + " ");
			sum += d;
		}
		sc.close();
	}

	public static void practice12() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String op;

		do {
			System.out.print("연산자(+, -, *, /, %) : ");
			op = sc.next();
			if (op.equals("exit")) {
				break;
			}
			System.out.print("정수1 : ");
			a = sc.nextInt();
			System.out.print("정수2 : ");
			b = sc.nextInt();
			if (b == 0 && op.equals("/")) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			if (op.equals("+")) {
				System.out.println(a + " " + op + " " + b + " = " + (a + b));
				break;
			} else if (op.equals("-")) {
				System.out.println(a + " " + op + " " + b + " = " + (a - b));
				break;
			} else if (op.equals("*")) {
				System.out.println(a + " " + op + " " + b + " = " + (a * b));
				break;
			} else if (op.equals("/")) {
				System.out.println(a + " " + op + " " + b + " = " + (a / b));
				break;
			} else if (op.equals("%")) {
				System.out.println(a + " " + op + " " + b + " = " + (a % b));
				break;
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
		} while (true);
		sc.close();
	}

	public static void practice13() {
		Scanner sc = new Scanner(System.in);
		int a;
		String estr = "*";
		String estrSum = "";
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			estrSum += estr;
			System.out.println(estrSum);
		}
		sc.close();
	}

	public static void practice14() {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		for (int i = a; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}
