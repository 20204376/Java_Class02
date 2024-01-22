package test;

class Student {
//	필드
	int Kor;
	int math;
	int eng;
	
//	생성자
	public Student(int kor, int math, int eng) {
		super();
		this.Kor = kor;
		this.math = math;
		this.eng = eng;
	}
//	평균 점수 반환하는 메소드
	
	double getAvg() {
		return (Kor + math + eng) / 3;


	}
	
	
}

public class Test05 {
public static void main(String[] args) {
	
//	Student 클래스 객체화
	Student st1 = new Student(100, 100, 100);
	
	System.out.println("평균점수 :" + st1.getAvg());
	
	
	
	
	
	
	
}
}
