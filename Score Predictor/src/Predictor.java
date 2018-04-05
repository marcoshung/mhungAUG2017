import java.util.*;
public class Predictor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
		System.out.println("Enter class followed by the desired Test Percent");
		//will keep running until quit is entered
		while(!done) {
			String input = scanner.nextLine();
			if(input.equals("quit")) {
				done = true;
			}else {
				System.out.println(produceAnswer(input));
			}
			System.out.println("Enter another class to continue or type quit");
		}
	}
	public static String produceAnswer(String input) {
		//seperates the inputed class and score
		String[] seperated = input.split(" ");
		if(seperated.length != 2) {
			return "Wrong Format : Try Again";
		}
		double newScore = Double.parseDouble(seperated[1]);
		String subject = seperated[0].toLowerCase();
		if(newScore > 0) {
			newScore /= 100;
		}
		Scores prob = new Scores(subject, newScore);
		return("Prob : " + prob.toString());
	}
}
