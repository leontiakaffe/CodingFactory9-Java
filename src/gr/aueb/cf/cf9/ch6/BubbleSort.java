package gr.aueb.cf.cf9.ch6;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {12, 4, 5, 72, 8 , 9};
		int sorted [];

		System.out.println("Before sorting:");
		printArray(arr);

		System.out.println();

		System.out.println("After sorting:");
		sorted = bubbleSort(arr);
		printArray(sorted);
	}

	public static int[] bubbleSort(int[] arr){


		for(int i =arr.length - 1; i > 0; i--){
			for (int j = 0; j < i ; i++){
				if (arr[j] > arr[j + 1]) {
					 swap(arr, i, j + 1);
				}
			}
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
