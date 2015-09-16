package com.phynero.test;

public class AdapterTest {
	class Adaptee{
		public void specificRequest(){
			System.out.println("��Ҫ�������XXX");
		}
	}
	
	interface Target{
		public void request();
	}
	
	class ConcreteTarget implements Target{
		public void request(){
			System.out.println("����Ŀ����");
		}
	}
	
	class Adapter extends Adaptee implements Target{
		@Override
		public void request() {
			super.specificRequest();
		}
	}

//	public static void main(String[] args){
//		System.out.println("������ģʽ");
//		AdapterTest test = new AdapterTest();
//		Target concreteTarget = test.new ConcreteTarget();
//		concreteTarget.request();
//		
//		Target adapter = test.new Adapter();
//		adapter.request();
//	}
}
