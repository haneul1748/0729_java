package project1.com.kh;

public class ArmExerciseVO {
	// 필드부
	private String name;
	private int sets;
	private int reps;
	private int bicepsCurlW;
	private int pushDownW;
	
	//getter
	public String getName() {
		return name;
	}
	public int getSets() {
		return sets;
	}
	public int getReps() {
		return reps;
	}
	public int getBicepsCurlW() {
		return bicepsCurlW;
	}
	public int getPushDownW () {
		return pushDownW;
	}
	//setter
	public void setName (String name) {
		this.name = name;
	}
	public void setSets(int sets) {
		this.sets = sets;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	public void setBicepsCurlW (int bicepsCurlW) {
		this.bicepsCurlW = bicepsCurlW;
	}
	public void setPushDownW(int pushDownW) {
		this.pushDownW = pushDownW;
	}
	// 생성자부
	
	public ArmExerciseVO() {}
	// 모든 매개변수를 담은 생성자 
	public ArmExerciseVO(String name, int sets, int reps , int bicepsCurlW, int pushDown) {
		this.name = name;
		this.sets = sets;
		this.reps = reps;
		this.bicepsCurlW = bicepsCurlW;
		this.pushDownW = pushDownW;
	}
	
	// 메소드부
	public void volume1() {
		System.out.println(name + "회원님이 " + sets + " x " + reps + "x" 
						+ bicepsCurlW + "무게로" + (sets * reps * bicepsCurlW) + "만큼 했습니다.");
	}
	
	public void volume2() {
		System.out.println(name + "회원님이 " + sets + " x " + reps + "x" 
						+ pushDownW + "무게로" +(sets * reps * pushDownW) + "만큼 했습니다.");
	}
	
	// 모든 필드를 담는 info() 
	public String info() {
		String info = "회원 이름 : " + name 
					+ " 세트수 : " + sets 
					+ " 반복횟수 : " + reps
					+ " 바이셉스 컬 무게 : " + bicepsCurlW
					+ " 푸쉬 다운 무게 : " + pushDownW; 
		return info;
	}
}
