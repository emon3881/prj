package day9;

public class ClassTestAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find out the number of occurrence
		//of characters 'd'is giving String. 
		//lets for String "Today is Sunny day" 
		
java.lang.String s ="Today is Sunny day";
int counter = 0;
for (int i= 0; i<s.length(); i++) {
	if (s.charAt(i)=='d') {
		counter ++;
	}
}
System.out.println(counter);
	}
}
