import java.util.Scanner;

public class StringSearch {

	public static String[] sort_sub(String array[], int f) {
		String temp = "";
		for (int i = 0; i < f; i++) {
			for (int j = i + 1; j < f; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	static int binarySearch(String[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m]);

			// Check if x is present at mid
			if (res == 0)
				return m;

			// If x greater, ignore left half
			if (res > 0)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of String ");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter " + size + " names");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.next();
		}

		String sortedArray[] = sort_sub(arr, arr.length);
		System.out.println("\nSorted Array");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

		String x = "";
		System.out.println("Enter string to search\n");
		x = sc.next();
		int result = binarySearch(sortedArray, x);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}
}
