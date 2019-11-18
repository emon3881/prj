package day5_Array_And_String;

public class String1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
String s= new String ("we are doing Java");
System.out.println(s);

int l= s.length();
System.out.println(l);

char d= s.charAt(3);
System.out.println(d);

String t = s.substring(3);
System.out.println(t);

String t1 = s.substring(3,12);
System.out.println(t1);

char t2= s.charAt(3);
boolean f2= t=="a";
System.out.println(t2);


	}

}
