import java.util.Scanner;

public class Kursbok {

	public static void main(String[] args) {
		{
			Scanner scan = new Scanner(System.in);
			final int vokalerna = 6;

			int a = 0, e = 0, i = 0, o = 0, u = 0, y = 0;

			System.out.println("Mata in strängen:");
			String line = scan.nextLine();

			for (int c = 0; c < line.length(); c++) {

				switch (line.charAt(c)) {
				case 'a':
					a++;
					break;
				case 'e':
					e++;
					break;
				case 'i':
					i++;
					break;
				case 'o':
					o++;
					break;
				case 'u':
					u++;
					break;
				case 'y':
					y++;
					break;

				}
			}
			System.out.println("I strängen finns:");
			System.out.println(a + " st a:n");
			System.out.println(o + " st o:n");
			System.out.println(u + " st u:n");
			System.out.println(e + " st e:n");
			System.out.println(i + " st i:n");
			System.out.println(y + " st y:n");
		}

	}

}
