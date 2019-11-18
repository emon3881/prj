package arrayList_hashSet;

import java.util.ArrayList;

public class Arraylist_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Hi";
		String s1= "i am";
		String s2 = "out side";
		String s3 = "now";
				
		
ArrayList<String> emon = new ArrayList <String> ();
emon.add (s);
emon.add(s1);
emon.add(s2);
emon.add(s3);
emon.add(s);

emon.remove(s);

for (String i : emon) {
	System.out.println(i);
}




	}

}
