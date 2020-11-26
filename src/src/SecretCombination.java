
class SecretCombination extends Combination {

		
	private static final int LENGTH = 4;
	

	public SecretCombination() {

		this.colors = new Color[LENGTH];
		var combination = this.generateRandomString();
		
		for(int i=0; i<LENGTH; i++){
			this.colors[i] = Color.getColorByChar(combination.charAt(i));
		}
	}
	
	public Result evalueCombination(ProposedCombination proposedCombination) {
		int blacks = 0;
		int whites = 0;
		
		Color[] proposedColors = proposedCombination.getColors();

		for(int p = 0; p < LENGTH; p++) {
			for(int c = 0; c < LENGTH; c++) {
				if(proposedColors[p].isSameColorAs(this.colors[c])){
					if(p == c)
						blacks ++;
					else
						whites ++;
				}
			}
		}
		
        return new Result(whites, blacks);
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i=0; i<LENGTH; i++)
		{
			result += result + "*";
		}
		return result;
	}

	private String generateRandomString() {

		String result = "";
		String availableColors = Color.getAvailableColors();
	    
	    while(result.length() < LENGTH) {
	    	var randomIndex = randomIndex(availableColors.length());
	    	var electedColor = availableColors.charAt(randomIndex);
	    	result += electedColor;
	        availableColors = availableColors.replaceFirst("" + electedColor, "");
	    }

	    return result;
	}
	
	private int randomIndex(int arrayLenght) {
		return (int)(Math.random() * arrayLenght);
	}

}
