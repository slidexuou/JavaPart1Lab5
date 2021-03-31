package com.xuou.lab11;

public class lab11 {
//	public static void main(String[] args) {
//		int a = 11, b = 10;
//		String c = "Hello", d = "world";
//		int addedint = addition(a, b);
//		String addedString = addition(c, d);
//	}
//
//	public static int addition(int n1, int n2) {
//		return n1 + n2;
//	}
//
//	public static String addition(String n1, String n2) {
//		return n1 + "" + n2;
//	}
	public static void main(String[] args) {
		String myWord = "ReturnValMethod";
		System.out.println(greeting(myWord));
		String greeting = "NotReturnValMethod";
		sayHello(greeting);
	}

	public static String greeting(String word) {
		return "Return";

	}

	public static void sayHello(String word) {
		System.out.println(word);
	}
}
