package staticTest;
// alt shift s o
class ClassA{
	
	int instanceVar; //instance 변수
	static int staticVar; //정적 변수, 스태틱 변수,클래스 변수
	
	
	void instanceMethod() { //인스턴스 메소드
		instanceVar = 10; //인스턴스 메소드 안에서 인스턴스 변수 사용 가능
		staticVar = 20; //인스턴스 메소드 안에서 static 변수 사용 가능
		instanceMethod2(); // 인스턴스 메소드 호출 가능
		staticMethod(); //정적 메소드 호출 가능
		
	}
	
	void instanceMethod2() {//인스턴스 메소드
		
		
	}
	
	static void staticMethod() {//정적 메소드, 스태틱 메소드,,
//		instanceVar = 10; 정적 메소드 안에서 인스턴스 변수 사용 불가능
		staticVar = 20; // 정적 변수 사용 가능
//		instanceMethod(); //인스턴스 메소드 호출 불가능
		staticMethod2(); // 정적 메소드 호출 가능
	
	}
	static void staticMethod2() {
		
	}
	
public class StaticTest01 {
	public static void main(String[] args) {

		ClassA a = new ClassA();
		
//		인스턴스 변수 호출
		a.instanceVar = 20; //객체명.인스턴스 변수 가능
		a.staticVar =20; //객체명.스태틱 변수 가능
		a.instanceMethod();
		a.staticMethod();
		
//		ClassA.instanceVar = 10; //클래스명.인스턴스 변수 호출 불가
//		ClassA.instanceMethod(); 클래스명.인스턴스 메소드 호출 불가
		ClassA.staticVar = 20;
		ClassA.staticMethod();
		
		
	}

}

