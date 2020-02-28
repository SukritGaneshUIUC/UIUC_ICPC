import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

// contest happened 9/25/2019

public class ProblemA {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> noDuplicates = new ArrayList<Integer>();
		
		int arrayLength = myInput.nextInt();
		
		for (int i = 0; i < arrayLength; i++) {
			int n = myInput.nextInt();
			nums.add(n);
		}
		
		// remove duplicates (start from right)
		
		for (int i = arrayLength - 1; i >= 0; i--) {
			if (noDuplicates.contains(nums.get(i))) {
				nums.remove(i);
			} else {
				noDuplicates.add(nums.get(i));
			}
		}
		
		// print
		
		String returnString = "";
		for (int i: nums) {
			returnString += i;
			returnString += " ";
		}
		returnString = returnString.substring(0, returnString.length() - 1);
		System.out.println(returnString);

	}

}
