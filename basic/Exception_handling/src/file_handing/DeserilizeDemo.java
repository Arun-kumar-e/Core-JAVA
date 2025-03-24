package file_handing;

import java.io.*;
public class DeserilizeDemo {

	public static void main(String[] args) {
		
		MyStudent s  = null;
		String s2 = "Filee/File.txt";
		
		try {
			//FileInputStream fis = new FileInputStream("Filee/File.txt");
			FileInputStream fis = new FileInputStream(s2);
			
			//ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream(fis);
			 s = (MyStudent) ois.readObject();
			System.out.println(s);
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
