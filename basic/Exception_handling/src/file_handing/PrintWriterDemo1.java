package file_handing;

import java.io.*;

public class PrintWriterDemo1 {

	public static void main(String[] args) {
//		
		PrintWriter pw = new PrintWriter(System.out);
		
		try {
			PrintWriter pw1 = new PrintWriter("Filee/File.txt");
			
			pw1.write("Hello");
		pw1.flush();
		pw1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("Hello World");
		
		pw.flush();
		pw.close();
	
	}
}
