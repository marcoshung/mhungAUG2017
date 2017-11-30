
public class DrumKitTestDrive {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		d.playSnare();
		d.playSnare = false;
		d.playTopHat();
		if(d.playSnare == true) {
			d.playSnare();
		}
	}
}
