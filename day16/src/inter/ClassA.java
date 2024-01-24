package inter;

//	ClassA에서 Inter를 구현(상속)
public class ClassA implements Inter {

//	인터페이스를 구현하는 클래스는 반드시 인터페이스의 메소드를 재정의 해야함-> 강제성
	@Override
	public void method1() {
		System.out.println("method1 오버라이딩");
	}

	@Override
	public void method2() {
		System.out.println("method2 오버라이딩");
	}

	
}
