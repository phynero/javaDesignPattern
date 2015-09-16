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
			System.out.println("���Ǳ���¡������");
			return "String is "+this.str;
		}
	}
	
//	public static void main(String[] args){
//		System.out.println("ԭ��ģʽ");
//		
//		Prototype pttype = new Prototype();
//		Proto_type pt = pttype.new Proto_type("�Ǻ�");
//		
//		Proto_type pt1 = (Proto_type)pt.clone();
//		pt1.toString();
//	}
}
