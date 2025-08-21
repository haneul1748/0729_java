package project1.com.kh;

import java.util.Scanner;

public class ChestExerciseVoRun {
	public static void main(String[] args) {
		System.out.println("가슴 운동볼륨 구하는 프로그램");
		Scanner sc = new Scanner(System.in);
		
		ChestExerciseVO ce = new ChestExerciseVO();
		System.out.print("회원님 이름을 입력해주세요. > ");
		ce.name = sc.nextLine(); 
		System.out.print("세트수를 입력해주세요. > ");
		ce.sets = sc.nextInt();
		System.out.print("반복횟수를 입력해주세요. > ");
		ce.reps = sc.nextInt();
		System.out.print("체스트프레스 무게를 입력해주세요. > ");
		ce.chestPressW = sc.nextInt();
		System.out.print("딥스 무게를 입력해주세요. > ");
		ce.dipsW = sc.nextInt();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("=======================");
			System.out.println(ce.name + "의 정보!");
			System.out.println("세트수 : " + ce.sets);
			System.out.println("반복횟수 : " + ce.reps);
			System.out.println("체스트프레스 무게 : " + ce.chestPressW);
			System.out.println("딥스 무게 : " + ce.dipsW);
			System.out.println("=======================");
			System.out.println();

			System.out.println("알고싶은 운동볼륨을 선택해주세요. >");
			System.out.println("1.체스트프레스  / 2. 딥스 / 3. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : ce.volume1(); break;
			case 2 : ce.volume2(); break;
			case 3 : exit = true; break;
			default : System.out.println("메뉴를 다시 선택해주세요 !");
			}
		}
		
	}
}
