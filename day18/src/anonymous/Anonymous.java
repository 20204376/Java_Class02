package anonymous;

class Animal{
	public void cry() {};
}


public class Anonymous {

// 방법1) 필드 익명 자식 객체 생성
	Animal dog = new Animal() {
//		일회성으로 Animal 클래스를 구현
		
		String name = "멍멍이";

		@Override
		public void cry() {
			System.out.println("강아지"+name+"는 멍멍");
			
		}
		
	};
	
//	방법2) 지역변수의 초기값으로 대입
	void method1() {
		Animal cat = new Animal() {
			
			String name = "달이";

			@Override
			public void cry() {
				System.out.println("고양이" + name+"는 야옹");
			}
			
		};
		
		cat.cry(); //지역변수이기 때문에 바로 사용 해야 함
	}
	
//	방법3) 익명개체 매개변수로 대입
	void method2(Animal animal) {
		animal.cry();
		
	}
	

	public static void main(String[] args) {
		
		Anonymous a = new Anonymous();
		
//		방법1) 필드에 익명자식 객체 생성
		a.dog.cry();
		
//		방법2) 지역변수의 초기값으로 대입
		a.method1();
		
//		방법3) 익명개체 매개변수로 대입
		a.method2(new Animal() {
			
			String name = "무우";

			@Override
			public void cry() {
			System.out.println("소"+name+"은 음ㅁㅔ");
			
			}
			
		});
		
		
		
		
	}
}
