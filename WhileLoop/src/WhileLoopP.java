import java.util.Scanner;

import java.util.Scanner;

public class WhileLoopP {
	public static void main(String[] args) {

		Scanner tal = new Scanner(System.in);

		int heltal;

		System.out.print("Ange ett heltal som du vill räkna ner från:");
		heltal = tal.nextInt();

		// while-loop
		while (heltal >= 1) {
			System.out.print(heltal + " ");
			heltal = heltal - 1;

		}
		System.exit(0);
	}
}



