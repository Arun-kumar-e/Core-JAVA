package file_handing;

import java.io.*;

public class ReaderFile {

public static void main(String[] args) throws IOException {
		
		FileReader filereader = new FileReader("Filee/File.txt");
		
		BufferedReader br = new BufferedReader(filereader);
		
		String buffer;
		while((buffer = br.readLine()) != null) {
			System.out.println(buffer);
		}
		
		filereader.close();
		br.close();
		
	}
}
