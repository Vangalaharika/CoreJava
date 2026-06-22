package com.example.demo.package1;

public class GlobalVariables {
	int id = 10; //instance variable
	static String name= "Harika"; //static variable
	public static void main(String args[]) {
		GlobalVariables var = new GlobalVariables();
		System.out.println(var.id);
		System.out.println(name);
	}
	

}
