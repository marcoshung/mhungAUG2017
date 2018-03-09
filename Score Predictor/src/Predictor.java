import java.util.*;
public class Predictor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean done = false;
		System.out.println("Enter desired test score followed by the class");
		while(!done) {
			String input = scanner.nextLine();
			if(input.equals("quit")) {
				done = true;
			}else {
				System.out.println(produceAnswer(input));
			}
		}
	}
	public static String produceAnswer(String input) {
		String[] seperated = input.split(" ");
		Scores prob = new Scores(seperated[0], Double.parseDouble(seperated[1]));
		return("Prob : " + prob.getNormalProbabilityAtZ());
	}
}
