package com.phynero.test;

import java.util.Enumeration;
import java.util.Vector;

public class ObserverTest {
	public interface Observer{
		public void update();
	}
	
	public class Observer1 implements Observer{
		@Override
		public void update(){
			System.out.println("observer1 has received");
		}
	}
	
	public class Observer2 implements Observer{
		@Override
		public void update() {
			System.out.println("observer2 has received");
		}
	}
	
	public interface Subject{
		public void add(Observer observer);
		public void del(Observer observer);
		public void notifyObservers();
		public void operation();
	}
	
	public abstract class AbstractSubject implements Subject{
		private Vector<Observer> vector = new Vector<Observer>();
		@Override
		public void add(Observer observer){
			vector.add(observer);
		}
		@Override
		public void del(Observer observer){
			vector.remove(observer);
		}
		@Override
		public void notifyObservers(){
			Enumeration<Observer> enumo = vector.elements();
			while(enumo.hasMoreElements()){
				enumo.nextElement().update();
			}
		}
	}
	
	public class MySubject extends AbstractSubject{
		@Override
		public void operation(){
			System.out.println("update self!");
			notifyObservers();
		}
	}
	
	public static void main(String[] str){
		System.out.println("观察者模式");
		ObserverTest test = new ObserverTest();
		Subject sub = test.new MySubject();
		sub.add(test.new Observer1());
		sub.add(test.new Observer2());
		sub.operation();
	}
}
