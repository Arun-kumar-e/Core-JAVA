// Create file in a folder 

package file_handing;

import java.io.*;


public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		
		// truncatable mode 
		
//		FileWriter filewrite = new FileWriter("Filee/File.txt");
//		
//		filewrite.write("Hello in a my filee");
//		
//		System.out.println("File created");
		
		
		
		//appendable mode (Adding new String in file )
		
		FileWriter filewrite = new FileWriter("Filee/File.txt" , true);
		filewrite.append(" , arun");
		System.out.println("File Created ");
		filewrite.append(" Aafes \n" + "aeqwef \n"  + "Safaff");

		filewrite.close();
	}

}
