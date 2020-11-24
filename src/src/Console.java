import java.util.Scanner;

public class Console {
	
	Scanner reader = new Scanner(System.in);
	
	public void write(String promptMessage) {
		System.out.println(promptMessage);
	}
	
	public String read(String promptMessage) {
		System.out.print(promptMessage);
		return reader.next();
	}

}
