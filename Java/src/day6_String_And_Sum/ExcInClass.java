package day6_String_And_Sum;

public class ExcInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]x= {11,10,22,15,19,20,25,36,35 };
		int sum=0;
		int l=x.length;
		for(int i=0; i<=l-1; i++) {
			if(x[i]%5==0){
				
			sum=sum+x[i];

	}

	}
		System.out.println(sum);
		
		}

}
