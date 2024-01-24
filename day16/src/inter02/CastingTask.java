package inter02;

public class CastingTask {

		public static void main(String[] args) {
			
			Music music1 = new Hiphop();
			Music music2 = new Ballad();
			
			check(music1);
			check(music2); 
			check(new Rock()); // upcasting Music music = new Rock();
		}
		
		static void check(Music music) {
			if(music instanceof Ballad) {
				((Ballad)music).onlyBallad(); //down castnig
			}else if(music instanceof Hiphop) {
				((Hiphop)music).onlyHiphop();
			}else if(music instanceof Rock) {
				((Rock)music).onlyRock();
			}
			
		}
		
		
}
