package accessTadkkk;

import java.util.Scanner;

public class Maon {
	private String name;
	private int age;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}




	public static void main(String[] args) {
//		private  멤버 접근 실습
//		학생의 이름 나이 입렵 받고
//		입력은 이름, 나이를 settere로 값을 전달
//		전달한 이름, 나이 출력 geetter
		
//		<출력결과>
//		이름입력 :000
//		나이 :00
//		
//		학생이름:000
//		학생나이 :00
		Student st1 = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("나이 입력:");
		int age = sc.nextInt();
	
//		setter로 값 전달
		st1.setName(name);
		st1.setAge(age);
		
//		getter로 값 불러오기
		System.out.println("학생이름 : " + st1.getName());
		System.out.println("학생 나이 : " + st1.getAge());
	
	
	
	
	
	
	
	
	
	
	
	}

}
