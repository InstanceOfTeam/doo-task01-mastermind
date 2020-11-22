
abstract class Combination {
	
	public static final int LENGTH = 4;
	protected Color[] colors;
	
	protected Combination(String combination) {
		this.colors = new Color[LENGTH];

		for(int i=0; i<LENGTH; i++){
			this.colors[i] = Color.getColorByChar(combination.charAt(i));
		}
	}
	
	@Override
	public String toString() {
		return null;
	}

}
