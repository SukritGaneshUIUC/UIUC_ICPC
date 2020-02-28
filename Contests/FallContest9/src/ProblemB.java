import java.util.ArrayList;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int n = myInput.nextInt();
		int m = myInput.nextInt();
		int k = myInput.nextInt();
		
		ArrayList<Integer> initialArray = new ArrayList<Integer>();
		
		// initial array
		for (int i = 0; i < n; i++) {
			int val = myInput.nextInt();
			initialArray.add(val);
		}
		
		int[][] operations = new int[m][4];
		
		// initialize operations
		for (int i = 0; i < m; i++) {
			operations[i][0] = myInput.nextInt() - 1;
			operations[i][1] = myInput.nextInt() - 1;
			operations[i][2] = myInput.nextInt();
			operations[i][3] = 0;
		}
		
		ArrayList<Integer> operationExecutions = new ArrayList<Integer>();
		
		for (int i = 0; i < m; i++) {
			operationExecutions.add(0);
		}
		
		// go through queries
		for (int i = 0; i < k; i++) {
			int start = myInput.nextInt() - 1;
			int end = myInput.nextInt() - 1;
			operationExecutions.set(start, operationExecutions.get(start) + 1);
			if (end < operationExecutions.size() - 1) {
				operationExecutions.set(end + 1, operationExecutions.get(end) - 1);
			}
		}
		
		// cumulative propogation
		int currentSum = 0;
		for (int i = 0; i < operationExecutions.size(); i++) {
			currentSum += operationExecutions.get(i);
			operationExecutions.set(i, currentSum);
		}
		
		// update operations matrix
		for (int i = 0; i < operationExecutions.size(); i++) {
			operations[i][3] = operationExecutions.get(i);
		}
		
		ArrayList<Integer> changeArray = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			changeArray.add(0);
		}
		
		// go through operations, record in change arrays
		for (int i = 0; i < m; i++) {
			int amountChange = operations[i][2] * operations[i][3];
			changeArray.set(operations[i][0], changeArray.get(operations[i][0]) + amountChange);
			if (operations[i][1] < changeArray.size() - 1) {
				changeArray.set(operations[i][1] + 1, changeArray.get(operations[i][1]) - amountChange);
			}
		}
		
		// cumulative sum for change array
		currentSum = 0;
		for (int i = 0; i < changeArray.size(); i++) {
			currentSum += changeArray.get(i);
			changeArray.set(i, currentSum);
		}
		
		// add changeArray to Original Array
		for (int i = 0; i < n; i++) {
			initialArray.set(i, initialArray.get(i) + changeArray.get(i));
		}
		
		// print out new array
		for (int i = 0; i < initialArray.size(); i++) {
			System.out.print(initialArray.get(i) + " ");
		}
		System.out.println("");

	}

}
