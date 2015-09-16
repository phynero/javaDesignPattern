package com.phynero.test;

public class ProxyTest {
	public class ProxyObject implements Object{
		Object obj;
		
		public ProxyObject(){
			System.out.println("������");
			obj = new ObjectImpl();
		}
		
		public void action(){
			System.out.println("����ʼ");
			obj.action();
			System.out.println("�������");
		}
	}
	
	public interface Object{
		void action();
	}
	public class ObjectImpl implements Object{

		@Override
		public void action() {
			System.out.println("=====");
			System.out.println("=====");
			System.out.println("���Ǳ��������");
			System.out.println("=====");
			System.out.println("=====");
		}
	}
	public static void main(String[] str){
		System.out.println("����ģʽ");
		ProxyTest test = new ProxyTest();
		Object obj = test.new ProxyObject();
		obj.action();
	}
}
