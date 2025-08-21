package project1.com.kh;

public class LegExerciseVO {
	public String name;
	public int sets;
	public int reps;
	public int squatW;
	public int deadLiftW;

	public void volume1() {
		System.out.println(name + "회원님이 " + sets + " x " + reps + "x" 
						+ squatW + "무게로" + (sets * reps * squatW) + "만큼 했습니다.");
	}
	
	public void volume2() {
		System.out.println(name + "회원님이 " + sets + " x " + reps + "x" 
						+ deadLiftW + "무게로" + (sets * reps * deadLiftW) + "만큼 했습니다.");
	}
}
