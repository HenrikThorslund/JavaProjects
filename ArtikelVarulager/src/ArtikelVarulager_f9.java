import java.util.Arrays;
import java.util.Scanner;

public class ArtikelVarulager_f9 {

	private String print�ndraNamn;
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
		artikelnamn = "Sm�r";
		lagerantal = 5;
		pris = 14.90;

	}

	void �ndraNamn() {
		System.out.println("artikelnamn byt namn till.");
		artikelnamn = pin.nextLine();
		System.out.println("Nya namnet         " + artikelnamn);
		// System.out.println("person2 byt namn till.");
		// name2=p2in.nextLine();

	}

	void hamtaNamn() {
		System.out.println("artikelnamnet �r.");

		System.out.println(artikelnamn);

	}

	void s�ljaArtikel() {
		System.out.println("S�lj Artikel");
		lagerantal = lagerantal - pin1.nextInt();
		System.out.println("antal artiklar kvar p� lagret       " + lagerantal);

	}

	void k�pArtikel() {
		System.out.println("k�p Artikel");
		lagerantal = lagerantal + pin2.nextInt();
		System.out.println("antal artiklar kvar p� lagret       " + lagerantal);

	}

	void �ndraPris() {
		System.out.println("�ndra pris till");
		pris = pin3.nextInt();
		System.out.println("Nuvarande pris       " + pris + " kr");

	}

	void hamtaTotAntal() {
		System.out.println("antal artikelslag");

		System.out.println("Totalt antal p� lagret" + lagerantal);

	}

	public String toskrivInfo() {

		String[] array1 = new String[] { "antalArtiklar   " + artikelnr + "   artiklar    " + artikelnamn
				+ "    lagerantal    " + lagerantal + "   pris   " + pris + "kr" };
		// print array
		System.out.println(Arrays.toString(array1));

		return artikelnamn;

	}
}
