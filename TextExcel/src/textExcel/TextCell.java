package textExcel;

public class TextCell implements Cell{
	private String text;
	public String fullCellText() {
		return "\"" + text + "\"";
	}
	public String abbreviatedCellText() {
		String text ="";
		if(text.length() <= 10) {
			text += text.substring(0,text.length());
			for(int i = 0; i < 10 - text.length(); i++) {
				text += " ";
			}
		}else {
			return text.substring(0,10);
		}
		return text;
	}
}
