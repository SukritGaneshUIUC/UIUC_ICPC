import java.util.ArrayList;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int n = myInput.nextInt();
		ArrayList<Integer> pillars = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			pillars.add(myInput.nextInt());
		}
		
		// find largest disk
		
		int maxDiskSize = 0;
		int maxDiskIndex = 0;
		for (int i = 0; i < n; i++) {
			if (pillars.get(i) >= maxDiskSize) {
				maxDiskSize = pillars.get(i);
				maxDiskIndex = i;
			}
		}
		
		// check if left and right are sorted
		
		boolean movable = true;
		
		for (int i = maxDiskIndex; i > 0; i--) {
			if (!(pillars.get(i) > pillars.get(i-1))) {
				movable = false;
				break;
			}
		}
		
		for (int i = maxDiskIndex; i < pillars.size() - 1; i++) {
			if (!(pillars.get(i) > pillars.get(i+1))) {
				movable = false;
				break;
			}
		}
		
		if (movable) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		// check if you can reorganize (code graveyard, i didn't realize i simply need to see if both
		// sides are sorted in one direction!!!
		
//		boolean flag = true;
//		int pastLeftIndex = maxDiskSize;
//		int currentLeftIndex = maxDiskIndex;
//		int pastRightIndex = maxDiskSize;
//		int currentRightIndex = maxDiskIndex;
//		
//		while(flag) {
//			currentLeftIndex--;
//			currentRightIndex++;
//			if (currentLeftIndex < 0) {
//				int currentRightSize = pillars.get(currentRightIndex);
//				
//			} else if (currentRightIndex >= n) {
//				
//			} else {
//				
//			}
//		}

	}

}
