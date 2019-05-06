import java.util.Scanner;

public class EnVissBokstav {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);

		int count = 0;

		String ord;
		String bokst;

		System.out.println("skriv orden här");
		ord = in.nextLine();

		System.out.println("vilken bostav letar du efter?");
		bokst = in1.nextLine();

		char cbokstav = bokst.charAt(0);
		for (int x = 0; x < ord.length(); x++)
			if (ord.charAt(x) == cbokstav)
				count++;
		System.out.println(count + " " + " st " + cbokstav + ":n");

	}
}
