package project1.com.kh;

public class ShoulderExerciseVO {
	public String name;
	public int sets;
	public int reps;
	public int sideLaRaW;
	public int shoulderPressW;

	public void volume1() {
		System.out.println(name + "회원님이 " + sets + " x " + reps + "x" 
						+ sideLaRaW + "무게로" + (sets * reps * sideLaRaW) + "만큼 했습니다.");
	}
	
	public void volume2() {
		System.out.println(name + "회원님이 " + sets + " x " + reps + "x" 
						+ shoulderPressW + "무게로" + (sets * reps * shoulderPressW) + "만큼 했습니다.");
	}
}
