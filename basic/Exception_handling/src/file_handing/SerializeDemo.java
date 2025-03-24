package file_handing;

import java.io.*;

public class SerializeDemo  {

	public static void main(String[] args)  {
		
		// 1.  create object of MyStudent class
		
		MyStudent s1 = new MyStudent(101, "Arun", 80.0);
		
		String fileName = "Filee/File.txt";
		
		
		try {
			
		//2. FileOutputStream 
		FileOutputStream fos = new FileOutputStream(fileName);
		
		//3. ObjectOutputStream
		
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		
		System.out.println("Object written to the file ........");
		oos.close();
		fos.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
