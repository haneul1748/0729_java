package project1.com.kh;

public class ChestExerciseVO {
	public String name;
	public int sets;
	public int reps;
	public int chestPressW;
	public int dipsW;
	
	public void volume1() {
		System.out.println(name + "회원님이 " + sets + " x " + reps + "x" 
						+ chestPressW + "무게로" + (sets * reps * chestPressW) + "만큼 했습니다.");
	}
	
	public void volume2() {
		System.out.println(name + "회원님이 " + sets + " x " + reps + "x" 
						+ dipsW + "무게로" + (sets * reps * dipsW) + "만큼 했습니다.");
	}
}
