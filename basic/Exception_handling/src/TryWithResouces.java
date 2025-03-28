import java.io.*;

public class TryWithResouces {

	public static void main(String[] args) {

		String line;
		try (BufferedReader br = new BufferedReader(new FileReader("Filee/File.txt"))) {
			{
				while ((line = br.readLine()) != null) {

				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}