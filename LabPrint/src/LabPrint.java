import java.util.Scanner;

public class LabPrint {
	public static void main(String[]arg){
		
		//g�r det m�jligt att f� v�rden fr�n anv�ndaren
		Scanner tal=new Scanner(System.in);
		int fnum,anum,tnum,summa,medelv�rdet,produkten;
		
		System.out.println("Skriv in tre heltal.");
		System.out.println("Skriv in det f�rsta talet:");
		//sparar v�rdet fr�n anv�ndaren i fnum
		fnum=tal.nextInt();
		System.out.println("Skriv in det andra talet:");
		anum=tal.nextInt();
		System.out.println("Skriv in det tredje talet:");
		tnum=tal.nextInt();
		
		//utr�kningar
		summa=fnum+anum+tnum;
		medelv�rdet=summa/3;
		produkten=fnum*anum*tnum;
		
		
		System.out.println("Summa:  "+summa);
		System.out.println("Medelv�rde:  "+medelv�rdet);
		System.out.println("Produkten:  "+produkten);
	
		
	//avslutar programmet.
	System.exit(0);
	
	
	
		
		
	}
}
