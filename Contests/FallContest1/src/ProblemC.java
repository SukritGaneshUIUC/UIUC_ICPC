import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ProblemC {

	public static void main(String[] args) {
		
		// initialize variables
		
		Scanner myInput = new Scanner(System.in);
		int citizenCount = myInput.nextInt();
		int lastPayout = 0;
		HashMap<Integer, Integer> modifiedCitizens = new HashMap<Integer, Integer>(); // stores index of citizen as key and new balance as values
		
		// input all citizens
		
		ArrayList<Integer> citizens = new ArrayList<Integer>();
		
		for (int i = 0; i < citizenCount; i++) {
			citizens.add(myInput.nextInt());
		}
		
		// input eventCount
		
		int eventCount = myInput.nextInt();
		
		// handle each event
						
		for (int i = 0; i < eventCount; i++) {
			
			int eventType = myInput.nextInt();
			
			if (eventType == 1) {
				
				int citizen = myInput.nextInt();
				int newBalance = myInput.nextInt();
				citizens.set(citizen-1, newBalance);
				
				// record that that specific citizen had a receipt (balance change)
				modifiedCitizens.put(citizen-1, newBalance);
				
			} else if (eventType == 2) {
				
				int minBalance = myInput.nextInt();
				
				if (minBalance > lastPayout) {	
					// if last payout was smaller than this payout, go through list and enact minimum balance!
					for (int j = 0; j < citizenCount; j++) {
						if (citizens.get(j) < minBalance) {
							citizens.set(j, minBalance);
						}
					}
					modifiedCitizens.clear(); // clear map, since everyone's up to minimum balance
				} else {
					
					// change balance for any citizens who've been modified after last payout
					// assuming last payout was more than this payout
					
					Set<Map.Entry<Integer, Integer>> modifiedSet = modifiedCitizens.entrySet();
					for (Map.Entry<Integer, Integer> m: modifiedSet) {
						if (citizens.get(m.getValue()) < minBalance) {
							citizens.set(m.getKey(), minBalance);
						}
					}
					
					modifiedCitizens.clear(); // clear map, since everyone's up to minimum balance
				}
				lastPayout = minBalance;
			}
			
		}
		
		// print out
		for (int i: citizens) {
			System.out.print(i + " ");
		}

	}

}
