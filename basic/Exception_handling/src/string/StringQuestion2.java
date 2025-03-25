package string;

import java.util.Scanner;

//Palindrome String
public class StringQuestion2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		
		System.out.println("using charAt()");
		System.out.println();
		String s1 = "";
		
		for(int i = s.length()-1 ; i>=0 ; i--) {
			s1 = s1+s.charAt(i);
		}
		if(s.equals(s1)) {
			System.out.println(s +" is a palindrome String");
		}else {
			System.out.println(s +" is not a palindrome String");
		}
		
		System.out.println();
		System.out.println("Using StringBuilder or StringBuffer  (Both are same)");
		System.out.println();
		
		String s2 = new StringBuilder(s).reverse().toString();
		
		if(s.equals(s2)) {
			System.out.println(s +" is a palindrome String");
		}else {
			System.out.println(s +" is not a palindrome String");
		}
		
		System.out.println();
		System.out.println("Using toArray()");
		System.out.println();
		
		char[] arr = s.toCharArray();
		String s5 = "";
		
		for(int i = arr.length-1 ; i>=0 ; i--) {
			s5 = s5+arr[i];
		}
		
		if(s.equals(s5.toString())) {
			System.out.println(s +" is a palindrome String");
		}else {
			System.out.println(s +" is not a palindrome String");
		}
		
	}
}
