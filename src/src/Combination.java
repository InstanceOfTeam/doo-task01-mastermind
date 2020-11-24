
abstract class Combination {
	protected final int LENGTH = 4;
	protected Color[] colors;

	protected Combination() {
		this.colors = new Color[LENGTH];
	}

	@Override
	public String toString() {
		String textColors = "";
		for (Color color : this.colors) {
			textColors = textColors.concat(color.toString());
		}
		return textColors;
	}

	public static void main(String[] args) {
		ProposedCombination ps = new ProposedCombination();
		Color[] c = Color.values();

		for (int i = 0; i < ps.colors.length; i++) {
			ps.colors[i] = c[(int) Math.floor(Math.random()*4)];
		}

		System.out.println(ps.toString());
	}
}