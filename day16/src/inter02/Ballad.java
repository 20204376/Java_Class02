package inter02;

public class Ballad implements Music{

	@Override
	public void made() {
		System.out.println("발라드 모드 실행");
	}
//	추가 할 메소드
	void onlyBallad() {
		System.out.println("only Ballad 실행");
	}
	
	
}
