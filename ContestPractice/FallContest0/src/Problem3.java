import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		int size = myInput.nextInt();
		int operations = myInput.nextInt();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = myInput.nextInt();
		}
		
		sort(array);
		
		for (int i = 0; i < operations; i++) {
			array[size/2] = array[size/2] + 1;
			sort(array);
		}
		
		System.out.println(array[size/2]);

	}
	
	public static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 

}
