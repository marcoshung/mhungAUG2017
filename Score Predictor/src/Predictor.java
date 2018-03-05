import java.util.*;
public class Predictor {
	static double[] APESScores = {4.0/4, 4.0/4, 3.0/4, 2.0/4, 4.0/4, 2.0/4, 0.0/4, 1.0/4};
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
		Scores prob;
		if(seperated.equals("APES")) {
			prob = new APESScore(APESScores, Double.parseDouble(seperated[0]));
		}else if(seperated.equals("Econ")) {
		
		}else {
			throw new IllegalArgumentException("Enter in a valid class");
		}
		return("Prob : " + prob.getNormalProbabilityAtZ());
	}
}
