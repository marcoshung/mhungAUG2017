//Marcos Hung; Period 2
import java.util.Arrays;
public class ArrayLab3 {
	public static void main(String[] args) {
		int[] a1 = new int[8];
		int[] a2 = new int[a1.length];
		for(int i = 0;i<a1.length;i++) {
			a1[i] = 5 + 5*i;
			a2[i] = 7 + 7*i;
		}
		int sumArr[] = sum(a1,a2);
		int appendNum = 200;
		int[] appendArr = append(a1,appendNum);
		int removeIdx = 5;
		int[] removeArr = remove(a2,removeIdx);
		int sumOfEvens = sumEven(appendArr);
		ArrayLab3.rotateRight(a1);
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
		
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length];
		for(int i = 0; i <arr1.length; i++) {
			newArr[i] = arr1[i] + arr2[i];
		}
		return newArr;
	}
	public static int[] append(int[] arr, int num) {
		int[] newArr = new int[arr.length +1];
		for(int i = 0; i< arr.length;i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length-1] = num;
		return newArr;
	}
	public static int[] remove(int[] arr, int idx) {
		int[] newArr = new int[arr.length -1];
		for(int i = 0; i < newArr.length;i++) {
			if(i >= idx) {
				newArr[i] =arr[i+1];
			}else {
				newArr[i] = arr[i];
			}
		}
		return newArr;
	}
	public static int sumEven(int[] arr) {
		int evenSum = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				evenSum += arr[i];
			}
		}
		return evenSum;
	}
	public static void rotateRight(int[] arr) {
		int temp = arr[0];
		for(int i = 0; i <arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
	}
}
