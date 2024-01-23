package castingTask;

public class Task {

//	메소드 선언 매개변수타입 부모 클래스 타입
//	다운캐스팅하여 printText() 메소드 실행
//	메인 메소드에서 호출
	
	
	public static void main(String[] args) {

		Animal a = new Animal("동물",10);
		Dog dog = new Dog("멍멍",11);
		Cat cat = new Cat("야옹",5);
	
		animal(dog);
		animal(cat);
		animal(a);
	}
//		업캐스팅
	static void animal(Animal animal) {
		
//		다운 캐스팅
		if(animal instanceof Dog) {
			((Dog)animal).printText();
		}else if(animal instanceof Cat) {
			((Cat)animal).printText();
		}else {
			System.out.println("뭐고");
		}
		
		
	}
	
	
	
	

	
}
