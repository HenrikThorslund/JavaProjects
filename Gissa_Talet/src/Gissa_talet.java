import java.util.Random;
import java.util.Scanner;

public class Gissa_talet {
	public static void main(String[] args) {

		boolean b2 = true;
		while (b2) {
			Random randomGenerator = new Random();
			int randomInt = randomGenerator.nextInt(10);

			Scanner input = new Scanner(System.in);
			Scanner input1 = new Scanner(System.in);

			boolean b1 = true;

			int ans;
			int n = 1;

			String s1 = "j";

			int j = 0;
			int c = 1;

			while (b1) {

				System.out.println("V�lj tal");
				System.out.println("f�rs�k" + c);
				ans = input.nextInt();

				if (ans < randomInt) {
					System.out.println("talet �r st�rre");
					c++;
					continue;
				} else if (ans > randomInt) {
					System.out.println("talet �r mindre");
					c++;
					continue;
				} else if (ans == randomInt)
					System.out.println("R�tt!");
				System.out.println("Vill du spela igen?(n/j)");
				String ans2Int = input1.next();

				if (s1.equals(ans2Int)) {
					System.out.println("det funkar �tligen");
					c = 1;
					continue;
				} else

					System.exit(0);
			}
		}

	}
}
