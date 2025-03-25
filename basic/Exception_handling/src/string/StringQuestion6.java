package string;

public class StringQuestion6 {

	public static void main(String[] args) {
		
		System.out.println("Using split method");
		
		String s = "Hello java programing";
		
		String[] words = s.split(" ");

        // The length of the array gives the number of words
        System.out.println("Word count: " + words.length);

	}
}
