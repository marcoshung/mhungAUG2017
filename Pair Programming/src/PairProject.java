//Marcos Hung, period 2
import java.util.*;
//Takes user input and prints : all even numbers, sum, min, max, and largest even number
public class PairProject {
		public static void main(String [] args) {
			Scanner userInput = new Scanner(System.in);
			int max = 0;
			int min = 0;
			int sum = 0;
			int largestEven = 0;
			String Even = "";
			int count = 0;
			System.out.println("How many numbers will you enter?");
			int quantity = userInput.nextInt();
			System.out.println("enter your numbers");
			 while(count < quantity){
				int num = userInput.nextInt();
				if(sum == 0) {
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
				count++;
			}
			System.out.println("These are all the even numbers entered: " + Even);
			System.out.println("The smallest number is " + min);
			System.out.println("The largest number is " + max);
			System.out.println("The largest Even number is " +largestEven);
			System.out.println("The sum is " + sum);
	}
		
}
