package com.phynero.test;

public class BridgeTest {
	public abstract class Clothing{
		public abstract void dressCloth(Person person);
	}
	
	public class Clothing1 extends Clothing{
		@Override
		public void dressCloth(Person person) {
			System.out.println("上");
		}
	}
	public class Clothing2 extends Clothing{
		@Override
		public void dressCloth(Person person) {
			System.out.println("下");
		}
	}
	
	
	public abstract class Person{
		private String type;
		private Clothing clothing;
		public String getType(){
			return type;
		}
		public void setType(String type){
			this.type=type;
		}
		public Clothing getClothing(){
			return clothing;
		}
		public void setClothing(Clothing clothing){
			this.clothing = clothing;
		}
		public abstract void dress();
	}
	
	public class Person1 extends Person{
		public Person1(){
			System.out.println("ps1");
		}
		
		@Override
		public void dress() {
			 getClothing().dressCloth(this);
		}
	}
	public class Person2 extends Person{
		public Person2(){
			System.out.println("ps2");
		}

		@Override
		public void dress() {
			 getClothing().dressCloth(this);
		}
	}
	
	
//	public static void main(String[] str){
//		System.out.println("桥接模式");
//		BridgeTest test = new BridgeTest();
//		Person ps1 = test.new Person1();
//		Person ps2 = test.new Person2();
//		
//		Clothing cth1 = test.new Clothing1();
//		Clothing cth2 = test.new Clothing2();
//		
//		cth1.dressCloth(ps1);
//		cth1.dressCloth(ps2);
//		cth2.dressCloth(ps1);
//		cth2.dressCloth(ps2);
//		
//	}
}
