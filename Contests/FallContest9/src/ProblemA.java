import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int numberOfCases = myInput.nextInt();
		
		for (int i = 0; i < numberOfCases; i++) {
			int a = myInput.nextInt();
			int b = myInput.nextInt();
			
			if (findGCD(a, b) == 1) {
				System.out.println("Finite");
			} else  {
				System.out.println("Infinite");
			}
		}

	}

	private static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return findGCD(b, a % b);
	}

}
