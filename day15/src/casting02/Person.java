package casting02;

public class Person {
	
//	필드
	String name;
	int age; 
	String job;
	
//	부모 생성자
	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	void eat() {
		System.out.println(name + "은/는 밥을 먹는다");
	}

	public static void main(String[] args) {

	}

}
