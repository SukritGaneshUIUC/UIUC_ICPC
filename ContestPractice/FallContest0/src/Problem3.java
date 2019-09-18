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
			sortCenterElement(array);
		}
		
		System.out.println(array[size/2]);

	}
	
	public static void sortCenterElement(int arr[]) {
		if (arr.length == 1) {
			return;
		}
		
		int position = arr.length/2;
		
		while (position < arr.length - 1 && arr[position] > arr[position + 1]) {
			swap(arr, position, position + 1);
			position++;
		}
		
	}
	
	public static void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
	
	public static void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
