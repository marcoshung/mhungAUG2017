//Marcos Hung; Per 2
package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location{
	private String input;
	private char letter = input.charAt(0);
	private String number = input.subString(1, input.length());
    public int getRow(){
        // TODO Auto-generated method stub
        return 19;
    }

    @Override
    public int getCol() {
        // TODO Auto-generated method stub
        return 11;
    }
    //constructor
    public SpreadsheetLocation(String cellName)
    {
       this.input = cellName;
    }

}
