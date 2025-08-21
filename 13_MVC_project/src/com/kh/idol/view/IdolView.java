package com.kh.idol.view;

import java.util.Scanner;

import com.kh.idol.controller.IdolController;

public class IdolView {
	
	// 필드부
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();
	
	// 생성자
	
	// 메소드부
	// 프로그램을 실행했을 때 가장 먼저 보여질 화면을 출력해주는 기능
	public void mainMenu() {
		
		System.out.println("\n\n aespa커뮤니티에 오신걸 환영합니다.");
		
		String emg = """
				＼북-적／＼북-적／
				ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ
					""";
		
		System.out.println(emg);
		
		while(true) {
			
			System.out.println("이용하실 서비스를 선택해주세요.");
			System.out.println("1. 에스파 정보보기");
			System.out.println("2. 회원가입");
			System.out.println("3. 로그인");
			System.out.println("4. 게시판 서비스");
			System.out.println("5. 프로그램 종료");
			System.out.println("메뉴 번호 입력 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : info(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			default : System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
			
			
		}
		

		
	}

	private void info() {
		System.out.println();
		System.out.println("정보보기 서비스입니다. ");
		
	}
	
	
	
	
	
	
	
	
}
