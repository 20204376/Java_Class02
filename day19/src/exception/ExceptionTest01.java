package exception;

import java.util.*;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력:");
		try {
			sc.nextInt(); //예외가 발생할 수 있는 문장
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력 해");
		}
		
		
	}

}
