import java.util.*;
public abstract class Scores {
	ArrayList<Double> scores = new ArrayList<Double>();
	private double ZScore;
	private double mean;
	private double stddev;
	public Scores(ArrayList<Double> arr) {
		scores =arr;
		for(Double score : arr) {
			mean += score;
		}
		mean /= arr.size();
	}
	public double calcZScore(double newScore) {
		
	}
}
