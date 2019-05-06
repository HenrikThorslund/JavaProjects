//Henrik Thorslund 19830712 Lab1uppgift3
import java.util.Scanner;

public class ScannerAndPrint {
public static void main(String args[]){
	
	//gör det möjligt att få värden från användaren
	Scanner tal=new Scanner(System.in);
	float mil,kilometer,answer;
	
	//skriver ut till Console!
	System.out.print("Skriv in antal mil:");
	//sparar värdet från användaren i mil
	mil=tal.nextFloat();
	
	kilometer=10;
	answer=(mil*kilometer);
	System.out.println("Motsvarande antal km: "+answer);
	
}
	
}