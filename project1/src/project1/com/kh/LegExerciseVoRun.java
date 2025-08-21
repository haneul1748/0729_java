package project1.com.kh;

import java.util.Scanner;

public class LegExerciseVoRun {
	public static void main(String[] args) {
		System.out.println("하체 운동볼륨 구하는 프로그램");
		Scanner sc = new Scanner(System.in);
		
		LegExerciseVO le = new LegExerciseVO();
		System.out.print("회원님 이름을 입력해주세요. > ");
		le.name = sc.nextLine(); 
		System.out.print("세트수를 입력해주세요. > ");
		le.sets = sc.nextInt();
		System.out.print("반복횟수를 입력해주세요. > ");
		le.reps = sc.nextInt();
		System.out.print("스쿼트 무게를 입력해주세요. > ");
		le.squatW = sc.nextInt();
		System.out.print("데드리프트 무게를 입력해주세요. > ");
		le.deadLiftW = sc.nextInt();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("=======================");
			System.out.println(le.name + "의 정보!");
			System.out.println("세트수 : " + le.sets);
			System.out.println("반복횟수 : " + le.reps);
			System.out.println("스쿼트 무게 : " + le.squatW);
			System.out.println("데드리프트 무게 : " + le.deadLiftW);
			System.out.println("=======================");
			System.out.println();

			System.out.println("알고싶은 운동볼륨을 선택해주세요. >");
			System.out.println("1.스쿼트  / 2. 데드리프트 / 3. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : le.volume1(); break;
			case 2 : le.volume2(); break;
			case 3 : exit = true; break;
			default : System.out.println("메뉴를 다시 선택해주세요 !");
			}
		}
		
	}
}
