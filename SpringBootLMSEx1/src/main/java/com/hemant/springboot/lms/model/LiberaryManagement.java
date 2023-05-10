package com.hemant.springboot.lms.model;

import jakarta.persistence.*;

@Entity
@Table(name="liberary_mgmt")
public class LiberaryManagement {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private Long id;
private String bookName;
private String authName;
private int bookId;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthName() {
	return authName;
}
public void setAuthName(String authName) {
	this.authName = authName;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public LiberaryManagement(String bookName, String authName, int bookId) {
	super();
	this.bookName = bookName;
	this.authName = authName;
	this.bookId = bookId;
}
public LiberaryManagement() {
	
}

}
