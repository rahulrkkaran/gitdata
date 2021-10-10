package com.java.net;

 // throw throws 
public class Stu  {
	
	 public static void age(int age) throws Throwable           {
		 
		 if (age>=18) {
			System.out.println("Eligible to vote");
		} else {
 
			throw new  NullPointerException();
			
		}
		 
		 	}
	 
	 public static void main(String[] args) throws Throwable      {
		age(1);
		 
	}
	 
	 
  }