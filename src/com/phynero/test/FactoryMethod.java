package com.phynero.test;

public class FactoryMethod {
	
	public interface virtualProductClass{
		void run();
	}
	
	public class product1 implements virtualProductClass{
		@Override
		public void run() {
			System.out.println("product1");
		}
	}
	
	public class product2 implements virtualProductClass{
		@Override
		public void run() {
			System.out.println("product2");
		}
	}
	
	public abstract class virtualFactory{
		abstract virtualProductClass create();
	}
	
	public class factory1 extends virtualFactory{
		public virtualProductClass create(){
			return new product1();
		}
	}

	public class factory2 extends virtualFactory{
		public virtualProductClass create(){
			return new product2();
		}
	}
	
//	public static void main(String[] args){
//		System.out.println("∆’Õ®π§≥ß");
//		FactoryMethod test = new FactoryMethod();
//		
//		virtualFactory factory1 = test.new factory1();
//		virtualFactory factory2 = test.new factory2();
//		
//		virtualProductClass pd1 = factory1.create();
//		virtualProductClass pd2 = factory2.create();
//		
//		pd1.run();
//		pd2.run();
//	}
}










