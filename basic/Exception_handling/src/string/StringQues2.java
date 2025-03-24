package string;
//remove the duplicate characters
public class StringQues2 {

	public static void main(String[] args) {
		
		String s = "Programming";
		String s1 ="";
		boolean b = false;
		for(int i = 0 ; i < s.length() ; i++) {
			for(int j = i+1 ; j < s.length() ; j++) {
				if(s.charAt(i) == s.charAt(j)) {
					b = true;
				}
				if(b) {
					s1 = s1 + s.charAt(i);
				}
			}
		}
		System.out.println(s1);
		
		
		//using StringBuilder
		StringBuilder sb = new StringBuilder(s);
		
		for(int i = 0 ; i < sb.length() ; i++) {
			for(int j = i+1 ; j < sb.length() ; j++) {
				if(sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
				}
			}
		}
		System.out.println(sb);
		
		System.out.println();
		
		String s4 = "arararra";
		for(int i = 0 ; i <s4.length() ; i++) {
			char ch = s4.charAt(i);
			
			int index = s4.indexOf(ch , i+1);
			
			if(index == -1) {
				System.out.print(ch);
			}
		}
		
		
	}
}
