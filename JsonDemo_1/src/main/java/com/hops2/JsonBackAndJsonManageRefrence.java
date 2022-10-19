package com.hops2;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonBackAndJsonManageRefrence {
	public static void main(String args[]) throws IOException, ParseException {
	      ObjectMapper mapper = new ObjectMapper();     
	      Student4 student = new Student4(1, "Mark");
	      Book book1 = new Book(101,"Learn HTML", student);
	      Book book2 = new Book(102,"Learn JAVA", student);

	      student.addBook(book1);
	      student.addBook(book2);

	      String jsonString = mapper
	         .writerWithDefaultPrettyPrinter()
	         .writeValueAsString(book2);
	      System.out.println(jsonString);
	   }
	}
	
class Book {
	   public int id;
	   public String name;

	   Book(int id, String name, Student4 owner) {
	      this.id = id;
	      this.name = name;
	      this.owner = owner;
	   }

	   @JsonManagedReference
	   public Student4 owner;
	}

class Student4 { 
	   public int rollNo;
	   public String name;

	   @JsonBackReference
	   public List<Book> books;

	   Student4(int rollNo, String name){
	      this.rollNo = rollNo;
	      this.name = name;
	      this.books = new ArrayList<Book>();
	   }
	   public void addBook(Book book){
	      books.add(book);
	   }
	}
	
















