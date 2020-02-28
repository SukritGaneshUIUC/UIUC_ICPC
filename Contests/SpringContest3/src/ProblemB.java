import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int count = myInput.nextInt();
		
		for (int i = 0; i < count; i++) {
			String s = myInput.nextLine();
			String t = myInput.nextLine();
			String z = "";
		}
		
		System.out.println(isSubsequence("Iraec", "I"));
	}
	
	public static boolean isSubsequence(String subst, String bigst) {
		int stringPointer = 0;
		for (int i = 0; i < bigst.length(); i++) {
			if (bigst.charAt(i) == subst.charAt(stringPointer)) {
				stringPointer++;
			}
			if (stringPointer == subst.length() - 1) {
				return true;
			}
		}
		return false;
	}

}
