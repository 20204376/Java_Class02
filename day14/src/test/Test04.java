package test;

public class Test04 {

	public static void main(String[] args) {

		int[] arr1 = {1, 2,3,4,5};
		int[] arr2 = new int[5];
		
		System.out.println(arr1.length);
		System.out.println(arr1);
		
//		숫자의 합을 저장할 변수 선언
		int sum = 0;
		
		for(int i=0; i<arr1.length;i++) {
//			System.out.println(arr1[i]);
			sum += arr1[i];
			
		
		
		}
		System.out.println("합 :" + sum);				
		
		
		
	}

}
