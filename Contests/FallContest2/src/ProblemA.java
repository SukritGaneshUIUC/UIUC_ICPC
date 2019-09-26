import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int theInt = myInput.nextInt();
		
		int int1 = 1;
		int int2 = 1;
		int int3 = theInt - int1 - int2;
		
		if (int3 % 3 == 0) {
			int2++;
			int3--;
		}
		
		System.out.print(int1 + " " + int2 + " " + int3);

	}

}
