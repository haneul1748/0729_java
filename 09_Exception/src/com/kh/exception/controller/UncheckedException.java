package com.kh.exception.controller;

import java.nio.channels.AlreadyBoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	/*
	 * 프로그램 실행 시 발생하는 예외들 RuntimeException
	 * 
	 * - NullPointerException : 주소값 객체를 참조했더니 null값이 들어있을 경우 발생하는 예외 -
	 * ArrayIndexOutBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외 -
	 * ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외 - ArithmeticException : 나누기
	 * 연산을 0으로 나누면 발생하는 예외 - NegativeArraySizeException : 배열을 할당할 때 크기를 음수로 지정하면
	 * 발생하는 예외 ...
	 * 
	 * RuntimeException과 관련된 예외들은 공통점이 있음 개발자가 예측이 가능함
	 */

	// ArithmeticException
	public void method1() {
		// 사용자에게 두 개의 정수값을 입력받아서 나눗셈을 한 뒤 결과를 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 정수를 입력해주세요.");
		int num1 = sc.nextInt();

		System.out.println("두 번째 정수를 입력해주세요.");
		int num2 = sc.nextInt();
		/*
		 * // 방법 1. 예외발생 자체를 완전 차단해버림 if (num2 != 0) { System.out.println("연산 결과 : " +
		 * (num1 / num2)); } else { System.out.println("너 혼꾸녕 나고싶어?"); }
		 */
		// 방법 2. 예외처리를 진행

		// 예외처리 :
		// 예외 상황을 감지하고 예외상황 발생 시
		// 프로그램이 비정상적인 종료가 되는 것을 방지하고 적절한 대응 조취를 취하는 것

		/*
		 * try ~ catch문
		 * 
		 * [ 표현법 ]
		 * 
		 * try {
		 * 
		 * (num1 / num2) // 예외가 발생할수도 있는 구문
		 * 
		 * } catch(발생할예외클래스명 변수명) { => 매개변수
		 * 
		 * 해당 예외가 발생했을 때 실행할 구문
		 * 
		 * }
		 */
		try {

			System.out.println(num1 / num2);

			System.out.println("올바른 정수 입력!");
			// 정말로 예외가 발생할 수 있는 코드만 입력
			// 예외가 일어나야 처리가 가능한데 매커니즘일 뿐 원천 차단은 if문으로 상쇄
		} catch (ArithmeticException e) {

			System.out.println("두 번째 정수에 0을 입력하시면 나눌 수가 없습니다.");

		}

		System.out.println("프로그램 종료");
	}

	public void homeowrk() {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 추가하기");
			System.out.println("2. 검색하기");
			int menuNo = 0;

			try {
				menuNo = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자만 넣어");
			}
			// 예외 처리 시 catch문에 적어야하는 내용이 출력문은 아님
			sc.nextLine();

			System.out.println(menuNo + "번 메뉴를 선택하셨습니다.");

		}
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력해주세요.(0은 제외) > ");

		try {
			int num = sc.nextInt();
			// InputMismatchException

			System.out.println("100을 입력값으로 나눈 결과 : " + (100 / num));
			// ArithmaticException
		}

		catch (InputMismatchException e) {
			System.out.println("프로그램 종료");
		} catch (ArithmeticException e) {
			System.out.println("0이 아니에요!");
		}
	}

	public void method3() {
		// 배열

		// 사용자에게 정수값을 입력받아서
		// 입력받은 만큼의 크기를 가진 배열을 생성 및 할당하고
		// 100번째 인덱스 값을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값을 입력해주세요.");

		// InputMismatchException : 스캐너 메소드의 자료형과 일치하지않음
		// NegativeArraySizeException : 배열의 크기를 음수로 지정하면 파업
		// ArrayIndexOutOfBoundException : 배열의 크기보다 큰 인덱스에 접근하면 파업

		try {

			int num = sc.nextInt(); // <-- 정수를 입력하면 파업
			int[] Arr = new int[num]; // <-- 음수가 들어가면 파업
			System.out.println(Arr[100]); // <-- index가 없으면 파업

		} catch (InputMismatchException e) {
			e.printStackTrace(); // 얘는 꼭 개발단계에서만 사용
			System.out.println("정수넣어라!");
		} catch (RuntimeException e) {
			System.out.println("아마도 음수를 입력했거나...? 100보다 크지 않아서...?");
			// RuntimeException은 어떤오류인진모르지만 상위클래스로 어떤 오류든 잡을수있음.

			/*
			 * } catch (NegativeArraySizeException e) { System.out.println("음수넣지마!"); }
			 * catch (ArrayIndexOutOfBoundsException e) { System.out.println("101보다 큰수)"); }
			 */

		}

	}
}
