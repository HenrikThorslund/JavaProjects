

import java.util.Scanner;

public class modulus {

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			Scanner tal = new Scanner(System.in);

			int i;
			int Siffra;

			System.out.println("Ange ett heltal");
			Siffra = tal.nextInt();

			for (i = 2; i < Siffra; i++) {
				if (Siffra % i == 0) {
					System.out.println("det var ej ett primtal");
					break;
				}

			}

		}

	}

}