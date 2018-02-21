//Marcos Hung;Per 2
public abstract class ThreeDShape {
	private double volume;
	private double surfaceArea;

	public ThreeDShape(){
		this.volume = calcVolume();
		this.surfaceArea = calcSA();
	}
	
	// Can you write this code for this class or does it need to be overridden by every subclass?
	public abstract double calcVolume();

	// Can you write this code for this class or does it need to be overridden by every subclass?
	public abstract double calcSA();
	//round method
	public static double round(double operand) {
		if(operand >0) {
			double newOperand = operand*10 + .5;
			int num = (int) (newOperand);
			return ((double) (num))/10;
		}else {
			double newOperand = operand*10 - .5;
			int num = (int) (newOperand);
			return ((double) (num))/10;
		}			
	}
}
