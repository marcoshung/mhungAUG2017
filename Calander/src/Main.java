import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.JLabel;

public class Main {
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static int height = screenSize.height;
	static int width = screenSize.width;
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(width,height);
		window.setTitle("NEW JFRAME");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		DrawComponent draw = new DrawComponent();
		window.add(draw);
	}
	
	public static int getHeight() {
		return height;
	}
	public static int getWidth() {
		return width;
	}
}
