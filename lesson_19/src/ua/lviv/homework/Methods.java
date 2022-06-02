package ua.lviv.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods {
	
	
	
	public static void serialize(File file, Serializable object) {
		
		try {
			ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(file));		
			ostream.writeObject(object);
			ostream.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	
	public static Serializable deserealize (File file) throws ClassNotFoundException {
		Serializable object = null;
		try {
			ObjectInputStream istream = new ObjectInputStream(new FileInputStream(file));
			 object = (Serializable)istream.readObject();			
			istream.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return object;
	}
	
	

}
