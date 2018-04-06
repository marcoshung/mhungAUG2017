//Marcos Hung; per 2
package textExcel;

public class PercentCell extends RealCell{
	private double percent;
	public PercentCell(String value) {
		super(value);
		//turns the returned value into a percent decimal
		percent = super.getValue() / 100.0;
	}
	public String abbreviatedCellText() {
		//converts the percent into an int to truncate other numbers
		int text = (int) (percent * 100);
		String abbreviatedText = text + "%";
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
		return percent + "";
	}
}
