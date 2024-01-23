package casting01;

public class CastingTest {

	public static void main(String[] args) {
//		up casting
		
//		자료형 변수명 = 값;
//		자동형변환
		double num1 = 10; //정수 -> 실수
		
//		클래스명 참조변수명 = 생성자();
		SmartTv smartTv = new SmartTv();
		Tv tv = new Tv();
		
//		1.up casting
		Tv tv1 = (Tv)smartTv; //SmartTv 타입을 가지고 있는 자신의 객체를 Tv 타입을 가지고 있는
						  //tv1이라는 참조변수에 대입 시켜줌
		smartTv.netflix(); // 자식 클래스의 객체 -> 자식클래스의 멤버 호출 가능
//		tv.netflix(); 부모 클래스의 객체 -> 자식 클래스의 멤버 호출 불가능
		tv.chUp();// 부모 클래스의 객체 -> 부모 클래스의 멤버 호출 가능
//		tv1.netflix(); upcasting -> 자식 클래스의 멤버 호출 불가능 
		
//		2. up casting 
		Tv tv2 = (Tv)new SmartTv();
		tv2.powerOnOff();
//		tv2.netflix();
		
//		3. up casting
		Tv tv3 = new SmartTv();
		tv3.chDown();
//		tv3.netflix();
		
//		Down Casting
//		업캐스팅된 객체가 있어야 된다
//		기본 자료형 강제 형변환
//		int num3 = (int)10.0;
		SmartTv st1 = (SmartTv)tv3;
		st1.netflix(); //down casting 완료 자식 클래스 멤버에 접근 가능
		
//		! 잘못된 down casting !
//		업캐스팅된 객체가 없을 때 부모 클래스 객체를 자식 클래스의 객체로 만들 때 오류 발생
		Tv parents = new Tv();
		SmartTv child = (SmartTv)parents; // 오류 발생 
//		child.netflix();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
