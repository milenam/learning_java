
public class Main {

	public static void main(String[] args) {
	   String s1 = "Welcome to Clifornia";
	   String s2 = new String("Welcome to Clifornia");
	   System.out.println(s2);
	   
	   // or equals()
	   if (s1.equalsIgnoreCase(s2)) {
		   System.out.println("match"); 
	   } else {
		   System.out.println("do not match");
	   }
	   
	   
	   char[] chars = s1.toCharArray();
	   for (char c : chars) {
		   System.out.println(c);
	   }
	}

}
