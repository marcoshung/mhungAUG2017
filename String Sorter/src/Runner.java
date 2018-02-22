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
		ArrayList<String> array = new ArrayList<>(Arrays.asList(sentence.split(" ")));
		String sorted = "";
		for(int i = 0; i < array.size(); i++) {
			sorted += sort(array.get(i)) + " ";
		}
		return sorted;
	}
	public static String sort(String word) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] newWord = new char[word.length()];
		if(word.length() == 1) {
			return word.substring(0);
		}else if(word.length() <= 0) {
			return "";
		}
		newWord[0] = word.charAt(0);
		for(int i = 1; i < word.length();i++) {
			if(alphabet.indexOf(word.charAt(i)) < alphabet.indexOf(word.charAt(i-1))) {
				for(int j = 0; i< word.substring(0,i).length(); i++) {
					if(alphabet.indexOf(word.charAt(i -j)) < alphabet.indexOf(word.charAt(i-(j+1)))) {
						newWord[i-1] = word.charAt(i);
						newWord[i] = word.charAt(i-1);
					}else {
						j = word.substring(0,i).length();
					} 
				}
			}else {
				newWord[i] = word.charAt(i);
			}
		}
		return(toString(newWord));
	}
	public static String toString(char[] array) {
		String newWord = "";
		for(int i = 0; i<array.length; i++) {
			newWord += array[i];
		}
		return newWord;
	}
}
