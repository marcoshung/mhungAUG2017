import java.util.*;
public class Calculate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an equation");
		boolean done = false;
		while(!done) {
			String equation = input.nextLine();
			if(equation.equals("quit")) {
				done = true;
			}
			System.out.println(produceAnswer(equation));
		}
	}
	public static String produceAnswer(String equation) {
		ArrayList<String> store = new ArrayList<String>(Arrays.asList(equation.split(" ")));
		
	}
}
