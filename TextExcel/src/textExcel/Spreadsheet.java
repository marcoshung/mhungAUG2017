//Marcos Hung; Per 2
package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	//constructor
	Cell[][] cells;
	public Spreadsheet() {
		cells = new Cell[getRows()][getCols()];
	}
	@Override
	public String processCommand(String command){
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int getRows(){
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols(){
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public Cell getCell(Location loc){
		// TODO Auto-generated method stub
		return cells[loc.getCol()][loc.getRow()];

	}

	@Override
	public String getGridText() {
		String grid = "";
		for(int i = 0; i < cells.length; i++) {
			for(int j = 0; j <cells[i].length;i++) {
				if(i == 0) {
					grid += "|" + (char)('A' + j) + "         ";
				}else {
				}
			}
			grid += "\n";
			}
		return grid;
	}

}