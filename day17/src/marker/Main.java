package marker;

public class Main {
	public static void main(String[] args) {
		
		
		
		Main m = new Main();
//		m.checkA(new Eagle());		
//		m.checkA(new Tiger());
//		m.checkA(new Horse());
		
//		배열 만들기
//		자료형[] 배열명 = {값1, 값2,....}
		Animal [] animals = {new Eagle(), new Tiger(), new Horse()};
		
		m.checkB(animals);
		
		
	}
//	sky, land
	void checkB(Animal[] animal) {
		for(int i=0; i<animal.length; i++) {
			if(animal[i] instanceof Sky) {
				System.out.println("날아 다닌다");
			}else if(animal[i] instanceof Land) {
				System.out.println("뛰어 다닌다");
			}
		}
	}
	
	
	
//	
//	
////	육식,초식 구분
//	void checkA(Animal animal) {
//		if(animal instanceof Carnivore) {
//			System.out.println("육식동물");
//		}else if (animal instanceof Herbivore) {
//			System.out.println("초식동물");
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
