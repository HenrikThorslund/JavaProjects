import java.util.concurrent.TimeUnit;

public class WorkAirTemprature {

	public static final double tooCold=12;
	public static final double tooHot=30;
	
	public static void startWorkday(double workTemp)throws TooHotException,TooColdException{
		if(workTemp>=tooHot){
			throw new TooHotException();
		}else if(workTemp<=tooCold){			
			throw new TooColdException();						
		}		
	}
	
	
public static void main(String[] args)throws TooHotException,TooColdException,InterruptedException{
		double currentInsideTemp=33;
		boolean wrongTemp=true;
		while(wrongTemp){
			
		try{
			startWorkday(currentInsideTemp);
			System.out.println("That air temprature is good!");
			wrongTemp=false;
		}catch(TooHotException e1){
			System.out.println("The air is Too Hot!");
			currentInsideTemp=currentInsideTemp-1;
					
		}catch(TooColdException e2){
			System.out.println("The air is to cold im freezing!");
			currentInsideTemp=currentInsideTemp+1;
		}
		TimeUnit.SECONDS.sleep(2);
		}
		System.out.println("A nother day of work is done!");
	}
	
}
