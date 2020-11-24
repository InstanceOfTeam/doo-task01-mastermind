import java.util.HashSet;
import java.util.Set;

class ProposedCombination extends Combination {

	public ProposedCombination(){
        this.colors = new Color[LENGTH];
    }

    public void read() {
        String proposedString;
		do {
			proposedString=new Console().read("Propose a combination: ");
        }while(!this.isValid(proposedString));
		CreateCombination(proposedString);
    }

    private void CreateCombination(String combinationString){
        for (int i=0;i<LENGTH;i++) {
			this.colors[i]=Color.getColorByChar(combinationString.charAt(i));
		}
    }
    
    private boolean isValid(String proposedString){
        Console console=new Console();
        if(!isValidLength(proposedString)){
            console.write("Wrong proposed combination length\n");
            return false;
        }

        if(!this.isValidColor(proposedString)) {
			console.write("Wrong colors they must be: " + Color.getAvailableColors()+"\n");
			return false;
        }

        if(this.isRepeatedColor(proposedString)) {
			console.write("Wrong proposed, can not repeat color.\n");
			return false;
		}
        return true;
    }

    private boolean isValidLength(String proposedString) {
		return proposedString.length()==this.LENGTH;
    }

    private boolean isValidColor(String proposedString) {

        String[] proposedArray = proposedString.split("");
        for (String item : proposedArray) {
            if(!Color.getAvailableColors().contains(item)){
                return false;
            }
        }
		return true;
    }

    private boolean isRepeatedColor(String proposedString) {

        return hasDuplicateColor(proposedString);
    }

    private boolean hasDuplicateColor(String proposedString) {
        Set<Character> chars = new HashSet<Character>();
        for (char c : proposedString.toCharArray()) {
            if (!chars.add(c)) return true;
        }
        return false;
    }

    public static void main( String[] args ){
        ProposedCombination proposedCombination=new ProposedCombination();
        proposedCombination.read();
        new Console().write("proposedCombination: "+proposedCombination.toString()+"\n");
    }
}
