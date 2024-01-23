package casting02;

public class Student extends Person {

//	필드
	String schoolName; // 학교명
	
	public Student(String name, int age, String job, String schoolName) {
		super(name, age, job);
		this.schoolName = schoolName;
	}

//	자식 클래스에서 추가 할 메소드
	void walk() {
		System.out.println(name+"은/는"+schoolName+"로 등교한다");
	}
	
//	eat() 오버라이딩 : 자식 클래스에서 재정의
	@Override
	void eat() {
		System.out.println(name+"은/는"+schoolName+"에서 점심을 먹는다");
	}
	

	public static void main(String[] args) {

	}


}
