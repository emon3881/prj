package day2;

public class ObjectLevel6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectLevel6 car=new ObjectLevel6();
		int wheel = car.work(100,200);
		System.out.print(wheel);
	}
public int work (int x, int y) {
	int p= x+y;
	return p;
}
	
}
