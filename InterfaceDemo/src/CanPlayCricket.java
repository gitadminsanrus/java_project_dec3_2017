
public interface CanPlayCricket {
	
	public abstract void bat();
	public abstract void bowl();
	public abstract void wicketKeep();
	
	//Valid from JDK 8
	default public int getX() {
		return 10;
	}

}
