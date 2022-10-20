import java.util.ArrayList;
public class LibraryTester{
	public static void main(String[] args){
		Library library = new Library();
		library.insertBook("Learn Java", "Timothy C. Needham");
		library.insertBook("Java Script", "Joshua Bloch");
		library.insertBook("Java complete Reference", "Herbert Schildt");
		library.insertBook("Core Java", "Cay Horstmann");
		System.out.println(library.changeTitle(10002, "Effective Java"));
		System.out.println(library.changeTitle(10007, "C++"));
		System.out.println(library);

	}
}


class Library{
	private ArrayList<Book> books;
	public Library(){
		books = new ArrayList<Book>();
	}
	
	public boolean changeTitle(long isbn, String title){
		for(Book b: books){
			if(b.getIsbn()==isbn){
				b.setTitle(title);
				return true;
			}
		}
		return false;

	}
	public void insertBook(String title, String author){
		if(books.size()==0){
			books.add(new Book(title,author));
			return;
		}
		for(int i=0; i<books.size() ; i++){
			if(books.get(i).getTitle().compareTo(title)>0){
				books.add(i, new Book(title, author));
				return;
			}
		}
		return;
	}
	public String toString(){
		return books.toString();
		
	}

}



class Book{
	private String title;
	private String author;
	private long isbn;
	private static long count=10001;
	
	public Book(String title, String author){
		isbn=count++;
		this.title=title;
		this.author = author;

	}
	
	public String getTitle(){
		return title;
	}
	public long getIsbn(){
		return isbn;
	}
	public void setTitle(String newTitle){
		title = newTitle;
	}
	public String toString(){
		return "[isbn:"+isbn+", title:"+title+", author:"+author+"]";
	}

}
