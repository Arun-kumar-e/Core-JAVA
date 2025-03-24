package string;

import java.util.*;
// reverse a String using predefined methods
public class StringQues1 {

	public static void main(String[] args) {
		
		//charAt
		
		String s = "prasoon";
		
		for(int i = s.length()-1 ; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		
		// using Split
		
		String s1 = "prasoon";
		
		String [] arr = s1.split(""); 
	
		for(int i = arr.length-1 ; i>=0 ; i--) {
			System.out.print(arr[i]);	
		}
		
		System.out.println();
		
		
		// using toCharArray
		
		String s2 = "prasoon";
		
		char [] arr1 = s1.toCharArray();
		
		for(int i = arr1.length-1 ; i>=0 ; i--) {
			System.out.print(arr1[i]);	
		}
		
		System.out.println();
		
		// using reverse StringBuffer
		
		StringBuffer sb = new StringBuffer(s1);
		String s3 = sb.reverse().toString();
		System.out.print(s3);
		
		System.out.println();
		
		//using String StringBuilder
		StringBuilder  sbu = new StringBuilder(s1);
		String s4 = sbu.reverse().toString();
		System.out.println(s4);
	}
}
