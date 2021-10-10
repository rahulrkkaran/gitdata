package com.java.net;

 public class Student {
	public static void main(String[] args) {
		 String s ="Welcome to java@123";
		 int NumOfCaps=0;
		 int NumOfSmall=0;
		 int NumOfNum=0;
		 int NumOfSpecial=0;
		 for (int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				NumOfCaps++;
			}
			else if ('a'<=s.charAt(i) && s.charAt(i) <= 'z') {
				NumOfSmall++;
			}
			else if ('1'<=s.charAt(i) && s.charAt(i) <= '9') {
				NumOfNum++;
			}
			else {
				NumOfSpecial++;	
			}}
		System.out.println("NumOfCaps   "+NumOfCaps);
		 System.out.println("NumOfSmall    "+NumOfSmall    );
		System.out.println("NumOfNum   "   +NumOfNum   );
		System.out.println("NumOfSpcial    "   +NumOfSpecial  );
		
		
	}}

 