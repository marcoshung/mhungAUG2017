package textExcel;

public class PercentCell extends RealCell{
	private double percent;
	public PercentCell(String value) {
		Double num = Double.parseDouble(value.substring(0, value.length() -1 ));
		percent = num / 100.0;
	}
	public String abbreviatedCellText() {
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
		return percent +"";
	}
}
