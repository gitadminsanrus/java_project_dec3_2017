package abstractdemo;

public abstract class HondaCar extends Car {

	public HondaCar(String modelName, String vin) {
		super(modelName, vin);
	}

	//overridden from Car
	//still HondaCar can be marked abstract, 
	//just because we dont want to create instances of HondaCar
	public void steerLeft() {
		System.out.println("Common behavior for all honda cars");
	}
	

}
