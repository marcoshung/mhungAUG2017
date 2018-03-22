//Marcos Hung; Per 2
package textExcel;

public class Spreadsheet implements Grid{
	//constructor
	Cell[][] cells;
	public Spreadsheet() {
		cells = new Cell[getRows()][getCols()];
	}
	@Override
	public String processCommand(String command){
		if(command.toUpperCase().equals("CLEAR")) {
			clear();
		}
		if(command.length() == 2) {
			return cellInspect(command.charAt(0),command.charAt(1));
		}
		String text[] = command.split(" ");
		return "";
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
	public String getGridText() {
		String grid = "  ";
		for(int i = 0; i < cells.length; i++) {
			for(int j = 0; j <cells[i].length;i++) {
				if(i == 0) {
					grid += "|" + (char)('A' + j) + "         ";
				}else {
					if(j == 0) {
						if(i < 10) {
							grid += i + " |"+ cells[i][j].abbreviatedCellText();
						}else {
							grid += "|" + cells[i][j].abbreviatedCellText();
						}
					}
				}
			}
			grid += "\n";
			}
		return grid;
	}
	public String cellInspect(char letter, char num) { 
		int col = letter - 'A';
		int row = num;
		return cells[col][row].fullCellText();
	}
	public String clear() {
		for(int i = 0; i < getCols(); i++) {
			for(int j = 0; j < getRows(); i++) {
				cells[i][j] = new EmptyCell();
			}
		}
		return getGridText();
	}
	public String clearCell(Cell c) {
		c = new EmptyCell();
		return getGridText();
	}
}