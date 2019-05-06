
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class KlassPerson_f8 {
	Scanner pin = new Scanner(System.in);
	Scanner p2in = new Scanner(System.in);
	Scanner in1 = new Scanner(System.in);
	Scanner in2 = new Scanner(System.in);
	Scanner in3 = new Scanner(System.in);

	public String name;
	String name2;
	int persnr;

	int persnr2;
	String adress;
	int Âlder;
	int Âlder2;

	// konstruktor
	KlassPerson_f8(String pin, int in1, String in2, int in3) {
		name = "Henrik";
		;

		persnr = 19830712;
		adress = "sandviken";
		Âlder = 31;
	}

	KlassPerson_f8(String p2in, int in1, int in3) {

		name2 = "Erik";
		persnr2 = 19730219;
		Âlder2 = 22;

	}

	void printbyterName() {
		System.out.println("person1 byt namn till.");
		name = pin.nextLine();
		System.out.println("Nya namnet         " + name);
		// System.out.println("person2 byt namn till.");
		// name2=p2in.nextLine();

	}

	void printbyterPersonnummerperson1() {
		System.out.println("person fyller Âr");
		persnr = (in1.nextInt() + 1);

	}

	void printbyterPersonnummerperson2() {
		System.out.println("person2 fyller Âr");
		persnr = (in1.nextInt() + 1);

	}

	void printbyterAdress() {
		System.out.println("person1 byt adress");
		adress = in2.nextLine();
		System.out.println("din nya adress       " + adress);
		// System.out.println("person2 byt adress");
		// adress=in2.nextLine();
	}

	void printbyter≈lder() {
		System.out.println("Âlder");
		persnr = in3.nextInt();
	}

	void printfyller≈r() {
		System.out.println("Âlder");
		Âlder2 = (Âlder2 + 1);
		System.out.println(Âlder2);
	}

	void printPerson1Info() {
		System.out.printf("Person 1");

	}

	void printPerson2Info() {
		// System.out.println("Person 2"+persnr2+name2);

	}

	public String toString2() {
		String[] array = new String[] { "Person 2   " + name2 + "    " + persnr2 };
		// print array
		System.out.println(Arrays.toString(array));

		return adress;

	}

	public String toString1() {

		String[] array1 = new String[] { "Person 1   " + name + " " + persnr + "    " + Âlder };
		// print array
		System.out.println(Arrays.toString(array1));

		return adress;

	}

	public String toStringdendel1() {

		String[] array2 = new String[] { name + " " + persnr + "    " + adress + "     Person 1   " };
		// print array
		System.out.println(Arrays.toString(array2));

		return adress;

	}

	public String toStringdendel2() {
		String[] array3 = new String[] { name2 + " " + persnr2 + "    " + Âlder2 };
		// print array
		System.out.println(Arrays.toString(array3));

		return adress;

	}

}
