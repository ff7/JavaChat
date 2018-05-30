import javax.swing.JFrame;

public class ServerTest {
	public static void main(String[] args) {
		Server foo = new Server();
		foo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		foo.startRunning();
	}
}