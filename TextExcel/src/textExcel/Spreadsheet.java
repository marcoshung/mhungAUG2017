//Marcos Hung; Per 2
package textExcel;

public class Spreadsheet implements Grid{
	//constructor
	Cell[][] cells;
	public Spreadsheet() {
		cells = new Cell[getRows()][getCols()];
		for(int i = 0; i < getRows(); i++) {
			for(int j = 0; j < getCols(); j++) {
				cells[i][j] = new EmptyCell();
			}
		}
	}
	
	@Override
	public String processCommand(String command){
		if(command.equals("")) {
			return "";
		}
		//will clear entire grid, if the command only contains clear
		if(command.toUpperCase().equals("CLEAR")) {
			return clear();
		}
		//this will split the command, if there is nothing else
		String[] text = command.split(" ");
		
		//will return the cell value of if there is only one input
		if(text.length == 1) {
			SpreadsheetLocation location = new SpreadsheetLocation(command);
			return cells[location.getRow()][location.getCol()].fullCellText();
		}
		
		//clears a specific cell, assuming that the cell is directly after clear
		if(text[0].toUpperCase().equals("CLEAR")){
			SpreadsheetLocation location = new SpreadsheetLocation(text[1]);
			cells[location.getRow()][location.getCol()] = new EmptyCell();
			return getGridText();
			
		//will run assignment of Cells, assuming first text is cell, and third is text.
		}else if(command.indexOf("=") != -1) {
			SpreadsheetLocation location = new SpreadsheetLocation(text[0]);
			if(text[2].indexOf("\"") != -1) {
				cells[location.getRow()][location.getCol()] = new TextCell(text[2]);	
			}
			return getGridText();
		}else {
			return "";
		}
		
	}

	@Override
	public int getRows(){
		return 20;
	}

	@Override
	public int getCols(){
		return 12;
	}
	
	@Override
	public Cell getCell(Location loc){
		return cells[loc.getCol()][loc.getRow()];
	}

	@Override
	//Will return entire Grid, with contents
	public String getGridText() {
		String grid = "  ";
		for(int i = 0; i < cells[i].length;i++) {
			grid += "|" + (char)('A' + i) + "         ";
		}
		grid += "\n";
		for(int i = 0; i < cells.length; i++) {
			for(int j = 0; j < cells[i].length;j++) {
				if(j == 0){
					if(i < 9) {
						grid += i + 1 + " |"+ cells[i][j].abbreviatedCellText();
					}else {
						grid += i + 1 + "|" + cells[i][j].abbreviatedCellText();
					}
				}else {
					grid += "|" + cells[i][j].abbreviatedCellText();
				}
			}
			grid += "\n";
		}
		return grid;
		}
	
	//clears entire grid
	public String clear() {
		for(int i = 0; i < getRows(); i++) {
			for(int j = 0; j < getCols(); j++) {
				cells[i][j] = new EmptyCell();
			}
		}
		return getGridText();
	}
}