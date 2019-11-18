package day8_String;

public class Exc {

	
		int x;
		int y;
		
	public Exc (int i, int j) {
		x= i;
		y=j;
	}
	
public void swipe () {
	x=x+y;
	y=x-y;
	x=x-y;
}
public static void main (String[]args) {
	Exc a = new Exc(10,20);
	a.swipe();
	System.out.println(a.x);
	System.out.println(a.y);
}
	}



