import javax.swing.JOptionPane;

public class EverythingIsAwesome{
	public static void main(String[] args) {
		String name = 	JOptionPane.showInputDialog(null, "what do you like?");
		System.out.println(name);
		JOptionPane.showMessageDialog(null, name + "! That's AWESOME!!!!!!!!!!!!!!!!!!");

	}

}
