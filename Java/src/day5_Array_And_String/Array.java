
package day5_Array_And_String;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []x;
x=new int[6];
x[0]=10;
x[1]=20;
x[2]=30;
x[3]=40;
x[4]=50;
x[5]=60;

int l=x.length;

for(int i=0; i<=l; i=i+3) {
	System.out.println(x[i]);
}
	}

}
