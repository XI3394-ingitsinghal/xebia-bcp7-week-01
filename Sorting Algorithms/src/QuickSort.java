import java.util.Scanner;

public class QuickSort {

	// Partition into low and high index
	int partition(int arr[], int lowIndex, int highIndex) {
		int pivot = arr[highIndex];
		int i = (lowIndex - 1);
		for (int j = lowIndex; j < highIndex; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[highIndex];
		arr[highIndex] = temp;
		return i + 1;
	}

	// Sorting method
	void sort(int arr[], int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			int pi = partition(arr, lowIndex, highIndex);
			sort(arr, lowIndex, pi - 1);
			sort(arr, pi + 1, highIndex);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 no.s ");
		for (int i = 0; i <= 4; i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n - 1);
		System.out.println("sorted array");
		printArray(arr);
	}
}
