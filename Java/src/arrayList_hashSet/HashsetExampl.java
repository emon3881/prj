package arrayList_hashSet;

import java.util.HashSet;

public class HashsetExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet <String> adil = new HashSet <String>();
	
adil.add ("we");
adil.add("are");
adil.add("doing");
adil.add("Shopping");
adil.add("now");


adil.remove ("now");

for (String i : adil) {
	
	System.out.println(i);
}




	}

}
