import java.util.Scanner;

public class WhileTheLoop {
	
	public static void main(String[]args){
		
		Scanner tal=new Scanner(System.in);
		
		int siffra,stopp,j;
		j=1;
		
		System.out.print("vilken multiplikationstabell önskas?");
		siffra=tal.nextInt();
		
		System.out.print("Hur långt ska jag räkna?");
		stopp=tal.nextInt();
		
		//while-loop
		while((j*siffra)<=(siffra*stopp)){
			System.out.println(siffra+"*"+j+"="+(siffra*j));
		j=j+1;
	}
	}
}