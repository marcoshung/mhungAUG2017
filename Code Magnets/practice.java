package dna;
import java.util.*;
public class practice {
	public static boolean hasSum(int[] list, int total) {
		//more efficent
		HashSet<Integer> sortedSet = new HashSet<Integer>();
		for(int num : list) {
			if(sortedSet.contains((total - num))){
				return true;
			}else {
				sortedSet.add(num);
			}
		}
		return false;
		
		
		//inefficent
		/*for(int i = 0; i < list.length; i++) {
			for(int j = i; j < list.length; j++) {
				if(list[i] + list[j] == total) {
					return true;
				}
			}
		}
		return false;
		*/
	}
	
	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,56,6,7,8,8,9};
		
		System.out.println(hasSum(list, 11));
		System.out.println(isPalindrome("aaabbbjjbbbaaa"));
		System.out.println(isPalindrome("jklahdjk"));
	}
	
	public static boolean isPalindrome(String word) {
		if(word.length() <= 1) {
			return true;
		}else if(word.charAt(0) == word.charAt(word.length()-1)) {
			return isPalindrome(word.substring(1, word.length()-1));
		}else {
			return false;
		}
	}
}
