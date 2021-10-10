package com.java.net;

public class Str {

	public static void main(String[] args) {
		String s ="Welcome to java";
		 String s1 =" ";
		 String s2 ="";
		 String s3 =null;
		
		
		
		
//		System.out.println(s);
//		
//		int length = s.length();
//		System.out.println(length);
//		
//		boolean equals = s.equals("WElcome to java");
//		System.out.println(equals);
//		
//		boolean equalsIgnoreCase = s.equalsIgnoreCase("WELCOME TO JAVA");
//		System.out.println(equalsIgnoreCase);
//		
//		String upperCase = s.toUpperCase(); 
//		System.out.println(upperCase);
//		
//		String lowerCase = s.toLowerCase();
//		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("Wel"); 
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("ava");
		System.out.println(endsWith);
		
		boolean contains = s.contains("to"); 
		System.out.println(contains);
		
		int indexOf = s.indexOf("e"); 
		System.out.println(indexOf);
 		
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		
		//charAt
		char charAt = s.charAt(8); 
		System.out.println(charAt); 
		
		//replace
		String replace = s.replace("e", "$"); 
		System.out.println(replace);
		
		//substring
		String substring = s.substring(3); 
		System.out.println(substring); 
		
//		String substring2 = s.substring(3, 12); 
//		System.out.println(substring2);
//		
//		//is empty
//		boolean empty = s2.isEmpty(); 
//		System.out.println(empty);
//		// trim 
//		String trim = s.trim(); 
//		System.out.println(trim);
//		
//		//split   // regex 
//		String[] split = s.split(" "); 
//		for (String string : split) {
//			System.out.println(string);
//		}
//		

		
	}
	
}