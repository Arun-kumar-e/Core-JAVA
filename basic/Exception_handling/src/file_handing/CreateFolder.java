// Create a file using java program 

package file_handing;

import java.io.File;

public class CreateFolder {

public static void main(String[] args) {
		
		File file = new File("Filee");
		
		// method to make MKDIR  --> mkdir
		
		if(!file.exists()){
			file.mkdir();
			System.out.println("Folder is created ");
		} else {
			System.out.println("File exicts");
		}

	}
}
