package caseyfinal;
import java.util.*;

public class map {
//Why use maps? They have a unique key that can be searched. There are 2 maps here that have the same data, but both are searchable by their keys. One by an integer and the other by a string.
	public static Map<String, Integer> searchbytown = new HashMap<String, Integer>();
	public static Map<Integer, String> searchbyzip = new HashMap<Integer, String>();
	public static void map() {
		buildmaps();
}
	
	public static void buildmaps() {
		searchbytown.put("Rexburg", 83440);
		searchbytown.put("Hillsboro", 97123);
		System.out.println("What zipcode is Rexburg? " + searchbytown.get("Rexburg"));
		System.out.println("What zipcode is Hillsboro? " + searchbytown.get("Hillsboro"));
		searchbyzip.put(83440, "Rexburg");
		searchbyzip.put(83440, "Sugar City");
		//Notice that both Rexburg and Sugar city are using the same zipcode, the latest one will be written into that key, as the key is unique
		searchbyzip.put(12345, "Sugar City");
		searchbyzip.put(97123, "Hillsboro");
		System.out.println("What city is in 83440? " + searchbyzip.get(83440));
		//Notice that values do not need to be unique, but the keys need to be
		System.out.println("What city is in 12345? " + searchbyzip.get(12345));
	}
}
