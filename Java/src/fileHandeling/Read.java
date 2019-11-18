package fileHandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		String file = "Data/name.txt";
		FileReader fr = new FileReader (file);
		int i = fr.read ();
		while (i!=-1) {
			char c = (char)i;
			
			System.out.print(c);
			i = fr.read();
		}
		fr.close();
		
		
	}

}
