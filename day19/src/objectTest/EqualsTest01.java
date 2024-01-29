package objectTest;

public class EqualsTest01 {

		public static void main(String[] args) {
			String str1 = "안녕하세요";
			String str2 = "안녕하세요";
			
//			equal()는 문자열 비교할 때 사용
			System.out.println(str1.equals(str2));
			System.out.println(str1.equals("안뇽하세요"));
			System.out.println(str1 == str2);
			
//			객체 비교
			EqualsTest01 e1 = new EqualsTest01();
			EqualsTest01 e2 = new EqualsTest01();
			
			System.out.println(e1);
			System.out.println(e2);
			
			System.out.println(e1.equals(e2));
			System.out.println(e1 == e2);
			
			
		}
}
