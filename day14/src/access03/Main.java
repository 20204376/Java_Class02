package access03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		간단한 회원 가입 프로그램 만들기!
		Scanner sc = new Scanner(System.in);
		User user = new User();
		
		System.out.println("=====회원가입을 시작합니다======");
		
		System.err.print("id입력 :");
		String userId = sc.nextLine();
		
		System.out.print("pw 입력:");
		String userpw = sc.nextLine();
		
		System.out.print("이름 입력 :");
		String userName = sc.nextLine();
	
//	setter 메소드로 User클래스의 private 필드에 값 저장
		user.setUserId(userId);
		user.setUserPw(userpw);
		user.setUserName(userName);
		
		System.out.println("회원가입 완료");
		
		
//		회원 정보확인
		System.out.println("회원 정보 확인");
		
//		getter 메소드로 User클래스의 private 필드의 값 확인
		System.out.println("아이디:" + user.getUserId());
		System.out.println("비밀번호 :" + user.getUserPw());
		System.out.println("이름:" + user.getUserName);

		System.out.println();
		System.out.println("확인 성공");
	
	}

}
