package project1.com.kh;

import java.util.Scanner;

public class ShoulderExerciseVoRun {
	public static void main(String[] args) {
		System.out.println("어깨 운동볼륨 구하는 프로그램");
		Scanner sc = new Scanner(System.in);
		
		ShoulderExerciseVO se = new ShoulderExerciseVO();
		System.out.print("회원님 이름을 입력해주세요. > ");
		se.name = sc.nextLine(); 
		System.out.print("세트수를 입력해주세요. > ");
		se.sets = sc.nextInt();
		System.out.print("반복횟수를 입력해주세요. > ");
		se.reps = sc.nextInt();
		System.out.print("사레레 무게를 입력해주세요. > ");
		se.sideLaRaW = sc.nextInt();
		System.out.print("숄더프레스 무게를 입력해주세요. > ");
		se.shoulderPressW = sc.nextInt();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("=======================");
			System.out.println(se.name + "의 정보!");
			System.out.println("세트수 : " + se.sets);
			System.out.println("반복횟수 : " + se.reps);
			System.out.println("사레레 무게 : " + se.sideLaRaW);
			System.out.println("숄더프레스 무게 : " + se.shoulderPressW);
			System.out.println("=======================");
			System.out.println();

			System.out.println("알고싶은 운동볼륨을 선택해주세요. >");
			System.out.println("1.사레레  / 2. 숄더프레스 / 3. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : se.volume1(); break;
			case 2 : se.volume2(); break;
			case 3 : exit = true; break;
			default : System.out.println("메뉴를 다시 선택해주세요 !");
			}
		}
		
	}
}
