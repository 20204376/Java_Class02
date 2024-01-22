package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력>>");
		int num = sc.nextInt();
		
//		2와 3의 배수 -> num%2 ==- && num%3 ==0
		
//		삼항연산자 : (조건식)? 참일 때 값 : 거짓일 때 값
		
		
		String result = (num%2 ==0 & num%3 == 0)? "2와 3의 배수 " : "2와3의 배수가 아니다";
		System.out.println(result);
		
		
		
		
		
	}

}
