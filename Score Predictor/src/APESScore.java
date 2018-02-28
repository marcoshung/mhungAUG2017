import java.util.*;
public class APESScore extends Scores{
	double desiredScore;
	public APESScore(double[] scores,double newScore) {
		super(scores);
		super.calcZScore(newScore);
	}
}
