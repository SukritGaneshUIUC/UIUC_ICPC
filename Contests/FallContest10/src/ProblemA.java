import java.util.ArrayList;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int numCases = myInput.nextInt();
		ArrayList<Integer> permutation = new ArrayList<Integer>();
		
		for (int i = 0; i < numCases; i++) {
//			System.out.println("test case " + (i+1));
			int n = myInput.nextInt();
//			System.out.println("test case has length " + n + " ");
			permutation.clear();
//			System.out.println("clear permutation");
			for (int j = 0; j < n; j++) {
//				System.out.println("about to take input");
				int o = myInput.nextInt();
//				System.out.println("adding " + o);
				permutation.add(o);
			}
			
//			System.out.println("almost processing test case " + (i+1));

			
			// run algorithm here
			int minPointer = 0;
			int maxPointer = permutation.size() - 1;
			
//			System.out.println("starting processing test case " + (i+1));
			while (true) {
				if (n == 1) {
					break;
				}
				maxPointer = getMin(permutation, minPointer + 1);
//				System.out.println("current min value: " + permutation.get(maxPointer));
//				System.out.println("current min: " + minPointer);
//				System.out.println("current max: " + maxPointer);
				
				// using swaps, move min towards the front of the list, as much as possible
				if (maxPointer - minPointer == 1) {
					if (permutation.get(minPointer) > permutation.get(maxPointer)) {
						int temp = permutation.get(maxPointer);
						permutation.set(maxPointer, permutation.get(minPointer));
						permutation.set(minPointer, temp);
//						System.out.println("swapped " + permutation.get(minPointer) + " and " + permutation.get(maxPointer));
					}
				} else {
					for (int j = maxPointer; j > minPointer; j--) {
						if (!(j - minPointer == 1 && permutation.get(j) > permutation.get(minPointer))) {
							int temp = permutation.get(j);
							permutation.set(j, permutation.get(j-1));
							permutation.set(j-1, temp);
						}
					}
				}
				
				// update pointer vals
				minPointer = maxPointer;
				
//				System.out.println("new min: " + minPointer);
				
				// exit
				if (minPointer == permutation.size() - 1) {
					break;
				}
			}
			
			// print out test case
			for (int m: permutation) {
				System.out.print(m + " ");
			}
			System.out.println("");
			
		}

	}
	
	public static int getMin(ArrayList<Integer> nums, int minIndex) {
		int theMin = nums.get(minIndex);
		for (int i = minIndex; i < nums.size(); i++) {
			if (nums.get(i) < theMin) {
				theMin = nums.get(i);
			}
		}
		return nums.indexOf(theMin);
	}

}
