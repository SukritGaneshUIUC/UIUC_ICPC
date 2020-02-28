import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		double a = myInput.nextInt();
		double b = myInput.nextInt();
		int c = myInput.nextInt();
		
		double divide = a/b;
		String divideString = Double.toString(divide);
		
		for (int i = 0; i < 10; i--) {
			// look through divideString
			for (int j = 0; j < divideString.length(); j++) {
				
			}
		}
						
		System.out.println(divideString);
		
		
	}

}
