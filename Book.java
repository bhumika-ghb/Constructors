public class Book{
	String title;
	String author;
	public Book(String Btitle,String Bauthor){
		this.title=Btitle;
		this.author=Bauthor;
	}
	public void display(){
		System.out.println(title +" " +author + " ");
	}
	public static void main(String[] args){
		Book b1=new Book("The Art of not Overthinking","Shaurya Kapoor");
		b1.display();
	}
}