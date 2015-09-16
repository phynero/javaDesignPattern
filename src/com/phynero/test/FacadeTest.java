package com.phynero.test;

public class FacadeTest {
	public interface FacadeA{
		public void methedA();
	}
	public interface FacadeB{
		public void methedB();
	}
	public interface FacadeC{
		public void methedC();
	}
	public class ConcreteFacadeA implements FacadeA{
		public void methedA(){
			System.out.println("methedA");
		}
	} 
	public class ConcreteFacadeB implements FacadeB{
		public void methedB(){
			System.out.println("methedB");
		}
	} 
	public class ConcreteFacadeC implements FacadeC{
		public void methedC(){
			System.out.println("methedC");
		}
	}
	
	public class Facade{
		private FacadeA fa;
		private FacadeB fb;
		private FacadeC fc;
		
		public Facade(){
			fa = new ConcreteFacadeA();
			fb = new ConcreteFacadeB();
			fc = new ConcreteFacadeC();
		}
		
		public void methedA(){
			fa.methedA();
			fb.methedB();
		}
		public void methedB(){
			fb.methedB();
			fc.methedC();
		}
		public void methedC(){
			fc.methedC();
			fa.methedA();
		}
	}
	
//	public static void main(String[] str){
//		System.out.println("外观模式");
//		FacadeTest test = new FacadeTest();
//		FacadeA fa = test.new ConcreteFacadeA();
//		FacadeB fb = test.new ConcreteFacadeB();
//		FacadeC fc = test.new ConcreteFacadeC();
//		fa.methedA();
//		fb.methedB();
//		fc.methedC();
//		Facade ff = test.new Facade();
//		ff.methedA();
//		ff.methedB();
//		ff.methedC();
//	}
}
