package com.phynero.test;

public class Singleton {
	private Singleton(){};
//	private static Singleton single = null;
//
//	public static synchronized Singleton getInstance(){
//		if(single == null){
//			single = new Singleton();	
//		}
//		return single;
//	}


	private static Singleton single = new Singleton();
	public static Singleton getInstance(){
		return single;
	}
	
	public static void main(String[] args){
		System.out.println("原型模式");
	}
}
