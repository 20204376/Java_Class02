package person;

public class Main {

	public static void main(String[] args) {

//		부모클래스 person
		Person p = new Person();
		
		p.sleep();
//		p.study(); 부모의 객체에서 자식의 멤버 접근 불가!
		
		Student s = new Student();
		s.study();
		s.eat(); //자식 클래스의 객체는 부모의 멤버 접근 가능
		
		Employee e = new Employee();
		e.employeeNumber = 10;
		e.sleep();
//		e.study(); 자식끼리는 서로 멤버를 공유하지 않음
	}

}
