package apiTest;

import java.util.Random;

public class ApiTest01 {

	public static void main(String[] args) {

//	내부 API
	Random r = new Random();
//	난수에 관련된 기능을 모아 놓은 내부 api
	
//	n미만의 랜덤 정수 반환
	int num  = r.nextInt();
	System.out.println(num);
	int num2 = r.nextInt(100)+1;
	System.out.println(num2);
	
//	범위를 지정하여 랜덤 정수를 생성한다
	int min = 5;
	int max = 15;
	int range = max - min + 1;
	int randomRange = r.nextInt(range) + min;
	System.out.println("5이상 15이하의 랜덤 정수 : " + randomRange);
	}

}
