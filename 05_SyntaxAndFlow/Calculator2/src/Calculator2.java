import java.io.*;

public class Calculator2 {

	public static void main(String[] args) {
		String s1 = getInput("Enter a numeric value: ");
		String s2 = getInput("Enter a numeric value: ");
		String op = getInput("Enter 1=Add, 2=Subst, 3=Mult, 4=Div ");
		
		int opInt = Integer.parseInt(op);
		double result = 0;
		
		switch (opInt) {
		case 1:
			result = addValues(s1, s2);
			break;
        case 2:
        	result = substrValues(s1, s2);
			break;
	   
        case 3:
        	result = multValues(s1, s2);
			break;
		
        case 4:
        	result = divValues(s1, s2);
			break;

		default:
			System.out.println("wrong value");
			return;
		}

		double result2 = addValues(s1, s2);
		
		System.out.println("The answer is " + result2);
	}

	private static double divValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 / d2;
		return result;
	}

	private static double multValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 * d2;
		return result;
	}

	private static double substrValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 - d2;
		return result;
	}

	private static double addValues(String s1, String s2)
			throws NumberFormatException {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 + d2;
		return result;
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
