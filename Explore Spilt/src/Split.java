import java.util.Arrays;

//Marcos Hung, Period 2
public class Split {
	public static void main(String[] args) {
		// Your task Part 0
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		
//			it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
//			it will split at the word "really" and return an array of ["I "," like "," red apples!"]
		//play around with String.split! 
		//What happens if you "I reallyreally likeapples".split("really") ?
		System.out.println(Arrays.toString("applespineapplesbreadlettustomatobaconmayohambreadcheese".split("bread"))); 
		System.out.println(Arrays.toString("apple bread tom bread let l bread q".split("bread")));
		System.out.println(getFilling("bread ham bread"));
	}
	public static String getFilling(String sandwich) {
		String[] array = sandwich.split("bread");
		int breaks = array.length;
		String filling = "";
		if(breaks == 3) {
			filling += array[1];
		}else if(breaks == 1 || breaks == 0 || breaks == 2) {
			filling = "not a sandwich";
		}else if(breaks > 3) {
			if(breaks % 2 == 0) {
				
			}
		}
		return filling;
		
		//Your task Part 1:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		* What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
	}

		//Your task Part 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		* Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
}
