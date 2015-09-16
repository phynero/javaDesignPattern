package com.phynero.test;

public class Builder {
	public class Product{
		private int property1 = 0;
		private int property2 = 0;
		private int property3 = 0;
		public void setproperty1(int property){
			this.property1 = property;
		}
		public void setproperty2(int property){
			this.property2 = property;
		}
		public void setproperty3(int property){
			this.property3 = property;
		}
		public void show(){
			for(int i = 0; i<3; ++i)
			{
				System.out.println("setproperty1 = "+this.property1+"\nsetproperty2 = "+this.property2+
						"\nsetproperty3 = "+this.property3);
			}
		}
	}
	
	public abstract class AbstractBuilder{
		protected Product product;
		public Product getProduct(){
			return this.product;
		}
		public void createProduct(){
			product = new Product();
		}
		public abstract void buildproperty1();
		public abstract void buildproperty2();
		public abstract void buildproperty3();
	}
	
	public class ConcreteBuilder1 extends AbstractBuilder{

		@Override
		public void buildproperty1() {
			System.out.println("product.setproperty1(11)");
			product.setproperty1(11);
		}

		@Override
		public void buildproperty2() {
			System.out.println("product.setproperty1(12)");
			product.setproperty2(12);
		}

		@Override
		public void buildproperty3() {
			System.out.println("product.setproperty1(13)");
			product.setproperty3(13);
		}
	}

	public class ConcreteBuilder2 extends AbstractBuilder{

		@Override
		public void buildproperty1() {
			System.out.println("product.setproperty1(21)");
			product.setproperty1(21);
		}

		@Override
		public void buildproperty2() {
			System.out.println("product.setproperty1(22)");
			product.setproperty2(22);
		}

		@Override
		public void buildproperty3() {
			System.out.println("product.setproperty1(23)");
			product.setproperty3(23);
		}
	}
	
	public class Director{
		private AbstractBuilder abstractBuilder;
		public void setBuilder(AbstractBuilder bd){
			abstractBuilder = bd;
		}
		
		public Product getProduct(){
			return abstractBuilder.getProduct();
		}
		
		public void constructProduct(){
			abstractBuilder.createProduct();
			abstractBuilder.buildproperty1();
			abstractBuilder.buildproperty2();
			abstractBuilder.buildproperty3();
		}
	}
	
//	public static void main(String[] args){
//		System.out.println("创建者模式");
//		Builder builder = new Builder();
//		Director director = builder.new Director();
//		AbstractBuilder bd1 = builder.new ConcreteBuilder1();
//		AbstractBuilder bd2 = builder.new ConcreteBuilder2();
//		
//		director.setBuilder(bd1);
//		director.constructProduct();
//		Product pd1 = director.getProduct();
//		
//		director.setBuilder(bd2);
//		director.constructProduct();
//		Product pd2 = director.getProduct();
//	}
}
