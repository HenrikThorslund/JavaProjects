//Henrik Thorslund 19830712 Lab1uppgift3
import java.util.Scanner;

public class ScannerAndPrint {
public static void main(String args[]){
	
	//g�r det m�jligt att f� v�rden fr�n anv�ndaren
	Scanner tal=new Scanner(System.in);
	float mil,kilometer,answer;
	
	//skriver ut till Console!
	System.out.print("Skriv in antal mil:");
	//sparar v�rdet fr�n anv�ndaren i mil
	mil=tal.nextFloat();
	
	kilometer=10;
	answer=(mil*kilometer);
	System.out.println("Motsvarande antal km: "+answer);
	
}
	
}