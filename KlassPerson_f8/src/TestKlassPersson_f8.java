import java.util.Scanner;

public class TestKlassPersson_f8 {
	public static void main(String[] args) {

		String namn = "henrik";
		int ålder = 31;
		int ålder2 = 22;
		String address = "granvägen2";
		int Personnummer = 830712;

		boolean run = true;

		KlassPerson_f8 person1 = new KlassPerson_f8(namn, ålder, address, Personnummer);
		KlassPerson_f8 person2 = new KlassPerson_f8(namn, Personnummer, ålder2);
		java.util.Scanner in1 = new java.util.Scanner(System.in);

		while (run) {
			Scanner in = new Scanner(System.in);
			int i;

			System.out.println();

			System.out.println("Vad vill du göra?");
			System.out.println("för att visa info om person1 tryck 1");
			System.out.println("för att visa info om person2 tryck 2");
			System.out.println("för att ändra namn på person1 tryck 3");
			System.out.println("för att fylla år tryck 4");
			System.out.println("för att visa pers,adre på person1 tryck 5");
			System.out.println("för att visa pers,adre på person2 tryck 6");

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
				person2.printfyllerÅr();

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
		// person1.printbyterÅlder();

		// System.out.println("person2");

		// person2.printPerson1Info();

		// person2.printbyterName();
		// person2.printbyterPersonnummerperson2();
		// person2.printbyterAdress();

		return;

	}

}