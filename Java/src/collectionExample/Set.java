package collectionExample;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet <String> set= new HashSet <String>();
		
	set.add("A");
	set.add("B");
	set.add("C");
	set.add("D");
		
	for (String i : set){
		System.out.println(i);
	}
	}
}

