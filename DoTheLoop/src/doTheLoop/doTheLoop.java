package doTheLoop;

import java.util.Scanner;

public class doTheLoop {
	public static void main(String[]args){
		
		
		Scanner tal=new Scanner(System.in);
		
		int Siffra;
		
		System.out.print("Ange ett heltal att räkna ner från:");
		Siffra=tal.nextInt();
		
		//en do-loop
		do{
			System.out.print(Siffra+" ");
			Siffra--;
		}
		while(Siffra>=1);
			Siffra--;
		}
	}

