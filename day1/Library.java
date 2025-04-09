package week2.day1;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added Successfully");
		return  "bookTitle";
	}

	  public void issuueBook() {
		  System.out.println("Book issued Successfully");
	  }
	public static void main(String[] args) {
		Library libraryFunctions= new Library();
		libraryFunctions.addBook("bookTitle");
		libraryFunctions.issuueBook();		
	
	}

}
