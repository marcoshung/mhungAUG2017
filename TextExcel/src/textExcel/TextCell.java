//Marcos Hung; Per 2
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
		//if text is greater than or equal to 10 it will return substring (0,10)
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
