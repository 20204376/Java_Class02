package exception;

import java.util.Scanner;

public class ThrowTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수를 입력하세요 >>");
		int number = sc.nextInt();
		
		if(number < 0) {
			try {
				throw new MyException(); // MyExceoption 예외 발생 시키기
			}catch(MyException e) {
				e.printStackTrace();
			}
		}
		
	}

}
