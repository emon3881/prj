package day4_if_else_if_else;

public class ConditionMultipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= -10;
		int y= -10;
		int l= 420;
		
		if (x>y & x<l){
			System.out.print("x is bigger");
		}
		else if (y>x) {
			System.out.print("y is bigger");
		}
		else if (x==y) {
			System.out.print("EQUAL");
		}
			}
}