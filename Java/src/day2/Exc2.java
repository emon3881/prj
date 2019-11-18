package day2;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b=5;
		int c = 20;
		int d = 15;
		Exc2 jebon =new Exc2();
		int repon= jebon.emon(a,b)+jebon.emon(c, d);
		System.out.print(repon);
		
	}
public int emon(int x , int y) {
	int z=x-y;
	return z;
	
}
}
