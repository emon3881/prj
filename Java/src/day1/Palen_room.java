package day1;

public class Palen_room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 212;
		int r=0;
		int n=i;
		int p =0;
		
		while (n!=0) {
			r=n%10;
			p=p*10+r;
			
			n=n/10;
			
		}
		
		if (i==p) { System.out.println("Yes it is");
			}
		
		else {System.out.println("No it is Not");
			
		}

	}	 
		
		
	}


