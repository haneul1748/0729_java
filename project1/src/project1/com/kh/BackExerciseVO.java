package project1.com.kh;

public class BackExerciseVO {
	public String name;
	public int sets;
	public int reps;
	public int fullUpW;
	public int seatedRowW;

	public void volume1() {
		System.out.println(name + "회원님이 " + sets + " x " + reps + "x" 
						+ fullUpW + "무게로" + (sets * reps * fullUpW) + "만큼 했습니다.");
	}
	
	public void volume2() {
		System.out.println(name + "회원님이 " + sets + " x " + reps + "x" 
						+ seatedRowW + "무게로" + (sets * reps * seatedRowW) + "만큼 했습니다.");
	}
}
