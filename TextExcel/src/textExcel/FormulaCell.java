package textExcel;

public class FormulaCell extends RealCell{
	private String formula;
	public FormulaCell(String value) {
		super(value);
		this.formula = super.getFormula();
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
		double total = Double.parseDouble(parsed[0]);
		for(int i = 1; i < parsed.length; i++) {
			
			//num will be the next number
			double num = Double.parseDouble(parsed[i + 1]);
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