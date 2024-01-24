	package abstractTest;
		
// 추상 메소드를 1개 이상 가지고 있는 클래스는 반드시 추상클래스가 되어야 한다
abstract class ClassA{
	
//	추상 메소드 선언
	abstract void method1();
	
	
//	일반 메소드
	void method2() {
		System.out.println("메소드2 실행");
	}
	
	
	
}

class ClassB extends ClassA {

//	추상클래스인 ClassA의 추상메소드 method1은 반드시 자식클래스에서 재정의 해줘야함 -> 강제성
	@Override
	void method1() {
		System.out.println("오버라이딩 mehod1()");
	}
	
	
}



public class AbstractTest {
	
	public static void main(String[] args) {
		
//		추상클래스는 객체화 시킬 수 없다 -> 미완성된 클래스이기 때문에
//		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassA a = new ClassB(); // upcasting
		
		
		b.method1();
		b.method2();
		a.method1();
		a.method2();
	}

}
