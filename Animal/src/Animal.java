
public abstract class Animal {
	private int age;

	public Animal(int age) {
		this.age = age;
		System.out.println("An animal has been created!");

	}

	public abstract void eat();

	public void sleep() {
		System.out.println("an animal is sleaping");

	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Horse d = new Horse();
		Elefant c = new Elefant();
		d.eat();
		c.eat();
		d.sleep();
		c.sleep();

		// Casting
		Object horse = new Horse();
		Horse realDog = (Horse) horse;
		realDog.ruff();

		Object str = "east";
		String reals = (String) str;
		reals.getBytes();

		// What happens when....
		Horse horsy = new Horse();
		if (horsy instanceof Animal) {
			Animal animal = (Animal) horsy;
			animal.sleep();

		}
		horsy.sleep();

		// What happens when....
		Elefant elfanty = new Elefant();
		if (horsy instanceof Animal) {
			Animal animal = (Animal) elfanty;
			animal.sleep();

		}
		elfanty.sleep();

	}

}
