package Abstraction;

 class Exc3 implements Exc2 {
	public int addition (int a, int b) {
			int z= a+b;
			return z;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Exc3 a= new Exc3 ();
int t= a.addition(10, 20);
System.out.println(t);
	}

}
