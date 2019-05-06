

public class Plane {

	int maxSpeed=700;
	int minSpeed=0;
	
	double weight=14079;
	
	boolean isThePlaneOn=false;
	char condition='A';
	String nameOfPlane="Airforce2";
	
	double maxFuel=162132;
	double currentFuel=8222;
	double mpg=2612.4;
	
	int numberOfPeopleInPlane=1;
	int maxNumberOfPeopleInPlane=200;
	
	public Plane(){
			
		
	}
	
	
	public Plane(int customMaxSpeed,double customeWeight,boolean customIsThePlaneOn){
		maxSpeed=customMaxSpeed;
		weight=customMaxSpeed;
		isThePlaneOn=customIsThePlaneOn;
		
	}
	
	//Getters and setters
	public int getMaxSpeed(){
		
		return this.maxSpeed;		
	}
	
	public void setMaxSpeed(int newMaxSpeed){
		this.maxSpeed=newMaxSpeed;
		
		
	}
	public int getMinSpeed(){
		return this.minSpeed;			
	}
	
	public double getWeight(){
		return this.weight;			
	}
	
	
	
	public boolean getIsThePlaneOn(){
		return this.isThePlaneOn;			
	}
	
	
	
	public void printVariables(){
		
		System.out.println("This is the maxSpeed "+maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isThePlaneOn);
		System.out.println(condition);
		System.out.println(nameOfPlane);
		System.out.println(numberOfPeopleInPlane);
	
	}
	
	
	public void upgrademaxSpeed(){
		setMaxSpeed(getMaxSpeed()+10);
		
	}
	
	public void getIn(){
		if(numberOfPeopleInPlane<maxNumberOfPeopleInPlane){
			numberOfPeopleInPlane ++;
			System.out.println("Sommeone enterd the Plane");					
		}else{
			System.out.println("The Plane have reached the limit of people! "+ numberOfPeopleInPlane+ "=" +numberOfPeopleInPlane);		
		}
		
	}
	
	
	public void getOut(){
		if(this.numberOfPeopleInPlane>0){
			//then tell one to get out
			numberOfPeopleInPlane--;
		}else{
			System.out.println("No one is in the Plane"+numberOfPeopleInPlane);
			
			
		}
	}
	
	
	public double howManyMilesTillOutOfGas(){
		return currentFuel*mpg;
		
	}
	
	public double maxMilesPerFillUp(){
		return maxFuel*mpg;
		
	}
	
	public void turnTheCarOn(){
	//If the Car isnt on...
		if(!isThePlaneOn){
			isThePlaneOn=true;		
		}else{
			//otherwise print out the fact its on
			System.out.println("The Plane is already on "+isThePlaneOn);
			
		}
	
	}
	
	public static void main(String[]args){
		
		Plane myPlane=new Plane();
		myPlane.getOut();
		myPlane.getOut();
		myPlane.getIn();
		myPlane.getIn();
		myPlane.getIn();
		myPlane.getIn();
		myPlane.getIn();
		myPlane.getIn();
		myPlane.getIn();
		myPlane.turnTheCarOn();
		myPlane.turnTheCarOn();
		
		
	}
	
	
}
