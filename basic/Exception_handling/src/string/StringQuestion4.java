package string;

//How to remove White space in a String
public class StringQuestion4 {

	public static void main(String[] args) {
		
		
		//using the Trim method it only remove the white spaces from Front and end of the String
		
		System.out.println("trim() Methods");
		System.out.println();
		String s = "  hello    World   ";
		
		System.out.println(s.trim());
		
		System.out.println();
		System.out.println("using toString() Methods");
		
		
		char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') { 
                sb.append(arr[i]); 
            }
        }

        String result = sb.toString();
        System.out.println(result);
        
        System.out.println();
        System.out.println("Another Method to Print space betwwen word using Regex");
        
        String trim = s.trim();
        
        String trimmed = trim.replaceAll("\\s+", " ");
        System.out.println(trimmed);
        
        System.out.println();
		System.out.println("Using Character.isWhitespace()");
		
		StringBuilder sb1 = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
		    if (!Character.isWhitespace(s.charAt(i))) {
		        sb1.append(s.charAt(i));
		    }
		}
		String news = sb1.toString();
		System.out.println(news); 
        
	}
}
