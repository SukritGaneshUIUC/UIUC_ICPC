import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class ProblemB {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int tileCount = myInput.nextInt();
		
		List<Integer> tiles = new LinkedList<Integer>();
		
		for (int i = 0; i < tileCount; i++) {
			tiles.add(myInput.nextInt());
		}
		
		// sort tiles by value
		List<Integer> oneTiles = new LinkedList<Integer>();
		List<Integer> twoTiles = new LinkedList<Integer>();
		
		for (int tile: tiles) {
			if (tile == 1) {
				oneTiles.add(tile);
			}
		}
		
		for (int tile: tiles) {
			if (tile == 2) {
				twoTiles.add(tile);
			}
		}
		
		printList(oneTiles);
		printList(twoTiles);
		
		
		// organize it
		
		List<Integer> sortedTiles = new LinkedList<Integer>();
		int currentSum = 0;
		
		List<Integer> primes = getPrimes(tileCount*2);
		
		printList(primes);
		
		for (int i = 0; i < primes.size(); i++) {
			
			if (oneTiles.size() == 0) {
				sortedTiles.addAll(twoTiles);
				System.out.println("breaking one is 0");
				break;
			} else if (twoTiles.size() == 0) {
				sortedTiles.addAll(oneTiles);
				System.out.println("breaking two is 0");
				break;
			}
			
			int currentPrime = primes.get(i);
			currentSum = sum(sortedTiles);
			int currentSumDifference = currentPrime - currentSum;
			
			// add tiles to make it to currentPrime
			
			while (true) {
				if (currentSumDifference >= 2) {
					sortedTiles.add(twoTiles.remove(0));
					currentSumDifference -= 2;
				} else if (currentSumDifference == 1) {
					sortedTiles.add(oneTiles.remove(0));
					currentSumDifference -= 1;
				} else {
					// up to date
					System.out.println("breaking up to date");
					break;
				}
				
				if (oneTiles.size() == 0) {
					sortedTiles.addAll(twoTiles);
					oneTiles.clear();
					twoTiles.clear();
					System.out.println("breaking one is 0");
					break;
				} else if (twoTiles.size() == 0) {
					sortedTiles.addAll(oneTiles);
					oneTiles.clear();
					twoTiles.clear();
					System.out.println("breaking two is 0");
					break;
				}
				
			}
			
			
		}
		
//		// organize (1 1 1 2 1 1 1 2 1 1 1 2 1 ...), where every n%4 == 0
//		
//		List<Integer> sortedTiles = new LinkedList<Integer>();
//		
//		for (int i = 1; i <= tileCount; i++) {
//			// check if tiles are remaining
//			if (oneTiles.size() == 0) {
//				sortedTiles.addAll(twoTiles);
//				break;
//			} else if (twoTiles.size() == 0) {
//				sortedTiles.addAll(oneTiles);
//				break;
//			}
//			
//			// organize tiles
//			if (i % 4 == 0) {
//				sortedTiles.add(twoTiles.remove(0));
//			} else {
//				sortedTiles.add(oneTiles.remove(0));
//			}
//			
//		}
		
		for (int tile: sortedTiles) {
			System.out.print(tile);
		}

	}
	
	// sieve of erasthones primes
	
	private static int sum(List<Integer> sortedTiles) {
		int sum = 0;
		for (int i: sortedTiles) {
			sum += i;
		}
		return sum;
	}

	public static List<Integer> getPrimes(int n) {
		if (n == 0 || n == 1 || n == 2) {
			List<Integer> x = new LinkedList<Integer>();
			x.add(n);
			return x;
		}
		
		List<Integer> allNums = new LinkedList<Integer>();
		for (int i = 1; i < n; i++) {
			allNums.add(i + 1);
		}
		
		int currentDivisor = 2;
		int currentDivisorPointer = 0;
		
		while (currentDivisor < n/2) {
			for (int i = currentDivisorPointer + 1; i < allNums.size(); i++) {
				if (currentDivisorPointer >= allNums.size()) {
					break;
				}
				if (allNums.get(i) % currentDivisor == 0) {

					allNums.remove(i);
					i--;
				}
			}
			currentDivisorPointer++;
			currentDivisor = allNums.get(currentDivisorPointer);
		}
		
		return allNums;
		
	}
	
	public static void printList(List l) {
		for (Object o: l) {
			System.out.print(o + " ");
		}
	}

}
