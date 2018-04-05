import java.util.*;
public class Scores {
	private double[] scores;
	private double[] GovScores = {4.0/4, 4.0/4, 3.0/4, 2.0/4, 4.0/4, 2.0/4, 0.0/4, 1.0/4, 1.0/4, 1.0/4, 0.0/4};
	private double ZScore = 0;
	private double mean = 0;
	public Scores(String name, double percent) {
		if(name.equals("gov") || name.equals("government")) {
			scores = this.GovScores;
		}
		for(Double num : scores) {
			mean += num;
		}
		mean /= scores.length;
		calcZScore(percent);
	}
	public double calcSTDDEV() {
		double sum = 0;
		for(Double score : scores) {
			sum += Math.pow(score - mean,2);
		}
		return Math.sqrt(sum/scores.length);
	}
	public void calcZScore(double newScore) {
		ZScore = (newScore - mean)/calcSTDDEV();
	}
	public double getNormalProbabilityAtZ(double ZScore) {
	    return Math.exp(-Math.pow(ZScore, 2) / 2) / Math.sqrt(2 * Math.PI);
	}
	public String toString() {
		double prob = getNormalProbabilityAtZ(this.ZScore);
		for(double i = this.ZScore; i < 10; i += .01) {
			prob += Math.abs(getNormalProbabilityAtZ(i) - getNormalProbabilityAtZ(i +.01));
		}
		String percent = "" + prob * 100;
		return percent.substring(0,6) + "%";
	}
}
