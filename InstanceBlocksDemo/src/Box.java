
public class Box {
	
	double width;
	double height;
	double thickness;
	String name;
	
	//initialization blocks for object instances
	{
		System.out.println("Instance blocks");
		name = "DEFAULT-BOX";
	}
	
	Box(double width, double height, double thickness) {
		this.width = width;
		this.height = height;
		this.thickness = thickness;
		
		System.out.println("Box(double, double, double)");
	}
	
	public void finalize()
	{
		System.out.println("Last call just before object deletion");
	}

}
