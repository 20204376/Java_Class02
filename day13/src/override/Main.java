package override;

public class Main {

	public static void main(String[] args) {

			Dog dog = new Dog("바둑쓰", 5, "강아지");
			Animal animal = new Animal("바둑이",5);
//	자식 클래스의 메소드 호출
			animal.sleep();
//			dog.sleep(); // 자식 클래스에서 오버라이드한 메소드
	
		dog.eat();
	
		dog.walk("한강"); //자식 클래스에서 추가로 생성한 메소드
		
//		animal.walk("한강") 부모의 객체에선 자식 클래스에서 추가한 멤버 접근 불가
	}

}
