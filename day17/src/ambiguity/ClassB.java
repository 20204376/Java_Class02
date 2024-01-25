package ambiguity;

//	ClassA를 상속 받고 Inter1 구현
public class ClassB extends ClassA implements Inter1{
//	ClassA와 Inter1 양쪽에 printText() 메소드가 존재하지만 오류가 발생하지 않는다
//	구현하는 인터페이스 보다 상속받는 부모클래스의 우선순위가 더 높기 때문에


}
