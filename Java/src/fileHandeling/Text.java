package fileHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String f1 = "data/example1.txt";
		FileInputStream fis = new FileInputStream (f1);
		int i = fis.read();
		
		String f2 = "data/example.txt";
		FileOutputStream fos = new FileOutputStream (f2);
		
		
		
		while (i!=-1) {
			byte b = (byte)i;
			fos.write(b);
			
			i = fis.read();
			
		}
		fis.close();
		fos.close();
	}

}