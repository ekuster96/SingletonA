package com.company.java.SingletonA;

public class MainClass {

	public static void main(String[] args) {
		SingletonSimpleEager s1 = SingletonSimpleEager.getInstance();
		SingletonSimpleEager s2 = SingletonSimpleEager.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}

}
