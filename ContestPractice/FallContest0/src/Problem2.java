/**
 * @author Sukrit Ganesh
 * 
 */

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		int testCaseCount = myInput.nextInt();
		int stringLength;
		String inputString;
		
		
		for (int i = 0; i < testCaseCount; i++) {
			stringLength = myInput.nextInt();
			inputString = myInput.next();
			checkPalindrome(stringLength, inputString);
		}
	}
	
	public static void checkPalindrome(int stringLength, String inputString){
		boolean isPalindrome = checkPalindrome(stringLength, inputString, 0);
		if (isPalindrome) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	public static boolean checkPalindrome(int stringLength, String inputString, int position) {
		// base case - all of string has been flipped
		if (position == stringLength) {
			return isPalindrome(stringLength, inputString);
		} 
		return checkPalindrome(stringLength, increaseCharacterAtPosition(stringLength, inputString, position), position + 1)
				|| checkPalindrome(stringLength, decreaseCharacterAtPosition(stringLength, inputString, position), position + 1);
	}
	
	public static String increaseCharacterAtPosition(int stringLength, String inputString, int position) {
		if (inputString.charAt(position) == 'A') {
			return inputString.substring(0, position) + "Z" + inputString.substring(position + 1);
		} else if (inputString.charAt(position) == 'Z') {
			return inputString.substring(0, position) + "Z" + inputString.substring(position + 1);
		} else {
			return inputString.substring(0, position) + Character.toString((char) (inputString.charAt(position)+1)) + inputString.substring(position + 1);
		}
	}
	
	public static String decreaseCharacterAtPosition(int stringLength, String inputString, int position) {
		if (inputString.charAt(position) == 'A') {
			return inputString.substring(0, position) + "Z" + inputString.substring(position + 1);
		} else if (inputString.charAt(position) == 'Z') {
			return inputString.substring(0, position) + "Z" + inputString.substring(position + 1);
		} else {
			return inputString.substring(0, position) + Character.toString((char) (inputString.charAt(position)-1)) + inputString.substring(position + 1);
		}
	}
	
	public static boolean isPalindrome(int stringLength, String inputString) {
		for (int i = 0; i < stringLength/2; i++) {
			if (inputString.charAt(i) != inputString.charAt(stringLength - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
}
