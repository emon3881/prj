package fileHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String file = "data1/name.txt";
		FileWriter fw = new FileWriter (file);
		fw.write("we love NYC\n");
		fw.write("i live in Brooklyn");
		
		fw.close();
	}

}
