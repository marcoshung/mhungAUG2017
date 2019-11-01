import java.util.Arrays;

public class CountingSort {
	
	public static void main(String[] args) {
		int[] array = {5,2,5,1,2,7,8,4,8,2,0,3,9,2};
		int[] sortedArray = sort(array);
		printSorted(sortedArray);
		convertToCumulative(sortedArray);
		System.out.println("\n" + Arrays.toString(sortedArray));
	}
	
	public static int[] sort(int[] elements) {
		int max = findMax(elements);
		int[] sortedArray = new int[max + 1];
		initializeArray(sortedArray);
		for(int num : elements) {
			sortedArray[num]++;
		}
		return sortedArray;
	}
	
	public static int findMax(int[] elements) {
		int max = elements[0];
		for(int num : elements) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
	
	public static void initializeArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
	}
	
	public static void printSorted(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void convertToCumulative(int[] array) {
		for(int i = 1; i < array.length; i++) {
			array[i] += array[i-1];
		}
	}
	
	
}
