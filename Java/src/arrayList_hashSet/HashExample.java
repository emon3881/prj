package arrayList_hashSet;

import java.util.HashSet;

public class HashExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet <String> list = new HashSet <String>();
list.add("Hi");
list.add("we");
list.add("are");
list.add("Home");
list.add("now");
list.remove("now");
for (String i : list) {
	System.out.println(i);
}


	}

}
