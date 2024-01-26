package anonymous2;

public class Main {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		InterA a = new ClassA();
		
//		익명으로 인터페이스 구현
		InterA b = new InterA() {

		@Override
		public void printData() {
				System.out.println("익명클래스에서 오버라이딩");
		}
			
			
			
		};
		
		ca.printData();
		a.printData();
	
	
	
	
	
	
	
	
	}
}
