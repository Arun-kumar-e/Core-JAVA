package string;

public class StringQuestion1 {

	public static void main(String[] args) {
		
		
		//using charAt()
		System.out.println("using charAt()");
		String s = "Hello";
		
		for(int i =s.length()-1 ; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		System.out.println("Another Method");
		
		System.out.println();
		
		//Using Split()
		System.out.println("Using Split()");
		String [] arr = s.split("");
		
		for(int i = arr.length-1 ; i>=0 ; i--) {
			System.out.print(arr[i]);	
		}
		
		System.out.println();
		System.out.println("Another Method");
		System.out.println();
		
		//Using StringBuilder or StringBuffer Both are same
		System.out.println("Using StringBuilder or StringBuffer Both are same");
		String reversed = new StringBuilder(s).reverse().toString();
		System.out.println(reversed);
		
		System.out.println();
		System.out.println("Another Method");
		System.out.println();
		
		// using toCharArray
		
		System.out.println("using toCharArray");
			char [] arr1 = s.toCharArray();
				
			for(int i = arr1.length-1 ; i>=0 ; i--) {
					System.out.print(arr1[i]);	
			}
				
	}
}
