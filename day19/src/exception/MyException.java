package exception;


//	사용자 정으 예외
//  음수 들어오면 예외 발생


public class MyException extends Exception{
	
	public MyException() {
		super("음수 입력하면 안됨");
	}
	
	public static void main(String[] args) {

	}

}
