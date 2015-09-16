package com.phynero.test;

import java.util.List;
import java.util.ArrayList;

public class CompositeTest {
	public abstract class Company {  
	    private String name;  
	  
	    public Company(String name) {  
	        this.name = name;  
	    }  
	  
	    public Company() {  
	    }  
	  
	    public String getName() {  
	        return name;  
	    }  
	  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	  
	    protected abstract void add(Company company);  
	  
	    protected abstract void romove(Company company);  
	  
	    protected abstract void display(int depth);  
	}  
	
	public class ConcreteCompany extends Company {
		private List<Company> cList;  
	    public ConcreteCompany() {  
	        cList = new ArrayList<Company>();  
	    }

	    public ConcreteCompany(String name) {  
	        super(name);   
	        cList = new ArrayList<Company>() ;   
	    }  
	    
		@Override
		protected void add(Company company) {
			cList.add(company);
		}

		@Override
		protected void romove(Company company) {
	        cList.remove(company);
		}

		@Override
		protected void display(int depth) {
	        StringBuilder sb = new StringBuilder("");  
	        for (int i = 0; i < depth; i++) {  
	            sb.append("-");   
	        }  
	        System.out.println(new String(sb) + this.getName());  
	        for (Company c : cList) {  
	            c.display(depth + 2);  
	        }  
	    }
	}
	
	public class FinanceDepartment extends Company {  
	      
	      
	    public FinanceDepartment(){  
	          
	    }  
	      
	    public FinanceDepartment(String name){  
	        super(name);  
	    }  
	      
	    @Override  
	    protected void add(Company company) {  
	  
	    }  
	  
	    @Override  
	    protected void display(int depth) {  
	        StringBuilder sb = new StringBuilder("");  
	        for (int i = 0; i < depth; i++) {  
	            sb.append("-");  
	        }  
	        System.out.println(new String(sb) + this.getName() ) ;   
	    }  
	  
	    @Override  
	    protected void romove(Company company) {  
	          
	    }  
	      
	}  
	
	public class HRDepartment extends Company {  
	      
	      
	    public HRDepartment(){  
	          
	    }  
	      
	    public HRDepartment(String name){  
	        super(name);  
	    }  
	      
	    @Override  
	    protected void add(Company company) {  
	  
	    }  
	  
	    @Override  
	    protected void display(int depth) {  
	        StringBuilder sb = new StringBuilder("");  
	        for (int i = 0; i < depth; i++) {  
	            sb.append("-");   
	        }  
	        System.out.println(new String(sb) + this.getName() ) ;   
	    }  
	  
	    @Override  
	    protected void romove(Company company) {
	    }
	}
	
	
//	public static void main(String[] str){
//		System.out.println("���ģʽ");
//		CompositeTest test = new CompositeTest();
//        Company root = test.new ConcreteCompany();
//        root.setName("�����ܹ�˾");  
//        root.add(test.new HRDepartment("�ܹ�˾������Դ��"));  
//        root.add(test.new FinanceDepartment("�ܹ�˾����"));  
//		
//		
//	}
}
