package castingTask;

public class Dog extends Animal {

//	메소드 1개 추가 printText() : 강아지000은 00살입니다
	
	
	public Dog(String name, int age) {
		super(name, age);
	}
		
//	자식 클래스에서 추가한 메소드
	void printText() {
		System.out.println("강아지" + name+"은"+age+"살 입니다");
	}
				
	

	
	
	
	
	
}
