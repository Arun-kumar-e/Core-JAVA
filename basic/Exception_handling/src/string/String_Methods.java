package string;

import java.util.*;

public class String_Methods {

	public static void main(String[] args) {

		String s1 = "Arun ";
		String s2 = "Choudhary";
		
		// charAt
		System.out.println(s1.charAt(1));

		// length()
		System.out.println(s1.length());

		// concat()
		String s3 = s1+s2;
		System.out.println(s3);
		System.out.println(s1.concat(s2));
	
	    // equals()
		System.out.println(s1.equals(s1));
		
		//replace()
		String s4 = s1.replace("Ar", "Ory");
		System.out.println(s4);
		
		//toUppercase()
		String s5 = s1.toUpperCase();
		System.out.println(s5);
		
		//toLowercase()
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		
		//indexof()
		System.out.println(s2.indexOf('u'));
		
		// lastindexof()
		System.out.println(s2.lastIndexOf('h'));
		System.out.println(s2.lastIndexOf('b'));

		// substring()
		String s7 = s3.substring(4 , 8);
		System.out.println(s7);
		
		// split()
		String s8 = "sdgadvsvadbsdvasdvabfba";
		System.out.println(s8.split(s8, 'a'));
		String [] arr = s8.split("a");
		System.out.println(Arrays.toString(arr));
		
		// valuueof()
		int a = 12;
		System.out.println(String.valueOf(a));
	}
}
