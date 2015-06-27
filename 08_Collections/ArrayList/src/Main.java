import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// reg Array
		
		int[] a1 = new int[3];
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		int a2[] = new int[3];
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
		
		int[] a3 = {3,6,7};
		for (int i = 0; i < a3.length; i++) {
			System.out.println(a3[i]);
		}
		
		System.out.println(a3[0]);
		
		// Array List
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Cali");
		list.add("Or");
		list.add("Ws");
		
		System.out.println(list);
		
		list.add("Alaska");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		String state = list.get(1);
		System.out.println(state);
		
		int pos = list.indexOf("Alaska");
		System.out.println(pos);
	}

}
