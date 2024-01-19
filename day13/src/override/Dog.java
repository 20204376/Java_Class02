package override;

public class Dog extends Animal{
	
	String spec;

//	자식 클래스 생성자
	public Dog(String name, int age, String spec) {
		super(name, age);
		this.spec = spec;
	}

	@Override
	void eat() {
		super.eat();
		System.out.println(spec+" "+name+"은 사료를 먹습니다");
	}

	@Override
	void sleep() {
		super.sleep();
		System.out.println(spec + " " +name + "은 바닥에서 잡니다");
	}
	
//	자식 클래스에서 추가한 메소드
	 void walk(String place) {
		 System.out.println(spec + " " + name + "은 " + place + "을 산책하는 걸 좋아한다");

	}
	
	

}
