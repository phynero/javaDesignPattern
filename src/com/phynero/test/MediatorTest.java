package com.phynero.test;

public class MediatorTest {
	public interface Mediator{
		public void createMediator();
		public void workAll();
	}
	
	public class MyMediator implements Mediator{
		private User user1;
		private User user2;
		
		public User getUser1(){
			return user1;
		}
		public User getUser2(){
			return user2;
		}
		@Override
		public void createMediator() {
			user1 = new User1(this);
			user2 = new User2(this);
		}
			
		@Override
		public void workAll() {
			user1.work();
			user2.work();
		}		
	}
	
	public abstract class User{
		private Mediator mediator;
		public Mediator getMediator(){
			return mediator;
		}
		public User(Mediator mediator){
			this.mediator = mediator;
		}
		public abstract void work();
	}
	
	public class User1 extends User{
		public User1(Mediator mediator){
			super(mediator);
		}
		@Override
		public void work() {
			System.out.println("user1 exed");
		}
	}

	public class User2 extends User{
		public User2(Mediator mediator){
			super(mediator);
		}
		@Override
		public void work() {
			System.out.println("user2 exed");
		}
	}
	
	public static void main(String[] str){
		System.out.println("中介者模式");
		MediatorTest test = new MediatorTest();
		MyMediator mediator = test.new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}
