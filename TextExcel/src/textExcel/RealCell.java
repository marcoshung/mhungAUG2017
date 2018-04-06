package textExcel;
public class RealCell implements Cell{
	private double value;
	private String formula = "";
	public RealCell(String value) {
		//checks to see whether or not the input has a % sign and if it does, it parses the input only up to the %
		if(value.indexOf("%") != -1) {
			this.value = Double.parseDouble(value.substring(0, value.length() -1 ));
		}else if(value.indexOf("(") != -1 && value.indexOf(")") != -1){
			this.formula = value;
		}else {
			this.value = Double.parseDouble(value);
		}
	}
	public String abbreviatedCellText() {
		String abbreviatedText = this.value + "";

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
	public String fullCellText() {
		//will return an int value if value does not have a decimal value and is greater 0
		if(value % 1 == 0 && (value > 0)) {
			return (int) (value) + "";
		}
		return value + "";
	}
	public double getValue() {
		return this.value;
	}
	public String getFormula() {
		return this.formula;
	}
}
