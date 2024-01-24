package inter;

public interface Inter {

	public static final int VAR1 = 10;
	int VAR2 = 20; // public static final 생략해도 자동으로 붙음
	
	public abstract void method1();
	void method2(); //public abstract를 생략해도 자동으로 붙는다
	
	
}
