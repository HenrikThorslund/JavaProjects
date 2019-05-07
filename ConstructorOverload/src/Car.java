
public class Car {

	private int modelYear;
	private String carBrand;

	// this constructor is overloaded
	public Car(int modelYear) {
		this(modelYear, "Nobody");
	}

	// this constructor is overloaded
	public Car(int modelYear, String carBrand) {
		this.modelYear = modelYear;
		this.carBrand = carBrand;
	}

	public int GetModelYear() {
		return modelYear;
	}

	public void GetModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setName(String carBrand) {
		this.carBrand = carBrand;
	}

	public static void main(String args[]) {
		// using constructor with two parameters
		Car henrik = new Car(1999, "Henrik");
		// using constructor with one parameters
		Car dan = new Car(2011, "Dan");
		System.out.println(
				"The first Car Owner is a person called " + henrik.getCarBrand() + "  and the car model Year is " + henrik.GetModelYear() + " years");
		System.out.println("The Second Owner is a person called " + dan.getCarBrand() + " and the car model Year is " + dan.GetModelYear() + " years");
	}
}
