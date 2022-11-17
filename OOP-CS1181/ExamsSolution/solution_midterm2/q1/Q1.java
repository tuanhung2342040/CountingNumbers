import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q1{
	public static void main(String[] args) {
	 	Sorter sorter = new Sorter();
	 	sorter.sort();
	} 	
}
//----
class Sorter{
	private ArrayList<Book> books;
	
	public Sorter(){
		books = new ArrayList<Book>();
		books.add(new Book("Java"));
		books.add(new Book("c++"));
		books.add(new Book("Html"));
		books.add(new Book("java script"));
		
	}
	//----
	public void sort(){
		Collections.sort(books,new TitleComparator());
	}
	//----
	private class TitleComparator implements Comparator<Book>{
		public int compare(Book b1, Book b2){
			if(b1.getTitle().toLowerCase().compareTo(b2.getTitle().toLowerCase())<0)
				return -1;
			if(b1.getTitle().toLowerCase().compareTo(b2.getTitle().toLowerCase())>0)
				return 1;
			return 0;
		}
	}
}
//----
final class Book{
	private String title;
	public Book(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
}