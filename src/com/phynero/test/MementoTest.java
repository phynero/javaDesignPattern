package com.phynero.test;

public class MementoTest {
	public class Original{
		private String value;
		public String getValue(){
			return value;
		}
		public void setValue(String value){
			this.value = value;
		}
		public Original(String value){
			this.value = value;
		}
		public Memento createMemento(){
			return new Memento(value);
		}
		public void restoreMemento(Memento memento){
			this.value = memento.getValue();
		}
	}
	
	public class Memento{
		private String value;
		public Memento(String value){
			this.value = value;
		}
		public String getValue(){
			return value;
		}
		public void setValue(String value){
			this.value = value;
		}
	}
	
	public class Storage{
		private Memento memento;
		public Storage(Memento memento){
			this.memento = memento;
		}
		public Memento getMemento(){
			return memento;
		}
		public void setMemento(Memento memento){
			this.memento = memento;
		}
	}
	
	public static void main(String[] str){
		System.out.println("����¼ģʽ");
		MementoTest test = new MementoTest();
		Original origi = test.new Original("egg");
		Storage storage = test.new Storage(origi.createMemento());
		
		System.out.println("��ʼ��״̬Ϊ:"+origi.getValue());
		origi.setValue("ogg");
		System.out.println("�޸ĺ�״̬Ϊ:"+origi.getValue());
		
		origi.restoreMemento(storage.getMemento());
		System.out.println("�ظ���״̬Ϊ:"+origi.getValue());
	}
}
