package string;

import java.util.*;

//Reverse each word of a String

public class StringQues3 {
	
	public static void main(String[] args) {
	
		String s = "java code";
		
		String [] arr = s.split(" ");
		
		arr[0] = new StringBuilder(arr[0]).reverse().toString();
		arr[1] = new StringBuilder(arr[1]).reverse().toString();
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}
