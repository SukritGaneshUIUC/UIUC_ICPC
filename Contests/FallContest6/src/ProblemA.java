import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class ProblemA {
	
	static HashSet<Integer> allPrices;

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int productKinds = myInput.nextInt();
		int napsackSpace = myInput.nextInt();
		
		LinkedList<Integer> productKindPrices = new LinkedList<Integer>();
		
		for (int i = 0; i < productKinds; i++) {
			productKindPrices.add(myInput.nextInt());
		}
		
		// use iteration to find all combinations
		allPrices = new HashSet<Integer>();
		
		int startPointer = 0;
		for (int i = 0; i < napsackSpace; i++) {
			int currentTotal = 0;
		}
		
	}
	
	public static void getAllCombinations(int productKinds, int napsackSpace, LinkedList<Integer> productKindPrices) {
		
	}

	public static void getCombos(int napsackSpace, LinkedList<Integer> productKindPrices, int pointer) {
		
	}

}
