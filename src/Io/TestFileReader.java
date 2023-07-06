package Io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\HP\\Desktop\\Roshan\\Roshan.txt");
		int ch = file.read();
		while(ch !=-1) {
			System.out.print((char)ch);
			//System.out.println(ch);
			ch = file.read();
			
		}
		file.close();

	}

}
