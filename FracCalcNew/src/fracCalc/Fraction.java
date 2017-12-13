//Marcos Hung; Period 2
package fracCalc;
import java.util.*;
public class Fraction{
	private int numerator;
	private int denominator;
	private int sign;
	private int whole;
	private int[] storeNum = new int[2];
	public Fraction(String num) {
    	int breakPoint = 0;
    	//traverses the number for underscores and backslashes to get numbers accordingly 
    	for(int i = 0;i < num.length(); i ++) {
    		if(num.charAt(i) == '_') {
    			this.whole = Integer.parseInt(num.substring(0, i));
    			breakPoint = i;
    		}
    		if(num.charAt(i) == '/') {
    			this.numerator = Integer.parseInt(num.substring(breakPoint + 1,i));
    			this.denominator = Integer.parseInt(num.substring(i +1,num.length()));
    		}
    	}
    	//checks to see if there is an underscore, if not then if there isn't a backslash it is a whole num, and if there is a backslash it's a fraction
    	if(num.indexOf("_") == -1 && num.length() != 0) {
    		if(num.indexOf("/") == -1) {
    			this.whole = Integer.parseInt(num.substring(0,num.length()));
    			this.numerator = 0;
    			this.denominator =1;
    		}else {
   				this.whole = 0;
   				this.numerator =Integer.parseInt(num.substring(0, num.indexOf("/")));
   				this.denominator =Integer.parseInt(num.substring(num.indexOf("/") + 1,num.length()));
   			}
    	}
    	//checks to see if whole num is negative, if it is then the numerator will be subtracted to get more negative
    }
	public String toString() {
		return("whole:" + whole + " numerator:" + numerator+ " denominator:" + denominator);
	}
}