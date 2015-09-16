package com.phynero.test;

public class VisitorTest {
	public interface Visitor{
		public void visit(Subject sub);
	}
	
	public class MyVisitor implements Visitor{
		@Override
		public void visit(Subject sub){
			System.out.println("visit the subject: "+sub.getSubject());
		}
	}
	
	public interface Subject{
		public void accept(Visitor visitor);
		public String getSubject();
	}
	
	public class MySubject implements Subject{
		@Override
		public void accept(Visitor visitor){
			visitor.visit(this);
		}
		public String getSubject(){
			return "hhh";
		}
	}
	
	public static void main(String[] args){
		System.out.println("访问者模式");
		VisitorTest test = new VisitorTest();
		Visitor visit = test.new MyVisitor();
		Subject subject = test.new MySubject();
		subject.accept(visit);
	}
}
