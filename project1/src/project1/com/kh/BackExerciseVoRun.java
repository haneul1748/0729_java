package project1.com.kh;

import java.util.Scanner;

public class BackExerciseVoRun {
	public static void main(String[] args) {
		System.out.println("등 운동볼륨 구하는 프로그램");
		Scanner sc = new Scanner(System.in);
		
		BackExerciseVO be = new BackExerciseVO();
		System.out.print("회원님 이름을 입력해주세요. > ");
		be.name = sc.nextLine(); 
		System.out.print("세트수를 입력해주세요. > ");
		be.sets = sc.nextInt();
		System.out.print("반복횟수를 입력해주세요. > ");
		be.reps = sc.nextInt();
		System.out.print("풀업 무게를 입력해주세요. > ");
		be.fullUpW = sc.nextInt();
		System.out.print("시티드로우 무게를 입력해주세요. > ");
		be.seatedRowW = sc.nextInt();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("=======================");
			System.out.println(be.name + "의 정보!");
			System.out.println("세트수 : " + be.sets);
			System.out.println("반복횟수 : " + be.reps);
			System.out.println("풀업 무게 : " + be.fullUpW);
			System.out.println("시티드로우 무게 : " + be.seatedRowW);
			System.out.println("=======================");
			System.out.println();

			System.out.println("알고싶은 운동볼륨을 선택해주세요. >");
			System.out.println("1.풀업  / 2. 시티드로우 / 3. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : be.volume1(); break;
			case 2 : be.volume2(); break;
			case 3 : exit = true; break;
			default : System.out.println("메뉴를 다시 선택해주세요 !");
			}
		}
		
	}
}
