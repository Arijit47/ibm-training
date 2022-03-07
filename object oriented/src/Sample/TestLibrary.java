package Sample;

import com.ibm.lib.Book;
import com.ibm.lib.LibraryException;
import com.ibm.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist");

		Member m1 = new Member("George");
		Member m2 = new Member("Jack");
		try {
			b1.issueBook(m1);
		} catch (LibraryException e1) {
			System.out.println(e1.getMessage());
		}

		try {
			b1.returnBook(m1);
		} catch (LibraryException e2) {
			System.out.println(e2.getMessage());
		}

		try {
			b1.issueBook(m2);
		} catch (LibraryException e3) {
			System.out.println(e3.getMessage());
		}

		try {
			b1.returnBook(m2);
		} catch (LibraryException e4) {
			System.out.println(e4.getMessage());
		}
		b1.status();
		m1.status();

//		b1.issueBook(m1);
//		
//		b1.status();
//		m1.status();
//		
//		b1.issueBook(m2);
//		
//		b1.returnBook(m1);
//		
//		b1.status();
//		m1.status();
//		
//		b1.returnBook(m2);
	}
}
