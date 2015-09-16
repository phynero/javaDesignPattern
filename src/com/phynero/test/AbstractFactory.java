package com.phynero.test;

public class AbstractFactory {
	
	interface ProductA{
		public void create();
	}
	interface ProductB{
		public void create();
	}
	class productA1 implements ProductA{
		public void create(){
			System.out.println("1厂生产的A");
		}
	}
	class productA2 implements ProductA{
		public void create(){
			System.out.println("2厂生产的A");
		}
	}
	class productB1 implements ProductB{
		public void create(){
			System.out.println("1厂生产的B");
		}
	}
	class productB2 implements ProductB{
		public void create(){
			System.out.println("2厂生产的B");
		}
	}
	
	abstract class Factory1{
		abstract ProductA creatA1();
		abstract ProductB creatB1();
	}
	abstract class Factory2{
		abstract ProductA creatA2();
		abstract ProductB creatB2();
	}
	
	class ConcreteFactory1 extends Factory1{
		public ProductA creatA1(){
			return new productA1();
		}
		public ProductB creatB1(){
			return new productB1();
		}
	}
	
	class ConcreteFactory2 extends Factory2{
		public ProductA creatA2(){
			return new productA2();
		}
		public ProductB creatB2(){
			return new productB2();
		}
	}
	
//	public static void main(String[] args){
//		System.out.println("抽象工厂");
//		AbstractFactory test = new AbstractFactory();
//		Factory1 factory1 = test.new ConcreteFactory1();
//		Factory2 factory2 = test.new ConcreteFactory2();
//		
//		ProductA pdA1 = factory1.creatA1();
//		pdA1.create();
//		ProductB pdB1 = factory1.creatB1();
//		pdB1.create();
//		
//		ProductA pdA2 = factory2.creatA2();
//		pdA2.create();
//		ProductB pdB2 = factory2.creatB2();
//		pdB2.create();
//	}
}
