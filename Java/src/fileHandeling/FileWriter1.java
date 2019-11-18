package fileHandeling;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String file = "Data/name.txt";
		FileWriter fW = new FileWriter (file);
		fW.write ("we are doing JAva\n");
		fW.write ("We are handeling file");
		
		fW.close();
	}

}
