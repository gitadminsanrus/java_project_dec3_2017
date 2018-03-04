package staticdemo;

public class Circle {
	
	public static final double PI = (22.0 / 7); 
	private double radius;
	private String name;
	
	private static int count; 
	
	static {
		System.out.println("This will be executed only once for all the object creation. Especially when it is loaded into JVM.");
	}
	
	
	{
		System.out.println("Object initialization block will be called just before the constructor call. Called during every object creation.");
	}
	
	public Circle(String name, double radius) {
		this.name = name;
		this.radius = radius;
		count++;
		System.out.println("Constructor call. After this the object will be fully created to use.");
	}
	
	public double getArea() {
		double area = (PI) * (radius * radius); 
		return area; 
	}
	
	public static int getCount() {
		return count;
	}
	
	public static double get_Area(Circle circle) {
		return (PI) * (circle.radius * circle.radius);
	}

}













