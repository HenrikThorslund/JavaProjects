
	//Henrik Thorslund 19830712 Lab1uppgift1

	public class Lab1Variable
	{
	public static void main(String[] args)
	{
	boolean data1 = true;
	float data2 = 45.8F;
	byte data3 = 29;		//jag har valt den lägsta möjliga datatypen för att spara minne.
	boolean data4 = data3 < 10;
	byte data5 = 12/5;		
	int data6 = data3 * data5;
	byte data7 = 10 % 3;
	String data8 = "Java programmering";
	char data9 = 'b';
	float data10 = (float)data5 / 4;

	//skriver ut till Console!
	System.out.println ("Variabeln data1: " + data1);
	System.out.println ("Variabeln data2: " + data2);
	System.out.println ("Variabeln data3: " + data3);
	System.out.println ("Variabeln data4: " + data4);
	System.out.println ("Variabeln data5: " + data5);
	System.out.println ("Variabeln data6: " + data6);
	System.out.println ("Variabeln data7: " + data7);
	System.out.println ("Variabeln data8: " + data8);
	System.out.println ("Variabeln data9: " + data9);
	System.out.println ("Variabeln data10: " + data10);
	}
	}
