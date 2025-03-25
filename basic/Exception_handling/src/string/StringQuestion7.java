package string;

public class StringQuestion7 {

	public static void main(String[] args) {
		
		String s = "Hello java programing";
		
		String[] words = s.split("\\s+"); 
		int count = 0;
		for (String word : words) {
            System.out.println(word);  // Print each word
            count++;  // Increment the word count
        }
		System.out.println("Each Word in a String : "+count);
		
	}
}
