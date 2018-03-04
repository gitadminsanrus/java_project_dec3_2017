
public class BoxDemo {

	public static void main(String[] args) {

		Box box = new Box(1, 2, 3, args[0]);
		System.out.println("Volume of Box '" + box.getName() + "' => " + box.getVolume() + "cm3");
		
	}

}
