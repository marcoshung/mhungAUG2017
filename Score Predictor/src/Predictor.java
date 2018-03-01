import java.util.*;
public class Predictor {
	double[] APESScores = {4.0/4, 4.0/4, 3.0/4, 2.0/4, 4.0/4, 2.0/4, 0.0/4, 1.0/4};
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
	public double convertString(String input) {
		return Double.parseDouble(input);
	}
	public String produceAnswer(String input) {
		String[] seperated = input.split(" ");

	//	if(seperated.equals("APES")) {
			Scores prob = new APESScore(APESScores, convertString(seperated[0]));
		//
		return("Prob : " + prob.getNormalProbabilityAtZ());
	}
	
}
