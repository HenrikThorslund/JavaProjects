import java.util.Arrays;
import java.util.Scanner;

public class ArtikelVarulager_f9 {

	private String printändraNamn;
	Scanner pin = new Scanner(System.in);
	Scanner pin1 = new Scanner(System.in);
	Scanner pin2 = new Scanner(System.in);
	Scanner pin3 = new Scanner(System.in);

	// class variable
	public int totArtiklar;

	// instance Variables
	int artikelnr;
	String artikelnamn;
	int lagerantal;
	double pris;
	int antalArtiklar;

	// konstruktor
	ArtikelVarulager_f9() {

		antalArtiklar = totArtiklar;

		artikelnr = 10;
		artikelnamn = "Smör";
		lagerantal = 5;
		pris = 14.90;

	}

	void ändraNamn() {
		System.out.println("artikelnamn byt namn till.");
		artikelnamn = pin.nextLine();
		System.out.println("Nya namnet         " + artikelnamn);
		// System.out.println("person2 byt namn till.");
		// name2=p2in.nextLine();

	}

	void hamtaNamn() {
		System.out.println("artikelnamnet är.");

		System.out.println(artikelnamn);

	}

	void säljaArtikel() {
		System.out.println("Sälj Artikel");
		lagerantal = lagerantal - pin1.nextInt();
		System.out.println("antal artiklar kvar på lagret       " + lagerantal);

	}

	void köpArtikel() {
		System.out.println("köp Artikel");
		lagerantal = lagerantal + pin2.nextInt();
		System.out.println("antal artiklar kvar på lagret       " + lagerantal);

	}

	void ändraPris() {
		System.out.println("ändra pris till");
		pris = pin3.nextInt();
		System.out.println("Nuvarande pris       " + pris + " kr");

	}

	void hamtaTotAntal() {
		System.out.println("antal artikelslag");

		System.out.println("Totalt antal på lagret" + lagerantal);

	}

	public String toskrivInfo() {

		String[] array1 = new String[] { "antalArtiklar   " + artikelnr + "   artiklar    " + artikelnamn
				+ "    lagerantal    " + lagerantal + "   pris   " + pris + "kr" };
		// print array
		System.out.println(Arrays.toString(array1));

		return artikelnamn;

	}
}
