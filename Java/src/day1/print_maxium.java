package day1;

public class print_maxium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int a []= {1,2,3,4,5};
		 int i;
		 int max = a[0];
		 
		 for (i=0; i<a.length; i++) {
			 
			 if (a[i]>max)
				 max=a[i];			 
				 
		 }
		
		 System.out.println(max);

	}

}
