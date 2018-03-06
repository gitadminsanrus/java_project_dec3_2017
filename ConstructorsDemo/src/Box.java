
public class Box {
	
	double width;
	double height;
	double depth;
	
	//Box()
	Box() {
		width = 1;
		height = 1;
		depth = 1;
	}
	
	//Box(double, double, double)
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	//Box(double, double, int)
	Box(double h, double w, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
	//Box(double)
	Box(double w) {
		width = w;
	}
	
	

}
