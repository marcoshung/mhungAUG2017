//Marcos Hung; Period 2
package fracCalc;
import java.util.*;
public class Fraction{
	private int numerator;
	private int denominator;
	private int sign;
	private int whole;
	private int[] storeNum = new int[2];
	//Constructor
	public Fraction(String num) {
    	int breakPoint = 0;
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
    	}else {
    	//traverses the number for underscores and backslashes to get numbers accordingly 
    		for(int i = 0;i < num.length(); i ++) {
    			if(num.charAt(i) == '_') {
    				this.whole = Integer.parseInt(num.substring(0, i));
    				breakPoint = i;
    			}
    			if(num.charAt(i) == '/') {
    				this.numerator = Integer.parseInt(num.substring(breakPoint + 1,i));
    				this.denominator = Integer.parseInt(num.substring(i + 1,num.length()));
    			}
    		}
    	}
  		//checks to see if whole num is negative, if it is then the numerator will be subtracted to get more negative
       	if(this.whole > 0) {
       		storeNum[0] = this.whole * this.denominator + this.numerator;
        }else if(this.whole == 0){
       		storeNum[0] = this.numerator;
       	}else {
       		storeNum[0] = this.whole * this.denominator - this.numerator;
       	}
       	storeNum[1] = this.denominator;
   	}
    	//checks to see if whole num is negative, if it is then the numerator will be subtracted to get more negative
	
	
	public String toString() {
		return("whole:" + this.whole + " numerator:" + this.numerator+ " denominator:" + this.denominator);
	}
	
	public int[] getInfo(){
		return storeNum;
	}
	
    public static String add(int[] num1, int[] num2,String operator) {
    	//if minus sign will multiple second term by -1 and add.
    	if(operator.equals("-")) {
    		num2[0] *= -1;
    	}
    	if(num1[1] != num2[1]) {
    		int temp = num1[1];
    		num1[1] *= num2[1];
    		num1[0] *= num2[1];
    		num2[0] *= temp;
    		num1[0] += num2[0];
    	}else {
    		num1[0] += num2[0];
    	}
    	return(reduce(num1[0],num1[1]));
    }
    
    public static String multiply(int[] num1, int[] num2, String operator) {
    	if(operator.equals("*")) {
    		num1[0] *= num2[0];
    		num1[1] *= num2[1];
    	}else {
    		//multiplies by reciprical
    		num1[0] *= num2[1];
    		num1[1] *= num2[0];
    	}
    	return(reduce(num1[0],num1[1]));
    }
    
    //reduces answer into simplest form
    public static String reduce(int numerator, int denominator) {
    	int factor = 0;
    	int whole = 0;
    	if(numerator == 0) {
    		return 0 +"";
    	}else if(numerator>=denominator) {
    		factor = denominator;
			while(denominator % factor !=0 || numerator % factor != 0){
				factor--;
			}
		}else {
			factor = numerator;
			while(denominator % factor != 0 || numerator % factor != 0){
				factor--;
			}
		}
    	denominator /= factor;
    	numerator /= factor;
    	whole = numerator / denominator;
    	if(denominator == 1) {
    		return numerator +"";
    	}else if(whole != 0) {
    		return whole + "_" + (numerator - denominator * whole) + "/" + denominator;
    	}else {
    		return numerator + "/" + denominator;
    	}
    }
}