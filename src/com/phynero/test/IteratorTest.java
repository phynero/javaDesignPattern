package com.phynero.test;

public class IteratorTest {
	public interface Iterator{
		public abstract boolean hasNext();
		public abstract Object next();
	}
	
	public interface Aggregate{
		public abstract Iterator iterator();
	}
	
	public class Book{
		private String name = "";
		public Book(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
	}
	
	public class BookShelf implements Aggregate{
		private Book[] books;
		private int last = 0;
		public BookShelf(int maxSize){
			this.books = new Book[maxSize];
		}
		public Book getBookAt(int index){
			return books[index];
		}
		public void appendBook(Book book){
			this.books[last] = book;
			last++;
		}
		public int getLength(){
			return books.length;
		}
		@Override
		public Iterator iterator() {
			return new BookShelfIterator(this);
		}
	}
	
	public class BookShelfIterator implements Iterator{
		private BookShelf bookShelf;
		private int index;
		
		public  BookShelfIterator(BookShelf bookShelf){
			this.bookShelf = bookShelf;
			this.index = 0;
		}
		@Override
		public boolean hasNext() {
			if(index < bookShelf.getLength()){
				return true;
			}else{
				return false;
			}
		}
		@Override
		public Object next() {
			Book book = bookShelf.getBookAt(index);
			index ++;
			return book;
		}
	}
	
	public static void main(String[] str){
		System.out.println("µü´úÆ÷Ä£Ê½");
		IteratorTest test = new IteratorTest();
		BookShelf bs = test.new BookShelf(4);
		bs.appendBook(test.new Book("aaaaaaa"));
		bs.appendBook(test.new Book("bbbbbbb"));
		bs.appendBook(test.new Book("ccccccc"));
		bs.appendBook(test.new Book("ddddddd"));
		
		Iterator it = bs.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}