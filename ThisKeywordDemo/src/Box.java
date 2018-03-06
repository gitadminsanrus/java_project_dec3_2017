
public class Box {
	
	double width;
	double height;
	double depth;
	
	//Box()
	Box() {
		this(1, 1, 1);
//		width = 1;
//		height = 1;
//		depth = 1;
	}
	
	//Box(double, double, double)
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	//Box(double, double, int)
	Box(double height, double width, int depth) {
		this(width, height, (double) depth);
//		this.width = width;
//		this.height = height;
//		this.depth = depth;
	}
	
	//Box(double)
	Box(double w) {
		this(w, 0, 0);
//		width = w;
	}
	
	double getVolume() {
		return width * height * depth;
	}
	
	

}
