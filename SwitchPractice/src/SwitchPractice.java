import java.util.Scanner;


public class SwitchPractice {
	
	public static void main(String[] args){
	boolean run =true;
	
	while(run){
	    Scanner input = new Scanner(System.in);
	    int ans;
	    System.out.println("Välj månad");
	    ans = input.nextInt();
	    if(ans<0||ans>12){
	    	System.out.println("Den månaden finns inte vänligen välj igen");
	    }
	   
	    switch(ans){
	    	case 0:
        	System.exit(0);
        	break;
	        case 1:
	        	System.out.println("januari 31 dagar");
	        break;
	        case 2:
	        	System.out.println("februai 28 dagar");
	        break;
	        case 3:
	        	System.out.println("mars 31 dagar");
	        break;
	        case 4:
	        	System.out.println("april 30 dagar");
	        	break;
	        case 5:
	        	System.out.println("maj 31 dagar");
	        	break;
	        case 6:
	        	System.out.println("juni 30 dagar");
	        	break;
	        case 7:
	        	System.out.println("juli 31 dagar");
	        	break;
	        case 8:
	        	System.out.println("augusti 31 dagar");
	        	break;
	        case 9:
	        	System.out.println("september 30 dagar");
	        	break;
	        case 10:
	        	System.out.println("oktober 30 dagar");
	        	break;
	        case 11:
	        	System.out.println("november 31 dagar");
	        	break;
	        case 12:
	        	System.out.println("december 30 dagar");
	        	break;
	        default:
	    
	        }
	       }
	     }
	 }