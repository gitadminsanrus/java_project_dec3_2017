
public class AnimalDemo {

	public static void main(String[] args) {
		
		Animal[] animals = getAnimals();
		
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			
			animal.eat();
			animal.sleep();
			animal.talk();
			
			if (animal instanceof Dog) {
				((Dog) animal).dogSpecificBehavior();
			}
		}
		
	}
	
	
	public static Animal[] getAnimals() {
		Animal[] animals = new Animal[5];
		
		animals[0] = new Dog();
		animals[1] = new Cat1();
		animals[2] = new Dog1();
		animals[3] = new Cat();
		animals[4] = new Dog1();
		
		return animals;
	}

}
