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
		String startValue = "HEY";
		String newValue = "HI";
		String a = startValue;
		String b = a;
		a = newValue;
		System.out.println(a + " " + b);
		
	}
	public static void changeMe(int x,String str, int[] arr) {
		x =2;
		str = "no";
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
	}
}
