package objectTest;

class Student {
	
	int math;
	int kor;
	int eng;
	
	public Student(int math, int kor, int eng) {
		super();
		this.math = math;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
//		return super.toString();
		return " 수학점수는 " + math + "국어점수는" + kor + "영어 점수는" + eng ;
	
	}
	
	
	
	
}


public class ToStringTest01 {

	public static void main(String[] args) {
		
		Student s1 = new Student(100,90, 80);
		System.out.println(s1);
	}
}
