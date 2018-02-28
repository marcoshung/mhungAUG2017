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
	public double calcSTDDEV() {
		double sum = 0;
		for(Double score : scores) {
			sum += Math.pow(score - mean,2);
		}
		return Math.sqrt(sum/scores.size());
	}
	public double calcZScore(double newScore) {
		return (newScore - mean)/stddev;
	}
}
