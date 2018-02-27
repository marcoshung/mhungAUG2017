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
<<<<<<< HEAD
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
=======
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] newWord = new char[word.length()];
		if(word.length() == 1) {
			return word.substring(0);
		}else if(word.length() <= 0) {
			return "";
>>>>>>> branch 'master' of https://github.com/marcoshung/mhungAUG2017
		}
<<<<<<< HEAD
		for(int i = 0; i < alphabet.length; i++) {
			for(int j = 1; j < alphabet[j].length(); j ++) {
				sortedWord += alphabet[i].charAt(j);
			}
		}
		return sortedWord;
=======
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
>>>>>>> branch 'master' of https://github.com/marcoshung/mhungAUG2017
	}
}
