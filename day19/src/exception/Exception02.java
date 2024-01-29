package exception;

import java.util.Scanner;

public class Exception02 {
	public static void main(String[] args) {
		Scanner sc = null;
		
			try {
				sc.next();
				//try볼록에서 오류가발생하면
//				발생한 오류 객체를 받을 수 있는 참조변수를 가진 catch문 영역 실행
			}catch(NullPointerException e) {
				System.out.println("null이에요");
				System.out.println(e);
//				System.out.println(e.toString());
				e.printStackTrace();
				System.out.println(e.getMessage());
			}catch(Exception e) {
//				우리가 try에서 어떤 오류가 발생할지 전부 예상하기 힘듦
//				예상치 못한 올규 발생할 수도
//				예상치 못한 오류를 잡기 위해 Exception 타입의 참조변수를 사용
//				모든 예외의 조상은 Exception 타입의 참조변수에 저장 가능
				System.out.println("예상치 못한 오류");
			}
				
	
	
	}
	
	
	
	
}
