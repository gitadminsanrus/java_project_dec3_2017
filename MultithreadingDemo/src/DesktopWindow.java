import javax.swing.JFrame;

public class DesktopWindow extends JFrame {

	public static void main(String[] args) {
		
		DesktopWindow desktopWindow = new DesktopWindow();
		desktopWindow.setName("Desktop Window Demo");
		
		desktopWindow.setSize(300, 400);
		desktopWindow.show();

	}

}
