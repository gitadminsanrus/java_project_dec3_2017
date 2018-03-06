
public class Cat extends Animal {
	
	void sleep()
	{
		System.out.println("Cat way of sleeping.");
		
		//optional call to parent class 'sleep()' method
		//executing parent class behavior 'sleep()'
		super.sleep();
	}

}
