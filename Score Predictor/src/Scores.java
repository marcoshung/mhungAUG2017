import java.util.*;
public abstract class Scores {
	double[] scores;
	private double ZScore;
	private double mean;
	private double stddev;
	public Scores(double[] arr) {
		scores =arr;
		for(double score : arr) {
			mean += score;
		}
		mean /= arr.length;
	}
	public double calcSTDDEV() {
		double sum = 0;
		for(Double score : scores) {
			sum += Math.pow(score - mean,2);
		}
		return Math.sqrt(sum/scores.length);
	}
	public double calcZScore(double newScore) {
		return (newScore - mean)/stddev;
	}
	public double getNormalProbabilityAtZ() {
	    return Math.exp(-Math.pow(ZScore, 2) / 2) / Math.sqrt(2 * Math.PI);
	}
}
