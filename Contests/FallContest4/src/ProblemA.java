import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int firstBananaCost = myInput.nextInt();
		int soldierMoney = myInput.nextInt();
		int bananasWanted = myInput.nextInt();
		
		int totalMoneyOwed = 0;
		for (int i = 1; i <= bananasWanted; i++) {
			totalMoneyOwed += firstBananaCost * i;
		}
		
		int moneyNeededToBorrow = totalMoneyOwed - soldierMoney;
		if (moneyNeededToBorrow > 0) {
			System.out.println(moneyNeededToBorrow);
		} else {
			System.out.println(0);
		}

	}
	
}
