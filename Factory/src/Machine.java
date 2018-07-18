
public abstract class Machine {
	String serialNum = "";
	public Machine() {
		setSerialNum();
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum() {
		for(int i = 0; i < 9; i++) {
			serialNum += (int) (10 *Math.random());
		}
	}
}
