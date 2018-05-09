import java.util.*;
public class HiddenWord {
	private String word;
	private String[] wordList = {"hidden" , "word" , "test" , "brought", "across" ,"half",
"from"
"place"
"example"
"without"
"complete"
"government"
"village"
"front"
"brother"
"middle"
"new"
"thing"
"group"
"face"
"knew"
"drive"
"result"
"kitchen
"great
"trouble
"book
"sentence
"often
"real
"since
"solve
"century
"roll
"stand
"uncle
"much
"mean
"city
"almost
"usually
"metal
"everything
"until
"during
"early
"hurry
"slowly
"earth
"problem
"notice
"either
"appear
"brought
"heard
"hair
"better
"money
"island
"ground
"figure
"months
"paragraph
"reason
"lion
"instead
"birthday
"voice
"machine
"certain
"dry
"raised
"represent
"special
"winter
"aunt
"street
"cried
"stood
"easy
"become
"whether
"equation
"surprise
"clothes
"million
"dinner
"center
"system
"used
"however
"clear
"root
"different
"guess
"pair
",daddy
",another
",square
",wind
",space
,"instruments
,"thousands
,"floor
,"order
,"air
,"well
,"need
,"perhaps
,"covered
,"several
,"members
,"describe
,"letter
,"behind
,"child
,"back
,"change
,"sometimes
,"himself
,"toward
,"weather
,"simple
,"move
,"soldier
,"heavy
,"going
,"point
,"mountain
,"main
,"object
,"cells
,"paint
,"poor
,"story
,"hour
,"that
,"page
,"leave
,"rule
,"among
,"cause
,"exercise
,"word
,"believe
,"fair
,"just
,"study
,"music
,"common
,"explain
,"developed
,"difference
,"beautiful
,"lady
,"gold
,"help
,"high
,"being
,"anything
,"happened
,"distance
,"probably
,"even
,"whole
,"woman
,"day
,"food
,"questions
,"measure
,"remember
,"power
,"material
,"quiet
,"board
,"alphabet
,"home
,"travel
,"area
,"known
,"finally
,"include
,"country
,"straight
,"listen
,"heart
,"alive
,"wood
,"white
,"correct
,"general
,"surface
,"written
,"year
,"told
,"mind
,"gray
,"check
,"force
,"inches
,"decided
,"length
,"interest
,"busy
,"between
,"below
,"stand
,"built
,"understand
,"quickly
,"contain
,"sign
,"record
,"important
,"care
,"neighbor
,"matter
,"matter
,"suddenly
,"course
,"pattern
,"finished
,"discovered
,"later
,"weigh
,"should
,"few
,"might
,"direction
,"energy
,"subject
,"wild
,"beside
,"touch
,"ago
,"each
,"while
,"close
,"sea
,"region
,"return
,"produce
,"nothing
,"young
,"field
,"sound
,"along
,"next
,"took
,"language
,"shape
,"carefully
,"scientists};
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
