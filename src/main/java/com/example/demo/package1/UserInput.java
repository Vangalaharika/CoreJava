package com.example.demo.package1;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi,What is your name?");
		String name = scanner.nextLine();
		
		System.out.printf("Hi %s , welcome!! %n",name);
		
		System.out.printf("Hi %s , what is your age? %n",name);
		int age = scanner.nextInt();
		
		 if(age>18) {
			System.out.printf("Hi %s , congratulations you are eligible for voting!! %n",name);
		}
		else {
			System.out.printf("Hi %s , sorry you are not eligible for voting %n",name);
		}
	}
}
