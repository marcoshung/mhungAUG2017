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
		if(this.text.length() <= 10) {
			for(int i = 0; i < 10 - this.text.length(); i++) {
				this.text += " ";
			}
		}else {
			return this.text.substring(0,10);
		}
		return this.text;
	}
}
