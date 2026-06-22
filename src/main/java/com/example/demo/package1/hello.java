package com.example.demo.package1;

public class hello {
	public static void main(String args[]) {
		String S1 = "hello";
		String S2 = new String("hello");
		String S3 = "hello";
		String S4 = new String("hello");
		System.out.println(S1==S2);
		System.out.println(S1==S3);
		System.out.println(S1==S4);
		System.out.println(S1.equals(S4));
	}

}
