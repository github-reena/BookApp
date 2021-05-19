package com.example.BooksApplication.model;

import java.util.Date;

public class Book {
	
	private String Title;
	private String Authors;
	private String isbn;
	private Date PublicationDate;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthors() {
		return Authors;
	}
	public void setAuthors(String authors) {
		Authors = authors;
	}
	public Date getPublicationDate() {
		return PublicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		PublicationDate = publicationDate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	
	
	

}
