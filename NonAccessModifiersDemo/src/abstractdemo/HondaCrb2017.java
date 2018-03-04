package abstractdemo;

public class HondaCrb2017 extends HondaCar {
	
	public HondaCrb2017(String modelName, String vin) {
		super(modelName, vin);
	}

	//overridden from HondaCar
	public void steerLeft() {
		
		System.out.println("Specific behavior of Honda CRB 2017 car");
		
		super.steerLeft();
	}

}
