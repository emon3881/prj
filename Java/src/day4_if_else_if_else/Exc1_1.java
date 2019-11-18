package day4_if_else_if_else;

public class Exc1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exc1_1 p= new Exc1_1();
		boolean q= p.greatNumber(7,7);  
	System.out.println(q);
	}
public boolean greatNumber(int a, int b) {
	boolean r =true;
	if (a==7||b==7) {
		r= true;	
	}
	else if (a+b==7) {
		r=true;
	}
	return r;
}
}



























