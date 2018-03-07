import java.util.*;
public abstract class Scores {
	private double[] scores;
	private double[] APESScores = {4.0/4, 4.0/4, 3.0/4, 2.0/4, 4.0/4, 2.0/4, 0.0/4, 1.0/4};
	private double ZScore = 0;
	private double mean = 0;
	private double stddev = 0;
	public Scores(String name, double percent) {
		
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
	public void calcZScore(double newScore) {
		ZScore = (newScore - mean)/calcSTDDEV();
	}
	public double getNormalProbabilityAtZ() {
	    return Math.exp(-Math.pow(ZScore, 2) / 2) / Math.sqrt(2 * Math.PI);
	}
}
