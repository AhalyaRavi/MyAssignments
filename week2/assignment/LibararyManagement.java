package week2.assignment;

public class LibararyManagement {

	public static void main(String[] args) {
		Library L1 = new Library();
		String BookTitle = L1.addBook("Room number 106");
		System.out.println("The Book name is "+BookTitle);
		L1.issueBook();
		// TODO Auto-generated method stub

	}

}
