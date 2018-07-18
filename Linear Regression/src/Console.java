import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
public class Console {
		static List DataPoints = new List();
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("This program will calulate the linear regression line given data points\nPlease enter data points and enter DONE to finish");
		boolean done = false;
		while(!done) {
			String input = console.nextLine().toLowerCase();
			if(input.equals("done")) {
				done = true;
			}else if(input.equals("undo")){
				DataPoints.undo();
				System.out.println("Your last entry has been removed");
			}else if(input.equals("test")){
				DataPoints.useTestData();
				done = true;
			}else {
				parse(input);
			}
		}
		System.out.println(DataPoints.calculate());
		
		JFrame window = new JFrame();
		window.setSize(500,500);
		window.setTitle("NEW JFRAME");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		DrawComponent draw = new DrawComponent();
		window.add(draw);
	}
	
	public static void parse(String input) {
		String[] parsed = input.trim().split(" ");
		if(parsed.length != 2) {
			System.out.println("INCORRECT DATA POINT FORMAT : TRY AGAIN");
		}else {
			DataPoint newPoint = new DataPoint(Double.parseDouble(parsed[0]), Double.parseDouble(parsed[1]));
			DataPoints.addPoint(newPoint);
		}
		
	}
	
	public static List getList() {
		return DataPoints;
	}
}
