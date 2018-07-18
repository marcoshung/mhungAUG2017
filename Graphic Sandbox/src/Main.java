import javax.swing.JFrame;
import java.awt.Rectangle;
import java.util.*;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(800,800);
		window.setTitle("NEW JFRAME");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		Drawing draw = new Drawing();
		window.add(draw);
		JLabel text = new JLabel("Test");
		window.add(text);
	}
}
