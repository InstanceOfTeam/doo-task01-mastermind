
public enum Color {
	
	RED('r'),
	GREEN('g'),
	BLUE('b'),
	YELLOW('y'),
	ORANGE('o'),
	PINK('p');
	
	private final char colorLetter;

	private Color(char colorLetter) {
		this.colorLetter = colorLetter;
	}

	public static String getAvailableColors() {
		
		String availableColors = "";
		
		for (Color color: Color.values()) {
			availableColors+= color.toString();
		}
		
		return availableColors;
	}
	
	public static Color getColorByChar(char colorLetter) {
		
		String textColor = String.valueOf(colorLetter);
		
		for (Color color: Color.values()) {
			
			String  currentTextColor= color.toString();
			if (currentTextColor.equals(textColor)) {
				return color;
			}
		}
		
		return null;
		
	}
	
	public boolean isSameColorAs(Color color) {
		return this == color;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.colorLetter);
	}

}
