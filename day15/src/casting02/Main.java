package casting02;

public class Main {

	
	public static void main(String[] args) {

		Person p1 = new Person("짱구", 5, "유치원생");
		Student st1 = new Student("맹구",20,"대학생","코리아학교");
		Employee e1 = new Employee("홍길동", 31, "개발자", "코리아회사");
		
//		객체 오버라이딩 진행되는 것 확인
		
//		p1.eat();
//		st1.eat();
//		e1.eat();
		
		printWalk(st1);
		printWalk(e1);
		printWalk(p1);
		
	}
//
//	static void printWalk(Student st) {
//		st.walk();
//		
//	}
//	
//	static void printWalk(Employee e) {
//		e.walk();
//		
//	}
	
//	매개변수에 부모 클래스 타입으로 하면 들어오면서 자동으로 업캐스팅 됨
	static void printWalk(Person person) {
//		업캐스팅 확인
//		person.walk(); // person 클래스엔 walk() 메소드 없음
		if(person instanceof Student ) {
			((Student)person).walk(); //다운 캐스팅
		}else if(person instanceof Employee) {
			((Employee)person).walk();
		}else {
			System.out.println("걷기 싫어");
		}
	}
	
}
