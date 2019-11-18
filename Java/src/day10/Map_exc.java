package day10;

import java.util.HashMap;
import java.util.Set;

public class Map_exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<String, Integer> a = new HashMap< String, Integer>();
	a.put ("HI",new Integer ("100") );
	a.put("Hello",new  Integer ("200"));
	a.put("Love", new Integer ("300"));
	
	
	Set <String> k = a.keySet();
	for (String s: k) {
		int t= a.get(s);
		System.out.println(t);
		
	}
	
	
	
	
	}

}
