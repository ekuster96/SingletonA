package com.company.java.SingletonA;

public class SingletonSimpleEager {
	 
    private static final SingletonSimpleEager instance = new SingletonSimpleEager();
 
    private SingletonSimpleEager() {
    }
 
    public static SingletonSimpleEager getInstance() {
        return instance;
    }
}