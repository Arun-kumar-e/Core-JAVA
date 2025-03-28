package Question;

import java.io.*;

public class Question1 {

	public static void main(String[] args) {
		
		String data = "This is the data to be written to the file.";
		
		try {
			FileWriter Writer = new FileWriter("Filee/example.txt");
			
			Writer.write(data);
			Writer.write("Arun choudhary");
			
			Writer.close();
			
			System.out.println("Data is added in the file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		File file = new File("Filee/example.txt");
//        if (file.exists()) {
//            System.out.println("File created successfully at: " + file.getAbsolutePath());
//        } else {
//            System.out.println("File creation failed");
//        }
		
	}
}
