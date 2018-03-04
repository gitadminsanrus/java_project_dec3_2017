
public class Box {
	
	private double w;
	private double h;
	private double t;
	private String name;
	
	Box (double w, double h, double t, String name) {
		this.w = w;
		this.h = h;
		this.t = t;
		this.name = name;
	}
	
	public double getVolume() {
		return w * h * t;
	}
	
	public String getName() {
		return name;
	}

}
