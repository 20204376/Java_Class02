package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 :");
		int num = sc.nextInt();
		
		String grade;
		
		if(num <= 100 & num >=80) {
			grade = "A";
		} else if(num >=60) {
			grade = "B";
		}else {
			grade = "c";
		}
		System.out.println("학덤:" +grade);
	
	}

}
