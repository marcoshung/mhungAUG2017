//Marcos Hung; Per 2
package textExcel;
import java.util.*;

public class FormulaCell extends RealCell{
	private String formula;
	private Cell[][] spreadsheet;
	public FormulaCell(String value, Cell[][] spreadsheet) {
		super(value);
		this.formula = super.getFormula();
		this.spreadsheet = spreadsheet;
	}
	
	public String fullCellText() {
		return formula;
	}
	
	public String abbreviatedCellText() {
		String abbreviatedText = getDoubleValue() + "";
		
		//checks to see whether the text is more than 10 characters
		if(abbreviatedText.length() >= 10) {
			abbreviatedText = abbreviatedText.substring(0,10) ;
		}
		//if the text is less than 10 then it will add spaces to it
		while(abbreviatedText.length() != 10) {
			abbreviatedText += " ";
		}
		return abbreviatedText;
	}
	public double getDoubleValue() {
		
		//formula will only equal the numbers of the formula, not the parenthesises.
		String formula = this.formula.substring(2, this.formula.length() - 2);
		String[] parsed = formula.split(" ");
		//total will start off being the first number and be later added to it.
		double total = 0.0;
		//deals with sum and average
		if(parsed[0].toLowerCase().equals("sum") || parsed[0].toLowerCase().equals("avg")) {
			String[] cells = parsed[1].split("-");
			int counter = 0;
			for(int i = cells[0].toLowerCase().charAt(0); i <= cells[1].toLowerCase().charAt(0); i++) {
				for(int j = Integer.parseInt(cells[0].substring(1)); j <= Integer.parseInt(cells[1].substring(1)); j++) {
					String cell = (char) (i) + "" + j;
					SpreadsheetLocation firstLocation = new SpreadsheetLocation(cell);
					total += Double.parseDouble(spreadsheet[firstLocation.getRow()][firstLocation.getCol()].abbreviatedCellText().trim());
					counter++;
				}
			}
			if(parsed[0].toLowerCase().equals("avg")) {
				return total/counter;
			}else {
				return total;
			}
		}
		
		//deals with if the first number is a cell. turns it into a number
		if(parsed[0].charAt(0) >= 'A') {
			SpreadsheetLocation firstLocation = new SpreadsheetLocation(parsed[0]);
			if(spreadsheet[firstLocation.getRow()][firstLocation.getCol()].fullCellText().equals("")){
				total = 0;
			}else {
					total = Double.parseDouble(spreadsheet[firstLocation.getRow()][firstLocation.getCol()].abbreviatedCellText().trim());
			}
		}else {
			total= Double.parseDouble(parsed[0]);
		}
			
		for(int i = 1; i < parsed.length; i++) {
			//num will be the next number
			double num;
			//deals with if there is a cell.
			if(parsed[i + 1].charAt(0) >= 'A') {
				SpreadsheetLocation location = new SpreadsheetLocation(parsed[i + 1]);
				if(spreadsheet[location.getRow()][location.getCol()] instanceof FormulaCell) {
					num = Double.parseDouble(spreadsheet[location.getRow()][location.getCol()].abbreviatedCellText().trim());
				}
				else if(spreadsheet[location.getRow()][location.getCol()].fullCellText().equals("")) {
					num = 0;
				}else {
					num = Double.parseDouble(spreadsheet[location.getRow()][location.getCol()].fullCellText());
				}
			}else {
				num= Double.parseDouble(parsed[i + 1]);
			}
			
			String operator = parsed[i];
			if(operator.equals("+")){
				total += num;
			}else if(operator.equals("-")) {
				total -= num;
			}else if(operator.equals("/")) {
				total /= num;
			}else if(operator.equals("*")){
				total *= num;
			}else {
				throw new IllegalArgumentException("Wrong Format");
			}
			
			//skips the number that it already handled.
			i++;
		}
		return total;
	}
}