package com.company.java.SingletonA;

public class MainClass {

	public static void main(String[] args) {
		SingletonSimpleEager ss = SingletonSimpleEager.getInstance();
		SingletonSimpleEager ss1 = SingletonSimpleEager.getInstance();
		SingletonSimpleEager ss2 = SingletonSimpleEager.getInstance();
		int s1,s2,s3;
		s1 = ss.hashCode();
		s2 = ss1.hashCode();
		s3 = ss2.hashCode();
		if (s1 == s2 && s2 == s3)
		{
			System.out.print("Ta sama referencja");
		}
	}

}
