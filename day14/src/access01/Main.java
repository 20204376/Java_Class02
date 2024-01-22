package access01;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		
		a.publicVar = 10; //public은 같은 프로젝트 내에서 접근 가능
		a.defaultVar = 20; //default는 같은 패키지 내에서 접근 가능
		a.protectedVar = 10; //protected는 다른 패키지에서 접근 불가능, 자식 클래스 가능
//		a.privateVar = 20; private는 같은 클래스 내에서만 접근 가능
		a.setPrivateVar(10);
		System.out.println(a.getPrivaateVar()); //getter,setter 메소도르르 통해서만 접근 가능
	
	
	
	
	}

}
