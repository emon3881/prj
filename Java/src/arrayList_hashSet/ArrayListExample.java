package arrayList_hashSet;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList <String>();
		
		list.add ("I");
		list.add("am");
		list.add("Home");
		list.add ("Now");
		  
		list.remove("Now");
		
	for (String i : list) {
		System.out.println(i);
	}
	}

}
