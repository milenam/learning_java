public class Main {
	public static void main(String[] args) {
		System.out.println("Hello from the command line!");
	}

	for (int i = 0; i < args.length; i++) {
		System.out.println(args[i]);
	}
}


// java Main arg1 arg2 --> passing arguments in command line 
// javac Main.java -verbose --- this commant shows what went wrong in the compiler
// java -Xms256s HelloWorld // initial heap size
// java -Xms256m HelloWorld // maximum heap size
// java -Xms256n HelloWorld // heap size for young generation objects (objects that just been created)