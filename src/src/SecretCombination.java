
class SecretCombination extends Combination {

	public SecretCombination() {
		super(generateRandomString());
	}
	
	public Result evalueCombination(ProposedCombination proposedCombination) {
		int blacks = 0;
		int whites = 0;

		for(int p = 0; p < LENGTH; p++) {
			for(int c = 0; c < LENGTH; c++) {
				if(proposedCombination.colors[p].isSameColorAs(this.colors[c])){
					if(p == c)
						blacks ++;
					else
						whites ++;
				}
			}
		}

        return new Result(blacks, whites);
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

	private static String generateRandomString() {

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
	
	private static int randomIndex(int arrayLenght) {
		return (int)(Math.random() * arrayLenght);
	}

}
