package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();

	public void mainMenu() {
		int[] count = pc.personCount(pc.SIZE, pc.SIZE2);
		while (true) {
			System.out.println("학생은 최대 " + pc.SIZE + "명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + count[0] + "명입니다.");
			System.out.println("사원은 최대 " + pc.SIZE2 + "명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + count[1] + "명입니다.");

			System.out.println("원하시는 번호를 입력해주세요!");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			int menuNo = sc.nextInt();

			switch (menuNo) {
			case 1 : studentMenu(); break;
			case 2 : employeeMenu(); break;
			case 9 : System.out.println("종료합니다."); break;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void studentMenu() {

	}

	public void employeeMenu() {

	}

	public void insertStudent() {

	}

	public void printStudent() {

	}

	public void insertEmployee() {

	}

	public void printEmployee() {

	}
}
