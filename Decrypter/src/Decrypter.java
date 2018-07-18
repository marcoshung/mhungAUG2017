import java.util.*;
public class Decrypter {
	static String password = "ew";
	static int count = 0;
	static ArrayList<String> tries = new ArrayList<String>();
	
	public static void main(String[] args) {
		String hack = "";
		boolean done = false;
		while(!done) {
			for(int i = 0; i < password.length(); i++) {
				hack+= (char) (Math.random()*128);
			}
			if(tries.indexOf(hack) == -1) {
				if(hack.equals(password)) {
					done = true;
					System.out.println(hack + " " + count);
				}else {
					tries.add(hack);
				}
			}
			count++;
			hack = "";
			
		}
	}
}
