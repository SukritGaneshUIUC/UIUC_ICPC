import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int n = myInput.nextInt();
		int m = myInput.nextInt();
		
		int countSteps = 0;
		
		// if n > m
		if (n > m) {
			System.out.print(n - m);
			return;
		}
		
		// if n < m
		
		// keep multiplying by two until you surpass result
		while (n < m) {
			n *= 2;
			countSteps++;
		}
		
		// subtract down to result
		System.out.print(countSteps + Math.abs(n - m));
		
	}

}
