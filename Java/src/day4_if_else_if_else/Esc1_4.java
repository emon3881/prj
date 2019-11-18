package day4_if_else_if_else;

public class Esc1_4 {

	public static void main(String[] args) {
		Esc1_4 r =new Esc1_4() ;
		boolean z=r.greatNumber(7, 1);
		System.out.println(z);
		boolean x=r.greatNumber(3, 4);
		System.out.println(x);
		boolean y=r.greatNumber(13, 6);
		System.out.println(y);
		boolean s=r.greatNumber(1, 5);
		System.out.println(s);
			
		
	}
	
	
 public boolean greatNumber(int a, int b) {
	 if ((a==7||b==7)||(a+b==7)||(a-b==7)){
		return true; 
	 }
	 else {
		 return false;
	 }
 }
 
	 }

