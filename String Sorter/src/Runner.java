import java.util.*;
import java.util.Arrays;
public class Runner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		boolean done = false;
		while(!done) {
			String sentence = input.nextLine();
			if(sentence.equals("quit")) {
				done = true;
			}else {
				System.out.println(produceAnswer(sentence));
			}
		}
	}
	public static String produceAnswer(String sentence) {
		String[] array = sentence.split(" ");
		String sorted = "";
		for(int i = 0; i < array.length; i++) {
			sorted += sort(array[i]) + " ";
		}
		return sorted;
	}
	public static String sort(String word) {
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String sortedWord = "";
		for(int i = 0; i < word.length();i++) {
			for(int j = 0; j < alphabet.length; i++) {
				String letter = alphabet[i];
				if(word.charAt(i) == (alphabet[j].charAt(0))) {
					alphabet[i] +=letter;
					j = alphabet.length;
				}
			}
		}
		for(int i = 0; i < alphabet.length; i++) {
			for(int j = 1; j < alphabet[j].length(); j ++) {
				sortedWord += alphabet[i].charAt(j);
			}
		}
		return sortedWord;
	}
}
