package com.phynero.test;

public class TemplateTest {
	public abstract class AbstractClass{
		public abstract void PrimitiveOperation1();
		public abstract void PrimitiveOperation2();
		
		public void TemplateMethod(){
			PrimitiveOperation1();
			PrimitiveOperation2();
			System.out.println("Done the TemplateMethod");
		}
	}
	
	public class ConcreteClassA extends AbstractClass{

		@Override
		public void PrimitiveOperation1() {
			System.out.println("Implement operation 1 in Concreate class A");
		}

		@Override
		public void PrimitiveOperation2() {
			System.out.println("Implement operation 2 in Concreate class A");
		}
	}	
	public class ConcreteClassB extends AbstractClass{

		@Override
		public void PrimitiveOperation1() {
			System.out.println("Implement operation 1 in Concreate class B");
		}

		@Override
		public void PrimitiveOperation2() {
			System.out.println("Implement operation 2 in Concreate class B");
		}
	}
	
	public static void main(String[] str){
		System.out.println("Ä£°åÄ£Ê½");
		TemplateTest test = new TemplateTest();
		AbstractClass ab1 = test.new ConcreteClassA();
		AbstractClass ab2 = test.new ConcreteClassB();
		ab1.PrimitiveOperation1();
		ab1.PrimitiveOperation2();
		ab2.PrimitiveOperation1();
		ab2.PrimitiveOperation2();
	}
}
