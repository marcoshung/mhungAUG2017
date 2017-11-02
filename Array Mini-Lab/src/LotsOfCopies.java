import java.util.Arrays;
//Marcos Hung; Period 2
public class LotsOfCopies {
	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1,2,3,4,5};
		changeMe(num,strMain,arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
		
	}
	public static void changeMe(int x,String str, int[] arr) {
		x =2;
		str = "no";
		arr[0] = 10;
		int num2 = 2;
		num2 = x;
		x = 9;
		System.out.println(x + " " + num2);
		
		String no = "no";
		no = str;
		str = "maybe";
		System.out.println(str + " " + no);
		int[] newValue = arr;
		arr[0]= 20;
		System.out.println(Arrays.toString(newValue));
		System.out.println(Arrays.toString(arr));
	}
}
