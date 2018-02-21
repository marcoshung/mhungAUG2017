//Marcos Hung;Per 2
public class Sphere extends ThreeDShape{
	private double radius;
	public Sphere(double radius) {
		this.radius = radius;
	}
	public double calcVolume() {
		return round((4.0/3) * Math.PI * (radius * radius * radius));
	}
	public double calcSA() {
		return round(4 * Math.PI * (radius * radius));
	}
}
	