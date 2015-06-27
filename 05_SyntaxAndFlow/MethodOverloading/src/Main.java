
public class Main {

	public static void main(String[] args) {
       int value1 = 5;
       int value2 = 10;
       int value3 = 7;
       
       int result = addValues(value1, value2);
       System.out.println(result);
       int results = addValues(value1, value2, value3);
       System.out.println(results);
       
       String string1 = "17";
       String string2 = "12";
       int result2 = addValues(string1, string2);
       System.out.println(result2);
	}
	
	private static int addValues(int int1, int int2) {
		return int1 + int2;
	}
	
	private static int addValues(int int1, int int2, int int3) {
		return int1 + int2 + int3;
	}
	
	private static int addValues(String val1, String val2) {
		int value1 = Integer.parseInt(val1);
		int value2 = Integer.parseInt(val2);
		return value1 + value2;
	}


}
