import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

	public static void printArray(String[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			String item = array[i];
			System.out.print(item);
			if (i < array.length - 1) {

				System.out.print(", ");
			}

		}
		System.out.println("]");
	}

	public static <E> void printArray(E[] array) {

		for (E element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArray1;
		Integer[] intArray2 = new Integer[4];
		printArray(intArray2);
		Integer[] intArray3 = { 5, 2, 9, 1, 3 };

		String[] carpartList = { "Tyres", "gas", "radio" };

		intArray2[0] = 10;
		intArray2[1] = 8;
		intArray2[2] = 5;
		intArray2[3] = 10;

		// Custom print out arrays
		printArray(intArray2);
		printArray(intArray3);

		// Retrieve objects
		System.out.println(intArray2[3]);
		System.out.println(Array.get(intArray2, 3));
		System.out.println();

		// Give functions
		Arrays.sort(intArray3);
		printArray(intArray3);

		// Print string array
		printArray(carpartList);

		System.out.println("Special type of Loop:");
		// Special for loop: foreach
		for (String s : carpartList) {
			System.out.println(s);

		}

	}

}
