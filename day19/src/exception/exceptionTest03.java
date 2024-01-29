 package exception;

public class exceptionTest03 {
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 0;
	
	try {
		divideNum(num1, num2);
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	System.out.println("0으로 나누기 끝");
		
	}
		
	public static void divideNum(int num1, int num2) throws Exception {
		
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없다");
	}
	
		System.out.println();
	
	}
	
}
