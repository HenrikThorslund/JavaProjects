//Henrik Thorslund 19830712 Lab1uppgift4
import java.util.Scanner;


public class IfAndElse {
	public static void main(String arg[]){
		Scanner tal=new Scanner(System.in);
		
		
		int �lder;
		
		//skriver ut till Console!
		System.out.print("Hur gammal �r du?");
		�lder=tal.nextInt();
		
		if(�lder<0)
		System.out.println("Du har matat in fel �lder");
		else
			System.out.println("Hej, din "+�lder+" �ring!");
		
	}

}
