
public class AnimalKingdomDemo {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		animal.walk();

		System.out.println("=============================");
		//Dog => [new Dog() + new Animal() + new Object()]
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.walk();
		
		System.out.println("=============================");
		//Cat => [new Cat() + new Animal() + new Object()]
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.walk();
		
		System.out.println("=============================");
		//Upcasting cat reference to Animal reference
		//polymorphism effect in here, it will always call cat's overridden method: sleep()
		Animal animal1 = (Animal) cat;
		animal1.sleep();
	}

}
