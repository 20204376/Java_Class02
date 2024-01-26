package inner;

public class OuterClass {

//	필드
	int instanceVaar; //인스턴스 변수
	static int staticVar; //정적 변수

//	인스턴스 내부 클래스
	class InstanceInner{ //OuterClass 내부에서 정의한 인스턴스 내부 클래스
		
	}
	
	static class StaticInner {//OuterClass 내부에서 정의한 스태틱 내부 클래스
		
	}
	
	void instanceMethod() {
		
//		지역변수(메소드안에서 선언한 변수)
		int localVar; 
		
		class LocalInner{ //인스턴스 내부에서 정의한 로컬 내부 클래스
		
		}
		
		staticMethod(); //인스턴스 메소드에서 정적 메소드 호출 가능
		
//		로컬 내부 클래스 객체화
		LocalInner li = new LocalInner();
		InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
		
	}
	
//	스태틱 메소드
	static void staticMethod() {
		
//	지역 변수
	int localVar;
//	instanceVar = 20;
	staticVar = 20;
		
	class LocalInner{ //메소드 내부에서 정의한 로컬 내부 클래스 
	
	
	}
	
	LocalInner li = new LocalInner(); 
//	InstanceInner ii = new InstanceInner();
	StaticInner si = new StaticInner();
	
	}	
}
