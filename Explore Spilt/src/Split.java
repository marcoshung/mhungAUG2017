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
		/*System.out.println(Arrays.toString("applespineapplesbreadlettustomatobaconmayohambreadcheese".split("bread"))); 
		System.out.println(Arrays.toString("apple bread ham bread apple bread".split(" ")));
		System.out.println(getFilling("ham"));
		System.out.println(getFilling("bread"));
		System.out.println(getFilling("applebreadhambreadapplebread"));
		System.out.println(getFilling("breadbread"));
		System.out.println(getFilling("applebreadhamcheesebread"));
		System.out.println(getFilling("ham"));
		*/
		System.out.println(getFillingSpaces("bread"));
		System.out.println(getFillingSpaces("apple bread ham bread apple bread"));
		System.out.println(getFillingSpaces("bread bread"));
		System.out.println(getFillingSpaces("bread ham bread"));
		System.out.println(getFillingSpaces("apple bread ham cheese bread"));
	}
	//Your task Part 1:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		* What if it's a fancy sandwich with multiple pieces of bread?
		*/
	public static String getFilling(String sandwich) {
		String[] array = sandwich.split("bread");
		String filling = "";
		if(sandwich.indexOf("bread") == -1 || array.length < 2) {
			filling = "not a sandwich";
		}
		if(sandwich.indexOf("bread") == 0) {
			for(int i = 0; i <array.length; i++){
				filling += array[i];
			}
		}else {
			for(int i = 1; i <array.length; i++) {
				filling += array[i];
			}
		}
		if(filling.equals("")) {
			filling = "nothing";
		}
		
		return filling;
	}
	//Your task Part 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		* Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
	public static String getFillingSpaces(String sandwich) {
		String filling = "";
		String[] array = sandwich.split(" ");
		int count = 0;
		int i = 0;
		while(i < array.length) {
			if(array[i].equals("bread") || array[i].equals(" bread")) {
				count++;
			}
			i++;
		}
		System.out.println(count);
		if(count ==0 || count == 1) {
			filling = "not a sandwich";
		}else if(count == 2 && array.length == 2){
			filling = "nothing inside sandwich";
		}else if(array[0] != "bread"){
			int limit = 0;
			for(i = 1;i< array.length; i++) {
				if(array[i] != "bread") {
					limit ++;
					if(limit == count) {
						i = array.length;
					}
				}else {
					filling += array[i];
				}
			}
		}else {
			int limit = 0;
			for(i = 0;i< array.length; i++) {
				if(array[i] != "bread") {
					limit ++;
					if(limit == count) {
						i = array.length;
					}
				}else {
					filling += array[i];
				}
			}
		}
		return filling;
	}	
}