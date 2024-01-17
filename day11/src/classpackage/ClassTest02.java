package classpackage;

class Person {

//	필드: 이름,나이,직업
	String name;
	int age;
	String job;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	생성자 : Person클래스의 객체를 생성할 때 name, age, job 초기화
	public Person(String name, int age, String job) {
		this(name,age);
//		this.name = name;
//		this.age = age;
		this.job = job;
	}

	void introduce() {
		System.out.println("이름:" + name + "\n" + age + job);
	}

}

public class ClassTest02 {

	public static void main(String[] args) {

//		클래스명 객체명 = new 생성자();
		Person p1 = new Person("김경윤", 20, "학생");
		Person p2 = new Person("장구", 5);
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.job);
		
		p2.job = "잼민";
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.job);
		
	}

}
