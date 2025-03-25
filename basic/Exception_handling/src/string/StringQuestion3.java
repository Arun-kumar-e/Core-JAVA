package string;

public class StringQuestion3 {

	public static void main(String[] args) {
		
		String s = "Hello@Java@programming";
		
		
		// using StringBuilder or StringBuffer 
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			char ch = s.charAt(i);
			
			if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }else {
            	sb.append(" ");
            }
		}
		System.out.println(sb);
		
		System.out.println();
		System.out.println("Using another Methods :");
		System.out.println();
		
		String s1 = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s1);
		
		System.out.println();
		System.out.println("using another way ");
		System.out.println();
		
		for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (String.valueOf(c).matches("[^A-Za-z0-9]")) {
                System.out.print(" "); // Replace with space
            } else {
                System.out.print(c);
            }
        }
		
	}
}
