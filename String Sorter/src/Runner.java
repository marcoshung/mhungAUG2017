import java.util.*;
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
		String sorted = "";
		ArrayList<String> words = new ArrayList<String> (Arrays.asList(word.split(" ")));
		for(int n = 0; n < words.size(); n ++) {
			ArrayList<Character> array = new ArrayList<Character>();
			for(int i = 0; i < words.get(n).length(); i++) {
				array.add(words.get(n).charAt(i));
			}
			sorted += "word "+ (n+1) + " : " + sort(array) + "  \n";
		}
		
		return sorted;
	}
	public static String sort(ArrayList<Character> unsorted) {
		ArrayList<Character> sorted = new ArrayList<Character>();
		for(int i = 0; i < unsorted.size(); i++) {
			char lowest = unsorted.get(i);
			for(int j = i + 1; j < unsorted.size(); j++) {
				if(unsorted.get(j) < lowest) {
					char temp = unsorted.get(i);
					lowest = unsorted.get(j);
					unsorted.set(i, unsorted.get(j));
					unsorted.set(j, temp);
				}
			}
			sorted.add(lowest);
		}
		return(toString(sorted));
	}
	public static String toString(ArrayList<Character> array) {
		String sorted = "";
		String counted = "\n";
		char character = array.get(0);
		int count = 0;
		for(int i = 0; i < array.size(); i++) {
			sorted += array.get(i);
			if(character == array.get(i)) {
				count ++;
			}else {
				counted +=  count + " " + character + "'s;";
				character = array.get(i);
			}
		}
		return (sorted + counted);
	}
}