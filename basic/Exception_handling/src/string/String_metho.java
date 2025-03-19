package string;

import java.util.*;

public class String_metho {

	public static void main(String[] args) {
		
		String s1 = "HeiHelloHey ";
		
		// concat()
		String s2 = "Hello";
		System.out.println(s1.concat(s2));
		
		//ToLowercase
		System.out.println(s1.toLowerCase());
		
		//ToUppercase
		System.out.println(s1.toUpperCase());
		
		//indexof
		System.out.println(s1.indexOf('H'));
		
		//lastindexof
		System.out.println(s1.lastIndexOf('H'));
		
		//length()
		System.out.println(s1.length());
		
		//substring()
		System.out.println(s1.substring(3,8));
		//substring With out last index
		System.out.println(s1.substring(6));
		
		//equals
		System.out.println(s1.equals(s2));
		
		//valueof
		int a = 19;
		int b = 30;
		System.out.println("a+b = " +(a+b));
		String s4 = String.valueOf(a);
		String s5 = String.valueOf(b);
		System.out.println("USing value of a+b = " + s4+s5);
		
		//split
		String [] arr = s1.split("H");
		System.out.println(Arrays.toString(arr));
		
		//replace
		System.out.println(s1.replace("Hey", "Bey"));
	
	}
}
