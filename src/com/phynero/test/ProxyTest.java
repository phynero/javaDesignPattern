package com.phynero.test;

public class ProxyTest {
	public class ProxyObject implements Object{
		Object obj;
		
		public ProxyObject(){
			System.out.println("代理类");
			obj = new ObjectImpl();
		}
		
		public void action(){
			System.out.println("代理开始");
			obj.action();
			System.out.println("代理结束");
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
			System.out.println("这是被代理的类");
			System.out.println("=====");
			System.out.println("=====");
		}
	}
	public static void main(String[] str){
		System.out.println("代理模式");
		ProxyTest test = new ProxyTest();
		Object obj = test.new ProxyObject();
		obj.action();
	}
}
