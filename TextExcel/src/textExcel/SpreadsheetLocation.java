//Marcos Hung; Per 2
package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location{
	private String input;
    @Override
    public int getRow(){
        // TODO Auto-generated method stub
        return 20;
    }

    @Override
    public int getCol() {
        // TODO Auto-generated method stub
        return 12;
    }
    //constructor
    public SpreadsheetLocation(String cellName)
    {
       this.input = cellName;
    }

}
