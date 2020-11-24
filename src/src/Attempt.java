
class Attempt {
	private ProposedCombination proposedCombination;
	private Result result;

	public Attempt(SecretCombination secretCombination) {
		this.proposedCombination = new ProposedCombination();
		this.result = secretCombination.evalueCombination(this.proposedCombination);
	}

	public boolean isWinner() {
		if (this.result.getBlacks() == 4) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.proposedCombination.toString();
	}
}