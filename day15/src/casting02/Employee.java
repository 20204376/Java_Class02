package casting02;

public class Employee extends Person {

//	필드
	String workSpace;
	
	
	public Employee(String name, int age, String job, String workSpace) {
		super(name, age, job);
		this.workSpace = workSpace;
	}

//	자식 클래스에서 추가 할 메소드
	void walk() {
		System.out.println(name+"은/는 "+workSpace+"로 출근한다");
	}
	
	@Override
	void eat() {
		System.out.println(name+"은/는"+workSpace+"의 구내 식당에서 점심을 먹는다");
	}

	public static void main(String[] args) {

	}

}
