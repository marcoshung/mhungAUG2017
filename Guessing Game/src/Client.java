//Marcos Hung
//This project will be able to calculate simple statistic problems
import java.util.*;
public class Client {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to the Guessing Game!!! \nGuess the hidden word by entering in words you think it is!"
				+ "\n KEY:\n* = Letter not in word\n+ = Letter in word, but in a different spot\n- = extra letters\n/ = missing letters"
				+ "\n Enter PLAY to begin");
		String response = "";
		boolean done = true;
		if(console.nextLine().toLowerCase().equals("play")) {
			done = false;
			System.out.println("Would you like to play RANDOM mode or NORMAL mode?");
			response = console.nextLine();
		}
		HiddenWord word = new HiddenWord(response);
		while(!done) {
			System.out.println("Enter a guess");
			String newWord = console.nextLine();
			if(newWord.toLowerCase().equals("quit")) {
				done = true;
			}else {
				System.out.println(word.getHint(newWord.toLowerCase()));
				if(newWord.equals(word.getWord())) {
					System.out.println("YOU GUESSED THE WORD!!!");
					done = true;
				}
			}
		}
		System.out.println("See you next time!");
	}
}
