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
		String sortedWord = "";
		for(int i = 0; i < word.length(); i++) {
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
