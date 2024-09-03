package week2.assignment;

public class Library {
	
public String addBook(String BookTitle)
{
	System.out.println("Book Added Successfully");
return BookTitle;
}
	
public void issueBook()
{
	System.out.println("Book Issued Successfully");
return;
}

	public static void main(String[] args) {
		Library L = new Library();
		String BookTitle = L.addBook("HarryPotter");
		System.out.println("The Book name is "+BookTitle);
		L.issueBook();
		
	}

}
