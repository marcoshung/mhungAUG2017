//Marcos 8Hung; Per 2
package textExcel;
import java.util.*;

public class FormulaCell extends RealCell{
	private String formula;
	public int test;
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
		
		if(parsed[0].toLowerCase().equals("sum") || parsed[0].toLowerCase().equals("avg")) {
			parsed[1].split("-");
		}
		//total will start off being the first number and be later added to it.
		
		double total;
		if(parsed[0].charAt(0) >= 'a') {
			SpreadsheetLocation firstLocation = new SpreadsheetLocation(parsed[0]);
			if(spreadsheet[firstLocation.getRow()][firstLocation.getCol()].fullCellText().equals("")){
				total = 0;
			}else {
					total = Double.parseDouble(spreadsheet[firstLocation.getRow()][firstLocation.getCol()].fullCellText());
			}
		}else {
			total= Double.parseDouble(parsed[0]);
		}
			
		for(int i = 1; i < parsed.length; i++) {
			
			//num will be the next number
			double num;
			if(parsed[i + 1].charAt(0) >= 'a') {
				SpreadsheetLocation location = new SpreadsheetLocation(parsed[i + 1]);
				if(spreadsheet[location.getRow()][location.getCol()].fullCellText().equals("")) {
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