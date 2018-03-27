package textExcel;

public class TextCell implements Cell{
	private String text;
	public TextCell(String text) {
		this.text = text.substring(1, text.length()-1);
	}
	public String fullCellText() {
		return ("\"" + text + "\"");
	}
	public String abbreviatedCellText() {
		String abbreviatedText = this.text;
		if(abbreviatedText.length() >= 10) {
			return abbreviatedText.substring(0,10);
		}
		//if the text is less than 10 then it will add spaces to it
		while(abbreviatedText.length() != 10) {
			abbreviatedText += " ";
		}
		return abbreviatedText;
	}
}
