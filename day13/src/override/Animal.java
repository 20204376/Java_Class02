package override;

//	실습
//	자식 클래스 dog
//	필드
//	Stirng spec //종
//	eat, sleep 재정의
//	walk () : 매개변수(place) -> "강아지 000는 000 산책하는걸 좋아한다"

//	Main 클래스
//  eat, sleep, walk 호출
public class Animal {
//	필드
	String name;
	int age;
	
//	부모의 생성자
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	메소드
	void eat() {
		System.out.println("동물은 어떤걸 먹을까");
	}
	
	void sleep() {
		System.out.println("동물은 어떻게 잘까요");
	}
	
	
	
	
}
