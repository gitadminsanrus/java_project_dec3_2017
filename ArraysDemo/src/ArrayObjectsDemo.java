
public class ArrayObjectsDemo {

	public static void main(String[] args) {
		
		Circle circles[] = new Circle[10];
		circles[0] = new Circle();
		circles[1] = new Circle();
		
		Circle myCircle = new Circle();
		myCircle.radius = 10;
		circles[2] = myCircle;

	}

}
