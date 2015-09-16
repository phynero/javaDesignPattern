package com.phynero.test;

public class InterpreterTest {
	public class Context{
		private String data;
		public void setData(String str){
			this.data = str;
		}
		public String getData(){
			return this.data;
		}
	}
	
	public interface Interpreter{
		public void interpret(Context context);
	}
	
	public class XmlSaxInterpreter implements Interpreter{

		@Override
		public void interpret(Context context) {
			System.out.println("xml sax Interpreter : " + context.getData());
		}
	}
	
	public class XmlDomInterpreter implements Interpreter{

		@Override
		public void interpret(Context context) {
			System.out.println("xml dom Interpreter : " + context.getData());
		}
	}
	
	public static void main(String[] str){
		System.out.println("解释器模式");
		InterpreterTest test = new InterpreterTest();
		Context context = test.new Context();
		context.setData("some XXX XML数据");
		Interpreter interpreter1 = test.new XmlSaxInterpreter();
		interpreter1.interpret(context);
		Interpreter interpreter2 = test.new XmlDomInterpreter();
		interpreter2.interpret(context);
	}
}
