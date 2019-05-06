//Henrik Thorslund 19830712 Lab1uppgift4
import java.util.Scanner;


public class IfAndElse {
	public static void main(String arg[]){
		Scanner tal=new Scanner(System.in);
		
		
		int ålder;
		
		//skriver ut till Console!
		System.out.print("Hur gammal är du?");
		ålder=tal.nextInt();
		
		if(ålder<0)
		System.out.println("Du har matat in fel ålder");
		else
			System.out.println("Hej, din "+ålder+" åring!");
		
	}

}
