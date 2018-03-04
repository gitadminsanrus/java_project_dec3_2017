package finaldemo;

//final keyword to class will prevent inheritance
public final class Box {
	
	final String DEFAULT_NAME;
	
	double width;
	double height;
	double thickness;
	
	private Box()
	{
		 DEFAULT_NAME = "DEFAULT-BOX";
	}
	
	Box(String name) {
		this.DEFAULT_NAME = name;
	}
	
	Box(final double width, final double height, final double thickness) {
		this();
		
		this.width = width;
		this.height = height;
		this.thickness = thickness;
	}
	
	
	public final void method1(final int x) 
	{
		final int LOCAL_CONSTANT;
		
		LOCAL_CONSTANT = (x + 5);
	
	}

}
