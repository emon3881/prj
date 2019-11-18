package day1;

public class Palen_Room_With_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given = "MADAM";
		String result ="";
		
		for (int i= given.length()-1; i>=0;i--) {
			result = result + given.charAt(i);
		
		}
		
		if (given.equals(result)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
	}
	


