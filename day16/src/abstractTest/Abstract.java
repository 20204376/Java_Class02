package abstractTest;

abstract class Animal {
	
//	추상메소드
	abstract void crying();
	
	
}

class Dog extends Animal {

//	추상 클래스를 상속 받는 자식 클래스에서는 추상 메소드를 재정의 해야한다->실수로라도 기능 미구현 방지
	@Override
	void crying() {
		System.out.println("멍멍");
	}
	
}

class Cat extends Animal{

	@Override
	void crying() {
		System.out.println("냐옹");
	}
	
}


public class Abstract {
	public static void main(String[] args) {
																
	Animal dog = new Dog(); //upcasting 추상클래스로 가능
	Animal cat = new Cat();	//upcasting
		
	dog.crying();
	cat.crying();
		
		
	}
}
