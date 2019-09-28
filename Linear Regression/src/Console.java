import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JLabel;
import javax.swing.JFrame;
public class Console {
		static List DataPoints = new List();
		static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		static int height = screenSize.height;
		static int width = screenSize.width;
		
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.println("This program will calulate the linear regression line given data points\nWould you like to read data points from a file or manually input? Enter \"file\" or \"manual\"\n");
		String input = console.nextLine().toLowerCase();
		
		if(input.equals("file")) {
			System.out.println("Enter the name of the file you want to read from");
			String fileName = console.nextLine();
			Scanner in = new Scanner (new File (fileName)); 
			while(in.hasNext()) {
				String dataLine = in.nextLine();
				parse(dataLine);
			}

		}else if(input.equals("manual")) {
			boolean done = false;
			System.out.println("Please enter data points and enter DONE to finish or enter test to use test cases");

			while(!done) {
				input = console.nextLine().toLowerCase();
				if(input.equals("done")) {
					done = true;
				}else if(input.equals("undo")){
					DataPoints.undo();
					System.out.println("Your last entry has been removed");
				}else if(input.equals("test")){
					//test case result should be .039x + 65.14
					DataPoints.useTestData();
					done = true;
				}else {
					parse(input);
				}
			}
		}
		
		System.out.println(DataPoints.calculate());
		

		JFrame window = new JFrame();
		window.setSize(width,height);
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
	
	public static int getHeight() {
		return height;
	}
	public static int getWidth() {
		return width;
	}
}
