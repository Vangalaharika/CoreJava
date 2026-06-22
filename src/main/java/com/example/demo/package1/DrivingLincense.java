package com.example.demo.package1;

import java.util.Scanner;

public class DrivingLincense {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Hi,What is your name?");
		String name = scanner.nextLine();
		System.out.printf("Hi %s , what is your age? %n",name);
		int age = scanner.nextInt();
		if(age>18) {
			System.out.printf("hi congulations you are eligilbe for driving!! %n" ,name);
		}
		else {
			System.out.printf("hi congulations you are not eligilbe for driving!! %n",name);
		}
			
}
}
