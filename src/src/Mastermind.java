import java.util.ArrayList;

class Mastermind {
	private ArrayList<Attempt> attempts = new ArrayList<Attempt>();
	private SecretCombination secretCombination;
	private static final int NUM_ATTEMPS = 10;
	

	public Mastermind() {
		secretCombination = new SecretCombination();
	}
	
	public void play() {
		Console console = new Console();
		int nAttemps = 0;
		console.write(nAttemps + " attemp(s):");
		console.write("xxxx");
		do {
			attempts.add(new Attempt(secretCombination));
			console.write(nAttemps + 1  + " attemp(s):");
			console.write("xxxx");
			for (int i=0; i < attempts.size(); i++) {
				console.write(attempts.get(i).toString());
			}
			nAttemps += 1;

		} while (nAttemps <= NUM_ATTEMPS && !attempts.get(nAttemps-1).isWinner());
		
		if (attempts.get(nAttemps-1).isWinner()) {
			console.write("You've won!!!");
			} else {
				console.write("You've lost");
		}
	}

	public static void main(String[] args) {	
		do {
			new Mastermind().play();
		} while (new Console().read("Resume? (y/n)").equals("y"));
	}

}
