package inheritance;

public class Main {

	public static void main(String[] args) {
	
	Person p = new Person();
	Student s = new Student();
	Employee e = new Employee();
	
	
	p.eat();
//	p.study(); 자식 클래스에서 새롭게 정의된 멤버는 부모 클래스에서 사용 불가
	s.eat();
	
//	자식 클래스 멤버에서 다른 자식 클래스 멤버 접근
//	s.employeeNumber = 10; 자식클래스끼리는 서로 영향을 주지 못 함
	
	System.out.println(e.name);
	
	
	
	
	}
}
