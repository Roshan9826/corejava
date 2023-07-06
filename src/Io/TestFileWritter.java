package Io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWritter {
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\HP\\Desktop\\Roshan\\Roshantnt");
		
		file.write("Hello how are you Roshan 88745896214555");
			file.close();
	}
	

}
