package caseyfinal;

import java.util.HashMap;
public class controller {

	public static HashMap<Integer, appinterface> map = new HashMap <Integer, appinterface>();
	
	public controller() {
		
	}
	
	public static String handleRequest(int request, String firstname, String lastname, String gender) {
		map.put(1, new firstname());
		map.put(2, new lastname());
		map.put(3, new gender());
		String profile = firstname + " " + lastname + " " + gender;
		return profile;
	}
}
