package day5_Array_And_String;

public class PractricInClass {
	//write a method and check the elements of an array is exist
	// one argument int
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		met(7);
		met(4);
	}

public static void met (int o) {
	boolean b = false;
	int []x = {2,5,7,74,80};
	int l = x.length;
	
	for (int i = 0; i<=l-1; i++) {
		if (x[i]==o) {
			System.out.println("exist");
			b=true;
			break;
		}
}
	if(b==false) {
		System.out.println("Not Exist");
		
	}
	}	
}


