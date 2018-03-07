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
		System.out.println("Enter Command");
		while(!done) {
			input = console.nextLine();
			if(input.toLowerCase().equals("quit")) {
				System.out.println("You are done");
				done = true;
			}else {
				System.out.println("FINISH REST OF CODE");
			}
		}
	}
}
