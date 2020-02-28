import java.util.LinkedList;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int testCount = myInput.nextInt();
		
		LinkedList<Integer> tests = new LinkedList<Integer>();
		
		for (int i = 0; i < testCount; i++) {
			tests.add(myInput.nextInt());
		}
		
		int movesOnThisTest = 0;
		
		for (int i = 0; i < testCount; i++) {
			
			// keep adding cycle of size tests.get(i) each iteration
			// a cycle of 5 requires 4 moves to reduce to 1s, a cycle of 2 requires 1 move to reduce to 1s
			// moves required per cycle is n-1, where n is size of cycle
			
			movesOnThisTest += (tests.get(i) - 1);
			
			// on i-th test (tests start at #0), who will win?
			// if totalMoves is odd, first player wins, otherwise second player wins
			// print out the winner as you add a cycle
			if (movesOnThisTest % 2 == 1) {
				System.out.print(1 + " ");
			} else {
				System.out.print(2 + " ");
			}
		}
		
	}
		

}
