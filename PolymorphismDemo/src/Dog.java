
public class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog way of eating");
	}

	@Override
	public void sleep() {
		System.out.println("Dog way of sleeping");
	}

	@Override
	public void talk() {
		System.out.println("Dog way of talking");
	}
	
	public void dogSpecificBehavior() {
		
	}

}
