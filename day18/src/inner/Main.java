package inner;

public class Main {
	public static void main(String[] args) {
		
//		외부 클래스 객체화
		OuterClass o = new OuterClass();
//		InstanceInner i = new InstacneInner(); 내부 클래스는 혼자서 사용 불가능
		
//		OuterClass의 참조변수 o를 이용해서 InstanceInner 클래스의 객체 생성
		OuterClass.InstanceInner ii = o.new InstanceInner();
		System.out.println(ii);
		
//		OuterClass의 인스턴스를 생성하고 그 인스턴스를 이용해서
//		InstanceInner 클래스의 인스턴스를 생성하는 방법
		OuterClass.InstanceInner ii2 = new OuterClass().new InstanceInner();
		System.out.println(ii2);
		
//		Static 클래스의 인스턴스를 생성
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println(si);
		
		
		
		
		
		
		
		
	}
}
