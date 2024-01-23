package castingTask;

public class Cat extends Animal{

//	메소드 1개 추가 : printText 고양이 000은 00살
	
	public Cat(String name, int age) {
		super(name, age);
		
	}
	
	void printText() {
		System.out.println("고양이"+name+"은"+age+"살 입니다");
	}
}
