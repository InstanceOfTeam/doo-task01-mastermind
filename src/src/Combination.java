
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
}