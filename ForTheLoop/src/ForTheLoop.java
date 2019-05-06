import java.util.Scanner;

public class ForTheLoop{
	public static void main(String[]args){
		
		Scanner tal=new Scanner(System.in);
		
		int Siffra;
		
		System.out.print("Ange ett heltal som du vill räkna ner från:");
		Siffra=tal.nextInt();
		
		//en for-loop
		for(int counter=Siffra;counter>=1;counter--){
			System.out.print(counter+" ");
			
		}
		
	}
	
}
