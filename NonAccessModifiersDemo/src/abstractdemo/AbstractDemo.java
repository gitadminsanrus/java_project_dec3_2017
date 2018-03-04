package abstractdemo;

public class AbstractDemo {

	public static void main(String[] args) {
		
		//cannot create an instance of car, because Car is an abstract class
		//Car car = new Car();
		
		//cannot create an instance of HondaCar, because HondaCar is an abstract class
		//HondaCar hondaCar = new HondaCar();
		
		//actual object of honda crb 2017 is created
		HondaCrb2017 hondaCrb2017 = new HondaCrb2017("CRB", "VIN12355");
		hondaCrb2017.steerLeft();

	}

}
