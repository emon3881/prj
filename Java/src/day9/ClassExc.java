package day9;

public class ClassExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find out the total value of each of the digits
		//in a number.
int i= 1238;
int sum = 0;
while(i!=0) {
	sum=sum+i%10;
	i= i/10;
}
System.out.println(sum);
	}

}
