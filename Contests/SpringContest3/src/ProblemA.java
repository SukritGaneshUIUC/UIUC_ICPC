import java.util.Scanner;
import java.lang.Math;

public class ProblemA {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		long count = myInput.nextInt();
		
		for (int i = 0; i < count; i++) {
			long a = myInput.nextInt();
			long b = myInput.nextInt();
			
			// run the algorithm
			long n = (long) Math.log10(b + 1);
			System.out.print(a * n + " ");
			
		}
		
	}

}
