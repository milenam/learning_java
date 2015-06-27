
public class Main {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("the value of " + b1);
		System.out.println("the value of " + b2);
		
		boolean b3 = !b1;
		
		System.out.println("the value of " + b1);
		
		int i = 1;
		boolean b4 = (i == 0); 
		System.out.println("the value of " + b4);
		
		String s = "true";
		boolean b5 = Boolean.parseBoolean(s);
		
		System.out.println("the value of " + b5);
		
	}

}
