package person;

import static person.PantsColor.*;

public class Person {

	PantsColor PantsColor = BLACK;

	public Person() {

	}

	public static void main(String[] args) {
		Person Henrik = new Person();
		Person Dan = Henrik;

		Henrik.PantsColor = PINK;

		System.out.println("The Color of Henriks pants is: " + Henrik.PantsColor);
		System.out.println("The Color of Dans pants is : " + Dan.PantsColor);
	}

}
