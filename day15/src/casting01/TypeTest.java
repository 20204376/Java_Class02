package casting01;

class A {
	
	
	
}

class B extends A {
	
	
	
	
	
	
	
	
	
}

public class TypeTest {

	public static void main(String[] args) {

	A a = new A(); //A타입을 가진 참조변수 a	
	B b = new B(); // B타입을 가진 참조변수 b
//	int num = 10; // num 정수형 변수
//	double num2 = 10;
	
	
//	instanceof : true, false
//	자식 클래스의 객체는 부모 클래스 타입도 동시에 갖는다
	System.out.println(a instanceof A);	//a가 A타입을 가지니?라고 물어보는 true
	System.out.println(a instanceof B); // 부모는 자식의 타입을 가지지 못한다
	System.out.println(b instanceof B); // b가 "" true
	System.out.println(b instanceof A); // 자식은 부모의 타입을 가진다
		
		
		
		
		
		
		
		
		
		
	}

}
