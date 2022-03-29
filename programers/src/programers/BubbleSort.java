package programers;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 1, 66 };
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					continue;
				}

				if (arr[i] < arr[j] == true) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}

			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
