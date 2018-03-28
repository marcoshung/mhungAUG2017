package textExcel;

public class ValueCell extends RealCell{
	private double value;
	public ValueCell(String value) {
		this.value = Double.parseDouble(value);
	}
	public String fullCellText() {
		return value + "";
	}
	public String abbreviatedCellText() {
		String abbreviatedText = "";
		abbreviatedText += value;
		if(abbreviatedText.length() >= 10) {
			abbreviatedText = abbreviatedText.substring(0,10) ;
		}
		//if the text is less than 10 then it will add spaces to it
		while(abbreviatedText.length() != 10) {
			abbreviatedText += " ";
		}
		return abbreviatedText;
	}
}
