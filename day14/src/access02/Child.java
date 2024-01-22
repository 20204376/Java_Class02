package access02;

import access01.A;

public class Child extends A {

	
//	생성자
	public Child() {
		super.protectedVar = 20; // protected는 다른 패키지라도 자식 클래스에선 접근 가능
	}
	
	void test() {
		protectedVar = 20;
	}
	
									
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
