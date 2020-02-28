import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		ArrayList<Boolean> rooms = new ArrayList<Boolean>();
		String events;
		
		// initialize
		for (int i = 0; i < 10; i++) {
			rooms.add(false);
		}
		
		// input
		int numberOfEvents = myInput.nextInt();
		events = myInput.next();
		
		// iterate
		for (int i = 0; i < numberOfEvents; i++) {
			char current = events.charAt(i);
			
			if (current == 'L') {
				for (int j = 0; j < 10; j++) {
					if (rooms.get(j) == false) {
						rooms.set(j, true);
						break;
					}
				}
			} else if (current == 'R') {
				for (int j = 9; j >= 0; j--) {
					if (rooms.get(j) == false) {
						rooms.set(j, true);
						break;
					}
				}
			} else {
				int roomToBeEmptied = Character.getNumericValue(current);
				rooms.set(roomToBeEmptied, false);
			}
		}
		
		// print out array
		for (int i = 0; i < 10; i++) {
			if (rooms.get(i)) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
		}
		
	}

}
