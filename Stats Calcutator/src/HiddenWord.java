import java.util.*;
public class HiddenWord {
	private String word;
	private String[] wordList = {"hidden" , "word" , "test" };
	public HiddenWord() {
		this.word = wordList[(int) (Math.random() * wordList.length)];
	}
	public String getHint(String guess) {
		int correctCount = 0; int wrongCount = 0; int missingCount = 0; int extraCount = 0;
		String hint = "";
		int limit = 0;
		if(guess.length() >= word.length()) {
			limit = word.length();
		}else {
			limit = guess.length();
		}
		for(int i = 0; i < limit; i ++) {
			if(word.charAt(i) == guess.charAt(i)) {
				hint += word.charAt(i);
			}else if(word.indexOf(guess.charAt(i)) != -1) {
				hint += '+';
				correctCount++;
			}else {
				hint+= '*';
				wrongCount++;
			}
		}
		if(guess.length() < word.length()) {
			for(int i = 0; i < (word.length() - guess.length()); i++) {
				hint += "/";
				missingCount++;
			}
		}else if(guess.length() > word.length()){
			for(int i = 0; i <(guess.length() - limit); i++) {
				hint +='-';
				extraCount++;
			}
		}
		if(correctCount > 0 || wrongCount > 0 || missingCount > 0 || extraCount >0) {
			hint += "\n";
			if(correctCount > 0) {
				hint += "You had " + correctCount +" letters in the wrong space!\n";
			}
			if(wrongCount > 0) {
				hint += "You had " + wrongCount + " letters that are in the word :(\n";
			}
			if(missingCount > 0) {
				hint += "Your guess was " + missingCount + " letters too short\n";
			}
			if(extraCount > 0) {
				hint += "Your guess was " + extraCount + " letters too long\n";
			}
		}
		return hint;
	}
	public String getWord() {
		return this.word;
	}
}
