
abstract class Combination {

	protected final int LENGTH = 4;
	protected Color[] colors;

	protected Combination() {
		this.colors = new Color[LENGTH];
	}

	@Override
	public String toString() {
		String textColors = "";
		
		for (int i=0; i < colors.length; i++) {
			textColors+=colors[i].toString();
		}
		
		return textColors;
	}

}
