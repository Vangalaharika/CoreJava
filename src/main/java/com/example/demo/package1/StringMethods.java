package com.example.demo.package1;

import java.util.Arrays;

public class StringMethods {
	public static void main(String args[]) {
		String S1 = "Hello";
		String S2 = "hello";
		String S3 = "HELLO";
		System.out.println(S1.equals(S2));
		System.out.println(S1.endsWith("he"));
		System.out.println(S1.length());
		System.out.println(S1.equalsIgnoreCase(S2));
		System.out.println(S1.contains("l"));
		System.out.println(S1.contains("y"));
		System.out.println(S1.startsWith("He"));
		String S4 = " Hello World ";
		System.out.println(S4.trim());
		System.out.println(S2.toUpperCase());
		System.out.println(S3.toLowerCase());
		System.out.println(S1.indexOf("l"));
		System.out.println(S1.lastIndexOf("l"));
		System.out.println(S1.toCharArray());
		System.out.println(S1.substring(2));
		System.out.println(S1.substring(2,5));
		System.out.println(S1.split(" "));
		System.out.println(Arrays.toString(S1.split(" ")));
   	}

}
