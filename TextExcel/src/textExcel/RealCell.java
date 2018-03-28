package textExcel;

public class RealCell implements Cell{
	private double value;
	public RealCell(String value) {
		this.value = Double.parseDouble(value);
	}
}
