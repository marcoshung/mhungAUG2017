//Marcos Hung; Per 2
public class Fraction{
	private int numerator;
	private int denominator;
	private int sign;
	public Fraction(String num) {
		int breakPoint = 0;
		int[] array = new int[2];
		String whole ="";
		String denominator = "";
		String numerator = "";
		//traverses the number for underscores and backslashes to get numbers accordingly 
		for(int i = 0;i < num.length(); i ++) {
	  		if(num.charAt(i) == '_') {
	  			whole = num.substring(0, i);
	 			breakPoint = i;
	   		}
	  		if(num.charAt(i) == '/') {
	    		numerator += num.substring(breakPoint + 1,i);
	    		denominator += num.substring(i +1,num.length());
	   		}
	   	}
		//checks to see if there is an underscore, if not then if there isn't a backslash it is a whole num, and if there is a backslash it's a fraction
		if(num.indexOf("_") == -1 && num.length() != 0) {
			if(num.indexOf("/") == -1) {	   			
			whole = num.substring(0,num.length());
	   		numerator = "0";
	    	denominator ="1";
	    }else {
			whole = "0";
			numerator =num.substring(0, num.indexOf("/"));
	 		denominator =num.substring(num.indexOf("/") + 1,num.length());	  			}
		}
		if(Integer.parseInt(whole) < 0 || Integer.parseInt(numerator) < 0) {
		  	this.sign = -1;
		}else {
			this.sign = 1;
		}
		//checks to see if whole num is negative, if it is then the numerator will be subtracted to get more negative
		if(this.sign == 1 || whole.equals("0")) {
			this.numerator = Integer.parseInt(whole) * Integer.parseInt(denominator) + Integer.parseInt(numerator);
		 }else {
			 this.numerator = Integer.parseInt(whole) * Integer.parseInt(denominator) - Integer.parseInt(numerator);
	    }
	  	this.denominator = Integer.parseInt(denominator);
	}
	
}