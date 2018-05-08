//Marcos Hung
//This project will be able to calculate simple statistic problems
import java.util.*;
public class Client {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to the Guessing Game!!! \nGuess the hidden word by entering in words you think it is!"
				+ "\n KEY:\n* = Letter not in word\n+ = Letter in word, but in a different spot\n- = extra letters\n/ = missing letters");
		boolean done = false;
		HiddenWord word = new HiddenWord();
		while(!done) {
			String newWord = console.nextLine();
			if(newWord.toLowerCase().equals("quit")) {
				done = true;
			}else {
				System.out.println(word.getHint(newWord));
				if(newWord.equals(word.getWord())) {
					System.out.println("YOU GUESSED THE WORD");
					done = true;
				}
			}
		}
	}
}
