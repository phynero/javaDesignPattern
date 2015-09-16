package com.phynero.test;

public class Prototype {
	public class Proto_type implements Cloneable{
		private String str;
		public Proto_type(String str){
			this.str = str;
		}
		public Object clone(){
			Object obj = null;
			try{
				obj = super.clone();
			}catch(CloneNotSupportedException e){
				e.printStackTrace();
			}
			return obj;
		}
		public String toString(){
			System.out.println("我是被克隆出来的");
			return "String is "+this.str;
		}
	}
	
//	public static void main(String[] args){
//		System.out.println("原型模式");
//		
//		Prototype pttype = new Prototype();
//		Proto_type pt = pttype.new Proto_type("呵呵");
//		
//		Proto_type pt1 = (Proto_type)pt.clone();
//		pt1.toString();
//	}
}
