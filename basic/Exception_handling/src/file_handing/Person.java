package file_handing;

import java.io.*;

public class Person implements Serializable {

	private static final long serialVersionUID = 1001;

	int id;
	String name;
	String Gmail;
	transient String Pwd;

// note-> SerialversionUID always define with Static and final

	public static void main(String[] args) throws Exception {

		Person p = new Person();
		p.id = 100;
		p.name = "Arun";
		p.Gmail = "Arun@gmail.com";
		p.Pwd = "1234";

		System.out.println("Serialization started");

		FileOutputStream fos = new FileOutputStream("Arun.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p);

		fos.flush();
		fos.close();

		System.out.println("Completed");

		System.out.println("Deserialization Started");

		FileInputStream fis = new FileInputStream("Arun.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Object ob = ois.readObject();

		Person p1 = (Person) ob;

		System.out.println("ID " + p1.id);
		System.out.println("Name " + p1.name);
		System.out.println("Gmal " + p1.Gmail);
		System.out.println("Password " + p1.Pwd);

		System.out.println("Completeed");
		
		ois.close();
		fis.close();
	}
}
