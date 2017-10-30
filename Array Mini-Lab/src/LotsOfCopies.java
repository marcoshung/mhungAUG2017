import java.util.Arrays;
//Marcos Hung; Period 2
public class LotsOfCopies {
	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1,2,3,4,5};
		LotsOfCopies.changeMe(num,strMain,arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
		int[] startValue = {1,2,3};
		int[] newValue = {4,5,6};
		int[] a = startValue;
		int[] b =a;
		a = newValue;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}
	public static void changeMe(int x,String str, int[] arr) {
		x =2;
		str = "no";
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
	}
}
