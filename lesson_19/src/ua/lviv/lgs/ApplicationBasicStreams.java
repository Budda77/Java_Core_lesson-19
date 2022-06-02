package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class ApplicationBasicStreams {
	public static void main(String[] args) throws Exception {
		
		File file = new File("basicStream.txt");
		
		writeUsingOS(file,"Hello guys from Java Academy.");
		
		System.out.println(readFromIO(file));
		
		File file2 = new File("basicStream2.txt");
		writeUsingSS(file2, "Run Forest run.");
		System.out.println(readUsingSS(file2,100));		
	}
	
	
	public static void writeUsingOS(File file, String data) throws IOException {
		OutputStream os = new FileOutputStream(file);
		os.write(data.getBytes());
		os.close();		
	}
	
	public static String readFromIO(File file) throws IOException {
		InputStream is = new FileInputStream(file);
		int information;  		// = is.read();
		char data;
		StringBuilder st = new StringBuilder();
		
		while((information = is.read()) != -1){
			data = (char)information;
			st.append(data);
			//information = is.read();
		}
		is.close();
		
		return st.toString();
	}
	
	public static void writeUsingSS(File file, String data) throws IOException {
		Writer wr = new FileWriter(file);
		wr.write(data);
		wr.close();		
	}
	
	public static String readUsingSS(File file, int arraySize) throws IOException {
		Reader rd = new FileReader(file);
		char[] array = new char[arraySize];
		StringBuilder sb = new StringBuilder();
		rd.read(array);
		rd.close();
		
		for (char c : array) {
			sb.append(c);
		}		
		return sb.toString();
	}
	
	

}
