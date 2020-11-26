import java.util.ArrayList;

class Mastermind {
	private ArrayList<Attempt> attempts = new ArrayList<Attempt>();
	private SecretCombination secretCombination;
	private final int NUM_ATTEMPS = 10;
	
	

	public Mastermind() {
		secretCombination = new SecretCombination();
	}
	
	public void play() {
		this.writeConsole();
		Console console = new Console();

		do {
			attempts.add(new Attempt(secretCombination));
			this.writeConsole();
			for (int i=0; i < attempts.size(); i++) {
				console.write(attempts.get(i).toString());
			}
		} while (attempts.size() <= NUM_ATTEMPS && !attempts.get(attempts.size()-1).isWinner());
		
		if (attempts.get(attempts.size()-1).isWinner()) {
			console.write("You've won!!!");
			} else {
				console.write("You've lost");
		}
	}

	public void writeConsole() {
		Console console = new Console();
		
		console.write(attempts.size() + " attemp(s):");
		console.write(this.secretCombination.toString());	
	}
	
	
	public static void main(String[] args) {	
		do {
			new Mastermind().play();
		} while (new Console().read("Resume? (y/n)").equals("y"));
	}

}
