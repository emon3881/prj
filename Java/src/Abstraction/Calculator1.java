package Abstraction;

 class Calculator1 extends Calculater {

	 int addition (int a, int b) {
		int z= a+b;
		return z;
	}
public static void main(String[]args) {
	Calculator1 a= new Calculator1 ();
	int t= a.addition(10,20);
	System.out.println(t);
}
}
