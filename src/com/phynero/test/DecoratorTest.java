package com.phynero.test;

public class DecoratorTest {
	public interface Component{
		void functionA();
	}
	
	public class ConcreateComponent implements Component{
		public void functionA(){
			System.out.println("FunctionA");
		}
	}
	
	public class Decorator implements Component{
		private Component component;

		public Decorator(Component component){
			this.component = component;
		}
		@Override
		public void functionA() {
			// TODO Auto-generated method stub
			component.functionA();
		}		
	}
	
	public class ConcreateDecorator extends Decorator{

		public ConcreateDecorator(Component component) {
			super(component);
		}
		
		@Override
		public void functionA(){
			super.functionA();
			this.functionB();
		}
		private void functionB(){
			System.out.println("function B");
		}
	}
//	public static void main(String[] str){
//		System.out.println("в╟йндёй╫");
//		DecoratorTest test = new DecoratorTest();
//		Component component = test.new ConcreateDecorator(test.new ConcreateComponent());
//		component.functionA();
//	}
}
