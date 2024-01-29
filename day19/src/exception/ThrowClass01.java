package exception;

public class ThrowClass01 {

	public static void main(String[] args) {
		System.out.println("예외를 발생시킬거야");
		
		throw new NumberFormatException();
	}

}
