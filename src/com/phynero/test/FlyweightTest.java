package com.phynero.test;

import java.util.Hashtable;

public class FlyweightTest {
	
	public abstract class Flyweight{
		public abstract void operation();
	}
	
	public class ConcreteFlyweight extends Flyweight{
		private String string;

		public ConcreteFlyweight(String str){
			string = str;
		}
		@Override
		public void operation(){
			System.out.println("ConcreteFlyweight : "+ string);
		}
	}
	
	public class FlyweightFactory{
		private Hashtable flyweights = new Hashtable();
		
		public FlyweightFactory(){}
		
		public Flyweight getFlyWeight(Object obj){
			Flyweight flyweight = (Flyweight)flyweights.get(obj);
			if(flyweight == null){
				flyweight = new ConcreteFlyweight((String)obj);
				flyweights.put(obj,flyweight);
			}
			return flyweight;
		}
		
		public int getFlyweightSize(){
			return flyweights.size();
		}
	}
	
	public class FlyweightPattern{
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight fly1;
		Flyweight fly2;
		Flyweight fly3;
		Flyweight fly4;
		Flyweight fly5;
		Flyweight fly6;
		
		public FlyweightPattern(){
			fly1 = factory.getFlyWeight("aaaaaa");
			fly2 = factory.getFlyWeight("bbbbbb");
			fly3 = factory.getFlyWeight("cccccc");
			fly4 = factory.getFlyWeight("dddddd");
			fly5 = factory.getFlyWeight("aaaaaa");
			fly6 = factory.getFlyWeight("aaaaaa");
		}
		
		public void showFlyweight(){
			fly1.operation();
			fly2.operation();
			fly3.operation();
			fly4.operation();
			fly5.operation();
			fly6.operation();
			int objSize = factory.getFlyweightSize();
			System.out.println("objSize = " + objSize);
		}
	}
	
	public static void main(String[] str){
		System.out.println("ÏíÔªÄ£Ê½");
		FlyweightTest test = new FlyweightTest();
		FlyweightPattern fp = test.new FlyweightPattern();
		fp.showFlyweight();
	}
}
