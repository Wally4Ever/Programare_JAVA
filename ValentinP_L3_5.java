import java.util.Scanner;

/*Implement the already known sorting algorithms (bubble sort, insertion sort, quick sort, etc.) and apply them
upon an array of integer variables read from the keyboard*/
public class ValentinP_L3_5 {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("Number of integers in array: ");
		int n = kb.nextInt();
		System.out.println("Input integers: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		// sort
		bubble(arr);
		// insertion(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void bubble(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void swap(int arr[], int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	public static void quick(int arr[], int left, int right) {
		int mij = arr[left + (right - left) / 2];
		int i = left;
		int j = right;
		while (i <= j) {
			while (arr[i] < mij) {
				i++;
			}
			while (arr[j] > mij) {
				j--;
			}
			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		if (left < j) {
			quick(arr, left, j);
		}
		if (i < right) {
			quick(arr, i, right);
		}

	}

	public static void insertion(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int x = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > x) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = x;
		}
	}
}