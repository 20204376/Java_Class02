package adapter;

public class BasicFan2 extends FanAdapter {

	@Override
	public void on() {
		System.out.println("리모콘으로 전원 켜기");
	}

	@Override
	public void off() {
		System.out.println("리모콘으로 전원 끄기");
		
	}

	@Override
	public void turbo() {
		System.out.println("터보");
	}
	
	
	
	
}
