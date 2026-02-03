package gr.aueb.cf.cf9.ch6;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 20, 5, 100, 22, 12 , 1001};
		int[] sorted ;

		System.out.print("Before sorting:");
		printArray(arr);

		System.out.print("After sorting:");
		sorted = selectionSort(arr);
		printArray(sorted);
	}

	public static int[] selectionSort(int[] arr) {

		int minPosition;
		int minValue;
		for (int i = 0; i < arr.length - 1; i++) {
			minPosition = i;
			minValue = arr[minPosition];

			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < minValue){
					minPosition =j;
					minValue = arr[minPosition];
				}
			}

			swap(arr, minPosition, i);
		}

		return arr;

	}

	public static void swap (int[] arr, int minPosition, int i){
		int tmp = arr[minPosition];
		arr[minPosition] = arr[i];
		arr[i] = tmp;
	}

	public static void printArray(int[] arr){
		for (int item : arr){
			System.out.println(item + " ");
		}
	}

}
