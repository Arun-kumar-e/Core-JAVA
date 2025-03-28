package Question;

import java.io.FileWriter;
import java.io.IOException;

public class Question2 {

	public static void main(String[] args) {
String data = "This is the data to be written to the file.";
		
		try {
			FileWriter Writer = new FileWriter("Filee/exampe.txt");
			
			Writer.write(data);
			Writer.write("Arun choudhary");
			
			Writer.close();
			
			System.out.println("Data is added in the file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
