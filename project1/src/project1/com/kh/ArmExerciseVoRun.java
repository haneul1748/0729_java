package project1.com.kh;

import java.util.Scanner;

public class ArmExerciseVoRun {
	public static void main(String[] args) {
		System.out.println("팔 운동볼륨 구하는 프로그램");
		Scanner sc = new Scanner(System.in);

		ArmExerciseVO ae = new ArmExerciseVO();

		System.out.print("회원님 이름을 입력해주세요. > ");
		String name = sc.nextLine();
		ae.setName(name);
		System.out.print("세트수를 입력해주세요. > ");
		int sets = sc.nextInt();
		ae.setSets(sets);
		System.out.print("반복횟수를 입력해주세요. > ");
		int reps = sc.nextInt();
		ae.setReps(reps);
		System.out.print("바이셉스컬 무게를 입력해주세요. > ");
		int bicepsCurlW = sc.nextInt();
		ae.setBicepsCurlW(bicepsCurlW);
		System.out.print("푸쉬다운 무게를 입력해주세요. > ");
		int pushDown = sc.nextInt();
		ae.setPushDownW(pushDown);

		boolean exit = false;

		while (!exit) {
			System.out.println("=======================");
			System.out.println(ae.getName() + "의 정보!");
			System.out.println("세트수 : " + ae.getSets());
			System.out.println("반복횟수 : " + ae.getReps());
			System.out.println("바이셉스컬 무게 : " + ae.getBicepsCurlW());
			System.out.println("푸쉬다운 무게 : " + ae.getPushDownW());
			System.out.println("=======================");
			System.out.println();

			System.out.println("알고싶은 운동볼륨을 선택해주세요. >");
			System.out.println("1.바이셉스컬 / 2. 푸쉬다운 / 3. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				ae.volume1();
				break;
			case 2:
				ae.volume2();
				break;
			case 3:
				exit = true;
				break;
			default:
				System.out.println("메뉴를 다시 선택해주세요 !");
			}
		}

	}
}
