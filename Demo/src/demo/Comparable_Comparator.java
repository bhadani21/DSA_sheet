package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Comparator {

	public static void main(String[] args) {
		
		List<Book> book=new ArrayList<Book>();
		book.add(new Book("Effective Java","Ruchi Bhadani",100));
		book.add(new Book("Java python","Rekha Bhadani",50));
		book.add(new Book("New Era","Liza Bhadani",400));
		book.add(new Book("Organisation","Deepak Bhadani",900));
		book.add(new Book("divine","Rishu Bhadani",300));
		System.out.println(book);
		Collections.sort(book);
		System.out.println(book.toString());
		
		Comparator<Book> byAuthor=(b1,b2)->b1.getAuthor().compareTo(b2.getAuthor());
		Collections.sort(book,byAuthor);
		System.out.println("based on author="+book);
		
		
		Comparator<Book> byTitle =(b1,b2)->b1.getTitle().compareTo(b2.getTitle());
		Collections.sort(book,byTitle);
		System.out.println("based on title"+ book);
		//using method refrence
		Comparator<Book> multichain=Comparator.comparing(Book::getTitle).thenComparing(Book::getAuthor).thenComparing(Book::getPrice);
		Collections.sort(book,multichain);
		System.out.println("based on multi chain="+book);
	}

}
class Book implements Comparable<Book>{
	
	private String title;
	private String author;
	private int price;
	
	

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}



	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public int compareTo(Book b) {
//		if(this.title.compareTo(b.title)>0) return 1;
//		else if(this.title.compareTo(b.title)<0) return -1;
//		else {
//			if(this.author.compareTo(b.author)>0) return 1;
//			else if(this.author.compareTo(b.author)<0) return -1;
//			else return 0;
//		}
//		int i=this.title.compareTo(b.title);
//		if(i!=0) return i;
//		i=this.author.compareTo(b.author);
//		if(i!=0) return i;
//		return this.price-b.price;
//		return this.price-b.price;
//		int i=this.title.compareTo(b.title);
//		if(i!=0) return i;
//		else return 0;
		return (this.title.compareToIgnoreCase(b.title))>0?1:(this.title.compareToIgnoreCase(b.title))<0?-1:0;
	}



	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	
}
