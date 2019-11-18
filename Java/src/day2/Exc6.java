package day2;

public class Exc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exc6 jebon =new Exc6();
		int repon= jebon.emon(10,20);
		int rakib= jebon.kamal(10,20);
		
		System.out.println(repon+rakib);
		
	}
	
public int emon(int x, int y){
	int z=x+y;
	return z;	
}
public int kamal(int x, int y){
	int p=x*y;
	return p;	
}
}