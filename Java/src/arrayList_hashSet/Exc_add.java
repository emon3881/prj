package arrayList_hashSet;

import java.util.ArrayList;

public class Exc_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "Hasan";
String s2 = "Santo";
String s3 = "Robin";
String s4 = "Donald";

ArrayList<String> list = new ArrayList <String>();

list.add(s1);
list.add(s2);
list.add(s3);
list.add(s4);
list.add(s1);



list.remove(s1);


for (String i : list) {
	
	System.out.println(i);
	
	
	
	
}


	}

}
