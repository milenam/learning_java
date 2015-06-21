
public class Main {

	public static void main(String[] args) {
		doSomething();
		
		loopMe();
	}

	private static void loopMe() {
		int top = 10;
		for (int i = 0; i < top; i++) {
			System.out.println("the valuse is" + i);
		}
	}
	
	private static void doSomething() {
		System.out.println("this method has been called");
	}

}
