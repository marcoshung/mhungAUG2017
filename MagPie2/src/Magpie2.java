
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("Ms.Dreyer") >=0) {
			response = "She seems like she knows what she's doing";
		} else if (statement.indexOf("Mr.Dreyer") >=0
				|| statement.indexOf("Mr.Lamont") >=0
				|| statement.indexOf("Mr.Knox") >=0
				|| statement.indexOf("Mr.Cancilla") >=0
				|| statement.indexOf("Mr.Millstein")>=0) {
			response = "Wow he seems like a good teacher";
		} else if(statement.indexOf("die") >=0){
			response = "That horrible!";
		} else if(statement.indexOf("tired")>=0) {
			response = "You should get some rest then.";
		}else if(statement.trim().equals("")) {
			response = "Did you fall asleep again?";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if(whichResponse == 4) {
			response = "You're so awesome";
		} else if(whichResponse == 5) {
			response = "Are you having fun though?";
		}
		return response;
	}
}
