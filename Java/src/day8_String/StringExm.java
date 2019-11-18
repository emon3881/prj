
package day8_String;

import day2.A;

public class StringExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringExm a =new StringExm();
		boolean c= a.eq("Hi", "Hello");
		
		System.out.println(c);
	}
	public boolean eq(String x, String y) {
		boolean b;
		b=x.contentEquals(y);
		
		
		return b;

	}

}
