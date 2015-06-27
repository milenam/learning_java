import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
       HashMap<String, String> map = new HashMap<String, String>();
       
       map.put("CA", "Sacramento");
       map.put("OR", "Salem");
       map.put("WA", "Olympia");
       
       System.out.println(map);
       
       map.put("Al", "Juneau");
       System.out.println(map);
       
       String cap = map.get("OR");
       System.out.println(cap);
       
       map.remove("CA");
       System.out.println(map);
	}

}
