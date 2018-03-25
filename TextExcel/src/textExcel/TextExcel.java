//Marcos Hung; Per 2
package textExcel;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args){
		boolean done = false;
		String input;
		Scanner console = new Scanner(System.in);
		while(!done) {
			System.out.println("Enter Command");
			input = console.nextLine();
			if(input.toLowerCase().equals("quit")) {
				System.out.println("You are done");
				done = true;
			}else {
				Spreadsheet cell = new Spreadsheet();
				System.out.println(cell.processCommand(input));
			}
		}
	}
}
