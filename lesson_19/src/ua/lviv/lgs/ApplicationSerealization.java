package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class ApplicationSerealization {

	public static void main(String[] args) throws Exception {
		
		File file = new File("serialization.txt");
		Person p = new Person("Ivan", "Petrushka",21);
		
		System.out.println(p);
		writeObject(file, p);
		
		Person p2 =(Person)readObject(file);
		System.out.println(p2);


	}
	
	public static void writeObject(File file, Serializable object) throws Exception {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(object);
		oos.close();			
	}
	
	public static Serializable readObject(File file) throws Exception {
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Serializable object = (Serializable)ois.readObject();
		ois.close();
		is.close();
		return object;
		
	}
		
		

}
