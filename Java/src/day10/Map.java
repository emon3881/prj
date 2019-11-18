package day10;

import java.util.HashMap;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <String,Integer> hm = new HashMap <String,Integer>();

hm.put("a", new Integer ("100"));
hm.put("b", new Integer ("200"));  // put
hm.put("c", new Integer ("300"));	//remove
hm.put("b", new Integer ("1000"));  // always letest value


hm.remove("a");

Set<String> k  = hm.keySet();
for (String s : k) {
	
	int t = hm.get(s); 
	System.out.println(t);
}

	}

}
