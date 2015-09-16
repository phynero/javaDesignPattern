package com.phynero.test;

public class strategyTest {
	public interface ICalculator{
		public int calculate(String exp);
	}
	
	public abstract class AbstractCalculator{
		public int[] split(String exp,String opt){
			String array[] = exp.split(opt);
			int arrayInt[] = new int[2];
			arrayInt[0] = Integer.parseInt(array[0]);
			arrayInt[1] = Integer.parseInt(array[1]);
			return arrayInt;
		}
	}
	
	public class Plus extends AbstractCalculator implements ICalculator{
		@Override
		public int calculate(String exp){
			int arrayInt[] = split(exp,"\\+");
			return arrayInt[0] + arrayInt[1];
		}
	}
	
	public class Minus extends AbstractCalculator implements ICalculator{
		@Override
		public int calculate(String exp){
			int arrayInt[] = split(exp,"-");
			return arrayInt[0] - arrayInt[1];
		}
	}
	
	public class Multiply extends AbstractCalculator implements ICalculator{
		@Override
		public int calculate(String exp){
			int arrayInt[] = split(exp,"\\*");
			return arrayInt[0]*arrayInt[1];
		}
	}
	
	public static void main(String[] str){
		System.out.println("²ßÂÔÄ£Ê½");
		strategyTest test = new strategyTest();
		String exp = "8*2";
		ICalculator cal = test.new Multiply();
		int result = cal.calculate(exp);
		System.out.println(result);
	}
	
}
