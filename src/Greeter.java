import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = 	JOptionPane.showInputDialog(null, "what is your name?");
		System.out.println(name);
		JOptionPane.showMessageDialog(null, "Hello " + name);
	}

}
