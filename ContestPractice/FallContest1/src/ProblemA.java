import java.util.ArrayList;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int problemCount = myInput.nextInt();
		int maxDifficulty = myInput.nextInt();
		
		ArrayList<Integer> problems = new ArrayList<Integer>();
		
		
		for (int i = 0; i < problemCount; i++) {
			problems.add(myInput.nextInt());
		}
		
		int maxSolvable = 0;
		
		
		// check left
		
		for (int i = 0; i < problemCount; i++) {
			if (problems.get(i) > maxDifficulty) {
				maxSolvable += checkRight(problemCount, maxDifficulty, problems); //check right once check left finishes
				break;
			} else {
				maxSolvable++;
			}
		}		
		
		
		System.out.println(maxSolvable);
		
		myInput.close();

	}

	private static int checkRight(int problemCount, int maxDifficulty, ArrayList<Integer> problems) {
		int maxSolvable = 0;
		for (int i = problemCount - 1; i >= 0; i--) {
			if (problems.get(i) > maxDifficulty) {
				break;
			} else {
				maxSolvable++;
			}
		}
		return maxSolvable;
		
	}

}
