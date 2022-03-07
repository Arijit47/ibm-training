package com.ibm.lib;

import com.ibm.bank.BalanceException;

public class Book {
	private String title;
	private Member mbr;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void status() {
		if (mbr == null)
			System.out.println(title + " is not issued to any member");
		else
			System.out.println(title + " is issued to " + mbr.getName());
	}

	public void issueBook (Member m) throws LibraryException{
		if (mbr != null)
			throw new LibraryException(title + " is already issued");
		else if (m.getBook() != null)
			throw new LibraryException(m.getName() + " had already issued a book");
		else {
			mbr = m;
			m.setBook(this);
			System.out.println("Book issued.");
		}
	}

	public void returnBook(Member m) throws LibraryException{
		if (mbr == null)
			System.out.println(title + " is not issued to anyone");
		else if (m.getBook() == null)
			throw new LibraryException(m.getName() + " had never issued a book");
		else if (!m.getBook().getTitle().equals(title))
			throw new LibraryException(m.getName() + " has not issued " + title);
		else if (!m.getName().equals(mbr.getName()))
			throw new LibraryException(title + " was not issued to " + m.getName());
		else {
			m.setBook(null);
			mbr = null;
			System.out.println("Book returned.");
		}
	}
}
