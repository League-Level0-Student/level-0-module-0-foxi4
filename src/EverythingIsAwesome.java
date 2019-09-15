import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {


		String input=JOptionPane.showInputDialog("What do you like, viewer?");
		
		JOptionPane.showMessageDialog(null," That's awesome! "+ "I like " +input+" too.");
	
}
}