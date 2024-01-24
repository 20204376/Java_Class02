package abstractTask;

abstract class Marbel {

//	추상 클래스 marbel
//	미완성된 메소드 power()
	
//	자식 클래스 : IronMan, America
//	power() 메소드 구현
	
//	Main 클래스에서 Power() 호출
	
	abstract void Power();
	
}
class IronMan extends Marbel {

	@Override
	void Power() {
		System.out.println("자비스 공격 해");
	}
	
}
	
class America extends Marbel {

	@Override
	void Power() {
		System.out.println("방패");
	}
}
	
public class Marvel {
	public static void main(String[] args) {

		IronMan i = new IronMan();
		America a = new America();
	
		i.Power();
		a.Power();
	
	}
}
			