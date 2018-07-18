import java.util.ArrayList;
import java.util.Arrays;

public class List {
	private int counter = 0;
	private ArrayList<DataPoint> DataPoints;
	private ArrayList<Double> yList = new ArrayList<Double>();
	private ArrayList<Double> xList = new ArrayList<Double>();
	
	private ArrayList<DataPoint> testDataPoints ;
	private ArrayList<Double> testyList = new ArrayList<Double>();
	private ArrayList<Double> testxList = new ArrayList<Double>();
	
	public List() {
		 DataPoints = new ArrayList<DataPoint>();
	}
	
	public void addPoint(DataPoint point) {
		DataPoints.add(point);
		xList.add(point.getX());
		yList.add(point.getY());
		counter++;
	}
	
	public String calculate() {	
		return round2(getA()) +"x + " + round2(getB());
	}
	public static double calcSum(ArrayList<Double> point) {
		double total = 0;
		for(double num : point) {
			total += num;
		}
		return total;
	}
	
	public static double calcSum(ArrayList<Double> listOne, ArrayList<Double> listTwo) {
		double total = 0;
		for(int i = 0; i < listOne.size(); i++) {
			total += listOne.get(i) * listTwo.get(i);
		}
		return total;
	}
	
	public static double round2(double operand) {
		if(operand >0) {
			double newOperand = operand*100 + .5;
			int num = (int) (newOperand);
			return ((double) (num))/100;
		}else {
			double newOperand = operand*100 - .5;
			int num = (int) (newOperand);
			return ((double) (num))/100;
		}
		
	}
	
	public double getA() {
		return (((counter*(calcSum(xList,yList))) - (calcSum(xList)*(calcSum(yList))))) / ((counter*(calcSum(xList,xList))) - (Math.pow(calcSum(xList), 2)));
		
	}
	
	public double getB() {
		return (((counter*(calcSum(xList,yList))) - (calcSum(xList)*(calcSum(yList))))) / ((counter*(calcSum(xList,xList))) - (Math.pow(calcSum(xList), 2)));
	}
	
	public ArrayList<DataPoint> getDataPoints(){
		return DataPoints;
	}
	
	public void undo() {
		DataPoints.remove(DataPoints.size() - 1);
	}
	public void useTestData() {
		
	}
}
