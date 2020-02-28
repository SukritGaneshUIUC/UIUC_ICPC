import java.util.ArrayList;
import java.util.Scanner;

public class Problemd {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		int num = myInput.nextInt();
		
		// sum: n(n+1)/2 - triangle number, which isn't prime

		if (num == 1) {
			System.out.println("No");
			return;
		} else if (num == 2) {
			System.out.println("No");
			return;
		} 
		
		// calculate big list
		ArrayList<Integer> bigList = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			bigList.add(i);
		}
		int triangleSum = (num * (num + 1))/2;
		
		// calculate divisible num
		int firstListNum = 0;

		for (int i = 2; i < num; i++) {
			if (triangleSum % i == 0) {
				firstListNum = i;
			}
		}
		
		if (firstListNum == 0) {
			System.out.println("No");
			return;
		}
		
		// remove from big list and add to small list
		ArrayList<Integer> smallList = new ArrayList<Integer>();
		smallList.add(bigList.remove(firstListNum - 1));
		
		// print out
		System.out.println("Yes");
				
		// print first list
		System.out.print(bigList.size() + " ");
		for (int i: bigList) {
			System.out.print(i + " ");
		}
		
		System.out.print("\n");
		
		// print second list
		System.out.print(smallList.size() + " ");
		for (int i: smallList) {
			System.out.print(i + " ");
		}
		
	}
	
	public int euclidGCD(int num1, int num2) {
		while (num2 > 0) {
			int mod = num1 - num2;
			num1 = num2;
			num2 = mod;
		}
		return num1;
	}

}
