package da222;

public class Summ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int i =123895524;
		int sum =0;
		while (i!=0) {
			sum = sum+i%10;
			i= i/10;
			
			
		}
	System.out.println(sum);	
	}

}
