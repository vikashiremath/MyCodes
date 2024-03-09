package apna.array;

public class ArrayTask4 {

	public static Boolean isSorted(int[] arr, int index) {

		if (index == arr.length-1) {
			return true;
		}

		if (arr[index] < arr[index + 1]) {
			return isSorted(arr, index + 1);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 9,3,1,7 };

		System.out.println(isSorted(arr, 0));
	}

}
