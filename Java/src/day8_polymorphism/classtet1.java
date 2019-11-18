package day8_polymorphism;

public class classtet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "i am a student";
String [] y= s.split(" ");
int x= y.length;
for (int i=0; i<x; i++) {

	if(y[i].length()<2) {
		System.out.println(y[i]);

	}
}

	}

}
