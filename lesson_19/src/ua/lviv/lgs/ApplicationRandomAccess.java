package ua.lviv.lgs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class ApplicationRandomAccess {

	public static void main(String[] args) throws Exception {
		
		File file = new File("randomAccessFile.txt");
		
		writeToFle(file,
	"Hello Logos",35);
		
		System.out.println(readFromFle(file,35,1000));
		

	}
	
	public static void writeToFle(File file, String data, int position) throws Exception {
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		raf.seek(position);
		raf.write(data.getBytes());
		raf.close();		
	}
	
	public static String readFromFle(File file, int position, int size) throws Exception{
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		raf.seek(position);
		byte[] array = new byte[size];
		
		raf.read(array);
		raf.close();
		
		StringBuilder sb = new StringBuilder();
		
		for (byte b : array) {
			sb.append((char)b);
		}
		
		return sb.toString();
	}

}
