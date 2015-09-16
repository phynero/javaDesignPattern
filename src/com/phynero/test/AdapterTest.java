package com.phynero.test;

public class AdapterTest {
	class Adaptee{
		public void specificRequest(){
			System.out.println("需要被适配的XXX");
		}
	}
	
	interface Target{
		public void request();
	}
	
	class ConcreteTarget implements Target{
		public void request(){
			System.out.println("适配目标结果");
		}
	}
	
	class Adapter extends Adaptee implements Target{
		@Override
		public void request() {
			super.specificRequest();
		}
	}

//	public static void main(String[] args){
//		System.out.println("创建者模式");
//		AdapterTest test = new AdapterTest();
//		Target concreteTarget = test.new ConcreteTarget();
//		concreteTarget.request();
//		
//		Target adapter = test.new Adapter();
//		adapter.request();
//	}
}
