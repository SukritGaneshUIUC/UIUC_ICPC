import java.util.LinkedList;
import java.util.Scanner;

public class ProblemG {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int queryCount = myInput.nextInt();
		
		LinkedList<Integer> queries = new LinkedList<Integer>();
		for (int i = 0; i < queryCount; i++) {
			System.out.println(getNumberOfRolls(myInput.nextInt()));
		}

	}
	
	public static int getNumberOfRolls(int desiredNum) {
		int rollCount = 0;
		if (desiredNum % 2 == 0) {
			return desiredNum / 2;
		}
		return 1 + (desiredNum - 3)/2;
	}

}
