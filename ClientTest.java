import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args) {
		Client bar;
		bar = new Client("127.0.0.1"); // To change accordingly to the server ip
		bar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bar.startRunning();
	}
}