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
	public static String sort(ArrayList<Character> unsorted) {
		
		return(toString(sorted));
	}
	public static String toString(ArrayList<Character> array) {
		String sorted = "";
		for(int i = 0; i < array.size(); i ++) {
			sorted += array.get(i);
		}
		return sorted;
	}
}
