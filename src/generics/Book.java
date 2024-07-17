package generics;

import java.io.Serializable;

public class Book implements Serializable {
	
	String name;
	String author;
	float price;
	String publication;
	
	public Book() {}
	
	public Book(String name, String author, float price, String publication) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", publication=" + publication + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	

}
