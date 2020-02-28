import java.util.Scanner;

public class ProblemC {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		int num = myInput.nextInt();
		int k = myInput.nextInt();
		
		// formula: n! / (n-k)!
		System.out.println(factorial(4));
		System.out.println(factorial(num) / (factorial(num - k) ));
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		}
		
		int returnVal = n;
		for (int i = n - 1; i > 1; i--) {
			returnVal *= i;
		}
		return returnVal;
	}

}
