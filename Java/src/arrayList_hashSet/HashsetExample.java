package arrayList_hashSet;

import java.util.HashSet;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "hi";
String s1= "where";
String s2 = "are";
String s3 = "you?";

HashSet <String> emon = new HashSet <String> ();

emon.add(s);
emon.add(s1);
emon.add(s2);
emon.add(s3);
emon.remove(s3);

for (String i :emon) {
	System.out.println(i);
}
	}

}
