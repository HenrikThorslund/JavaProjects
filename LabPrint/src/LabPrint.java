import java.util.Scanner;

public class LabPrint {
	public static void main(String[]arg){
		
		//gör det möjligt att få värden från användaren
		Scanner tal=new Scanner(System.in);
		int fnum,anum,tnum,summa,medelvärdet,produkten;
		
		System.out.println("Skriv in tre heltal.");
		System.out.println("Skriv in det första talet:");
		//sparar värdet från användaren i fnum
		fnum=tal.nextInt();
		System.out.println("Skriv in det andra talet:");
		anum=tal.nextInt();
		System.out.println("Skriv in det tredje talet:");
		tnum=tal.nextInt();
		
		//uträkningar
		summa=fnum+anum+tnum;
		medelvärdet=summa/3;
		produkten=fnum*anum*tnum;
		
		
		System.out.println("Summa:  "+summa);
		System.out.println("Medelvärde:  "+medelvärdet);
		System.out.println("Produkten:  "+produkten);
	
		
	//avslutar programmet.
	System.exit(0);
	
	
	
		
		
	}
}
