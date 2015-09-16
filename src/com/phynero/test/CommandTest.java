package com.phynero.test;

public class CommandTest {
	public interface ICommand{
		void exec();
	}
	public class Water implements ICommand{
		public void exec(){
			System.out.println("方法1");
		}
	}
	
	public class Weed implements ICommand{
		public void exec(){
			System.out.println("方法2");
		}
	}
	
	public class CommandInvoker{
		public void invoke(ICommand cmd){
			cmd.exec();
		}
	}
	
	public static void main(String[] str){
		System.out.println("命令模式");
		CommandTest test = new CommandTest();
		CommandInvoker ci = test.new CommandInvoker();
		ci.invoke(test.new Water());
		ci.invoke(test.new Weed());
	}
}
