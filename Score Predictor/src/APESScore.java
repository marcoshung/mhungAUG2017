import java.util.*;
public class APESScore extends Scores{
	public APESScore(double[] scores,double newScore) {
		super(scores);
		super.calcZScore(newScore);
	}
}
