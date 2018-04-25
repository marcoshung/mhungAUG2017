import java.util.*;
import java.util.Arrays;
public class Runner {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a string");
		boolean done = false;
		while(!done) {
			String input = console.nextLine();
			if(input.equals("quit")) {
				done = true;
			}else {
				System.out.println(produceAnswer(input));
			}
		}
	}
	public static String produceAnswer(String word) {
		ArrayList<Character> array = new ArrayList<>();
		for(int i = 0; i < word.length(); i++) {
			array.add(word.charAt(i));
		}
		return sort(array);
	}
	public static String sort(ArrayList<Character> unsortedWord) {
		ArrayList <Character> sortedWord = new ArrayList<Character>();
		int sortLimit = unsortedWord.size();
		ArrayList<Character> sorted = new ArrayList<Character>();
		for(int i = 0; i < unsortedWord.size(); i++) {
			char temp = unsortedWord.get(i);
			for(int j = i + 1; j < unsortedWord.size(); j++) {
				if(unsortedWord.get(j) < temp) {
					temp = unsortedWord.get(j);
				}
			}
			sortedWord.add(temp);
		}
		return(toString(sortedWord));
	}
	public static String toString(ArrayList<Character> array) {
		String sorted = "";
		for(int i = 0; i < array.size(); i ++) {
			sorted += array.get(i);
		}
		return sorted;
	}
}
