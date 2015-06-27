import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchWithInts {

	public static void main(String[] args) {
      String input = getInput("Enter a number betweeen 1 and 12:");
      int month = Integer.parseInt(input);
      
      switch (month) {
	  case 1:
		System.out.println("month is january");
		break;
	  case 2:
			System.out.println("month is feb");
			break;
	  case 3:
			System.out.println("month is march");
			break;

	  default:
		break;
	  }
	}
	
	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}

}
