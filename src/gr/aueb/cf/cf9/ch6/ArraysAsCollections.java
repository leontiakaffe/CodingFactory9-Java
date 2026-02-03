package gr.aueb.cf.cf9.ch6;

public class ArraysAsCollections {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
	}

	public static int[] filterEvent(int[] arr){
		if (arr == null || arr.length == 0) return new int[0];
		int[] arrayToReturn = new int[arr.length];
		int count = 0;

		for (int el : arr){
			if (el % 2 ==0){
				arrayToReturn[count++] = el;
			}
		}



		for (int el : arr){
			if (el % 2 == 0) count++;
		}

		 arrayToReturn = new int [count];

		for (int i =0; i < count; i ++){
			if (arr[i] % 2 == 0){
				arrayToReturn[i] = arr[i];
			}
		}
		return arrayToReturn;
	}
}
