package textExcel;

public class TextCell implements Cell{
	private String text;
	public String fullCellText() {
		return "\"" + text + "\"";
	}
	public String abbreviatedCellText() {
		return text.substring(0,10);
	}
}
