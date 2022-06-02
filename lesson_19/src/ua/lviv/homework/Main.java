/*
 * LOGOS It Academy home work 19
 * 
 * */


package ua.lviv.homework;

import java.io.File;
import java.util.ArrayList;


/**
 * This program demonstrates the use of Streams I/O and Serializable Object.
 * @author Oleksandr
 * @param input parameters is Object of Employee and File.
 * @exception IOException
 * @exception ClassNotFoundException
 * 
 */

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		File file = new File("employ.ser");
		Employee manager = new Employee("Taras", 18, 45000);
		
		// serialize and de-serialize Employee objects
		
		Methods.serialize(file, manager);
		Employee manager2 = (Employee)Methods.deserealize(file);

		System.out.println(manager2);
		
		
		System.out.println("\nA serialization of the collection.\n");
		
		File file2 = new File("listEmploy.ser");
		
		//Create a collection of Employee objects, serialize and deserialize the collection.
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("Ivan",20,34000));
		emplist.add(new Employee("Olena",21,39000));
		emplist.add(new Employee("Regina",22,36000));
		emplist.add(new Employee("Tymur",23,29000));
		emplist.add(new Employee("Robert",24,33000));
		emplist.add(new Employee("Nykol",25,30000));
		
		Methods.serialize(file2, emplist);
		
		ArrayList<Employee> emplist2 = new ArrayList<Employee>();
		
		emplist2 = (ArrayList)Methods.deserealize(file2);
		
		for (Employee employee : emplist2) {
			System.out.println(employee);
		}
	}

}
