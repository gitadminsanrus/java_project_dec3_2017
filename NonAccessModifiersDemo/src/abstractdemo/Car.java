package abstractdemo;

public abstract class Car {
	
	public static int MINIMUM_WHEELS = 4;
	
	private String modelName;
	private String vin;
	private int noOfWheels = MINIMUM_WHEELS;
	
	static {
		
	}
	
	{
		
	}
	
	public Car(String modelName, String vin)
	{
		this.modelName = modelName;
		this.vin = vin;
	}
	
	public abstract void steerLeft();
	
	public void steerRight() 
	{
		
	}
	
	public void accelerate()
	{
		
	}
	
	public void brake()
	{
		
	}
	
	public void startEngine()
	{
		
	}
	
	public void changeGear(int gearLevel) {
		
	}
	

}
