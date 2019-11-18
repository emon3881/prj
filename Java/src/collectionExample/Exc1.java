package collectionExample;

import java.util.HashSet;

public class Exc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String a = ("We");
//String b = ("Are");
//String c = ("Doing Java");

HashSet <String> emon = new HashSet <String> ();
emon.add("We");
emon.add("Are");
emon.add("Doing Java");

for (String s : emon) {
	 System.out.println(s + "is the string concatenation operator");
}

	}

}
