package da222;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Selenium";
		int len =s.length(); //8
		String rev = "";
		
		for(int i = len-1; i>=0;i--) {
			rev=rev+s.charAt(i);
		//	System.out.println(rev);
		}
		System.out.println(rev);
	}
	

}
