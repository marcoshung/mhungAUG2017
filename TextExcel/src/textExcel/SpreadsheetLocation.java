//Marcos Hung; Per 2
package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location{
	private char letter;
	private String number;
    public int getRow(){
        // TODO Auto-generated method stub
        return Integer.parseInt(number) - 1;
    }

    @Override
    public int getCol() {
        // TODO Auto-generated method stub
        return (Character.toLowerCase(letter) - 'a');
    }
    //constructor
    public SpreadsheetLocation(String input){
    	letter = input.charAt(0);
    	number = input.substring(1, input.length());
    }

}
