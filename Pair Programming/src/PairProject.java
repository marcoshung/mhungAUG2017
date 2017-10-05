//Marcos Hung, period 2
import java.util.Scanner;
public class PairProject {
		public static void main(String [] args) {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter a number");
			int max = 0;
			int min = 0;
			int sum = 0;
			int largestEven = 0;
			String Even = "";
			boolean done = false;
			int num = userInput.nextInt();
			while(!done) {
				System.out.println("Are we finished? If so enter done.");
				if(sum ==0) {
					min = num;
					max = num;
				}
				sum += num;
				if(num % 2 == 0){
					Even += num +" ";
					if(num > largestEven) {
						largestEven = num;
					}
				}
				if(num > max) {
					max = num;
				}
				if(num < min) {
					min = num;
				}
				String completed = userInput.next();
				if(completed.equals("done")) {
					done = true;
				}
			}
			System.out.println(Even);
			System.out.println("The smallest number is " + min);
			System.out.println("The largest number is " + max);
			System.out.println(largestEven);
			System.out.println(sum);
	}
}
