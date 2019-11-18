package day8_polymorphism;

public class Classtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "This is a Book";
String[] y =s.split(" ");
int x=y.length;
 for (int i=0; i<x; i++) {
	 
	
if(y[i].length()>2) {
	for(int j=y[i].length ()-1;j>=0; j--) {
		System.out.print(y[i].charAt(j));
	}
	//System.out.println (y[i]);
}
System.out.println();
 }
	}
}
