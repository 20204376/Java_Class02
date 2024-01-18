package staticTest;

// class명 ItStudent
// 멤버 : 이름, 나이, 과목명("java") subject
// 메소드 : 이름, 나이 , 과목명 출력
// 생성자 1개 : 이름, 나이 초기화

// 메인 메소드
// 객체 2개 생성
// 모든 학생의 과목을 java로 통일
// 메소드 호출

class ItStudent {
	String name;
	int age;
	static String subject;
	
	
	public ItStudent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	void introduce() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("과목:"+ subject);
		
	}
	
	
}


public class StaticTask01 {

	public static void main(String[] args) {

		
		ItStudent Kim = new ItStudent("김경윤",24);
		ItStudent park = new ItStudent("박지성",30);
		
//		모든 학생의 과목을 java로 통일 -> 스태틱 변수 subject = "java";
		ItStudent.subject = "java";
	
		Kim.introduce();
		park.introduce();
		
		
		
		
		
		
		
		
		
		
		
	}

}
