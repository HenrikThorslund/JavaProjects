import java.util.Scanner;

public class TestKlassPersson_f8 {
	public static void main(String[] args) {

		String namn = "henrik";
		int �lder = 31;
		int �lder2 = 22;
		String address = "granv�gen2";
		int Personnummer = 830712;

		boolean run = true;

		KlassPerson_f8 person1 = new KlassPerson_f8(namn, �lder, address, Personnummer);
		KlassPerson_f8 person2 = new KlassPerson_f8(namn, Personnummer, �lder2);
		java.util.Scanner in1 = new java.util.Scanner(System.in);

		while (run) {
			Scanner in = new Scanner(System.in);
			int i;

			System.out.println();

			System.out.println("Vad vill du g�ra?");
			System.out.println("f�r att visa info om person1 tryck 1");
			System.out.println("f�r att visa info om person2 tryck 2");
			System.out.println("f�r att �ndra namn p� person1 tryck 3");
			System.out.println("f�r att fylla �r tryck 4");
			System.out.println("f�r att visa pers,adre p� person1 tryck 5");
			System.out.println("f�r att visa pers,adre p� person2 tryck 6");

			i = in.nextInt();

			if (i == 1) {
				person1.toString1();
			}

			if (i == 2) {
				person2.toString2();
			}
			if (i == 3) {
				person1.printbyterName();
				person1.printbyterAdress();

			}
			if (i == 4) {
				person2.printfyller�r();

			}
			if (i == 5) {
				person1.toStringdendel1();

			}
			if (i == 6) {
				person2.toStringdendel2();

			}

		}

		// KlassPerson_f8 person2=new KlassPerson_f8(z,v);

		// System.out.println("person1");
		// person1.printbyterName();
		// person1.printbyterPersonnummerperson1();
		// person1.printbyterAdress();
		// person1.printPerson1Info();
		// person1.toStringP1allt();
		// person1.printbyter�lder();

		// System.out.println("person2");

		// person2.printPerson1Info();

		// person2.printbyterName();
		// person2.printbyterPersonnummerperson2();
		// person2.printbyterAdress();

		return;

	}

}