package com.phynero.test;

public class StateTest {
	public class State{
		private String value;
		public String getVlaue(){
			return value;
		}
		public void setValue(String value){
			this.value = value;
		}
		public void method1(){
			System.out.println("execute the first opt");
		}
		public void method2(){
			System.out.println("execute the second opt");
		}
	}
	
	public class Context{
		private State state;
		public Context(State state){
			this.state = state;
		}
		public State getState(){
			return state;
		}
		public void setState(State state){
			this.state = state;
		}
		public void method(){
			if(state.getVlaue().equals("state1")){
				state.method1();
			}else if(state.getVlaue().equals("state2")){
				state.method2();
			}
		}
	}
	
	public static void main(String[] str){
		System.out.println("״̬ģʽ");
		StateTest test = new StateTest();
		State state = test.new State();
		Context context = test.new Context(state);
		
		state.setValue("state1");
		context.method();
		state.setValue("state2");
		context.method();
	}
}
