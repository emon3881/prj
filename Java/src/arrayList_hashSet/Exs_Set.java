package arrayList_hashSet;

import java.util.HashSet;

public class Exs_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hasan";
		String s2 = "Santo";
		String s3 = "Robin";
		String s4 = "Donald";
		
		HashSet <String> set = new HashSet <String>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s1);
		
		
		
		//set.remove(s1);

		
		for (String i : set) {
			
			System.out.println(i);
	}

	}}
