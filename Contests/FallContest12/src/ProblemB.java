import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		String s = myInput.next();
		char minChar = s.charAt(0);
		
		for (int index = 0; index < s.length(); index++) {
			/*if (s.charAt(index) < minChar) {
				minChar = s.charAt(index);
				flips++;
			}
			
			if (flips % 2 == 0) {
				System.out.println("Mike");
			} else {
				System.out.println("Ann");
			}*/
			
			char t = s.charAt(index);
			if (t <= minChar) {
				System.out.println("Mike");
				minChar = t;
			} else {
				System.out.println("Ann");
			}
			
		}
		
/*		for (int k = 0; k < s.length(); k++) {
			// to make lexicographically smaller, starting letter must be before
			// ex. asdsdsdsd < bsdsdsds, since a is before b
			
			char smallestChar = s.charAt(k);
			int moveBacks = 0;	// one "moveBack" is when l is reduced 
			
			for (int currentIndex = k; currentIndex >= 0; currentIndex--) {				
				
				if (s.charAt(currentIndex) < smallestChar) {
					smallestChar = s.charAt(currentIndex);
					moveBacks++;
				}
			}
			
			// odd number of "moveBacks" means that Ann made last successful move, meaning Mike can't move
			// and thus, Ann wins
			
			// even number of "moveBacks" means Mike wins (vacuously true)
			
			if (moveBacks % 2 == 0) {
				System.out.println("Mike");
			} else {
				System.out.println("Ann");
			}
			
		}*/

	}

}
