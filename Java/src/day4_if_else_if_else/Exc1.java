package day4_if_else_if_else;
public class Exc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exc1 p =new Exc1();
		boolean c= p.greatNumber(7, 1);
		System.out.println(c);
		boolean d= p.greatNumber(3, 4);
		System.out.println(d);
		boolean e= p.greatNumber(13, 6);
		System.out.println(e);
		boolean f= p.greatNumber(5, 1);
		System.out.println(f);
		
	}
	public boolean greatNumber (int a, int b) {
		if ((a==7)|| (a+b==7)||(a-b==7)) {
			return true;
			
		}
		else { 
			return false;
					
	}}
	}
