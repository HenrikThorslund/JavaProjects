import java.util.Scanner;

public class BooleanPractice {
	
public static void main(String[]args){
	
	Scanner tal=new Scanner(System.in);
	
	int var1,var2,var3;
	boolean b1,b2,b3,b4,b5;
	
	System.out.println("Skriv in tal var1");
	var1=tal.nextInt();
	
	System.out.println("Skriv in tal var2");
	var2=tal.nextInt();
	
	System.out.println("Skriv in tal var3");
	var3=tal.nextInt();
	

//-------------------------------fråga a	
	if (var1%7==0)
		 b1 = true;
	
	else
		b1=false;
	System.out.println("fråga a.Value of boolean variable b1 is :" + b1);
	
//-------------------------------fråga b		
	
	if (var3%2!=0)
		 b2 = true;
	
	else
		b2=false;
	System.out.println("fråga b.Value of boolean variable b2 is :" + b2);
//-------------------------------fråga c	
	
	if ((var1>var2)||(var1>var3))
		 b3 = true;
	
	else
		b3=false;
	System.out.println("fråga c.Value of boolean variable b3 is :" + b3);
	
//-------------------------------fråga d	
	
	if ((var1>var2)&&(var2>var3))
		 b4 = true;
		
	else
		b4=false;
	System.out.println("fråga d.Value of boolean variable b4 is :" + b4);	
	
	//---------------------------fråga e	
	
		if((var1>var2||var1>var3)&&((var2>=var1)||(var3>=var1)))
			 b5 = true;
			
		else
			b5=false;
		System.out.println("fråga e.Value of boolean variable b5 is :" + b5);	

}

}