package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> bookList = new ArrayList();
	
	{
		bookList.add(new Book("자바의정석", "남궁성", "기타", 20000)); 
		bookList.add(new Book("쉽게  배우는  알고리즘", "문병로", "기타", 15000)); 
		bookList.add(new Book("대화의  기술", "강보람", "인문", 17500)); 
		bookList.add(new Book("암  정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook (Book bk) {
		bookList.add(bk);
	}
		
	public List<Book> selectList() {
		return bookList;
	}
	
	public List<Book> searchBook(String keyword) {
		List<Book> searchList = new ArrayList();
		
		for(int i=0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			if (book.getTitle().contains(keyword) ||
				book.getCategory().contains(keyword) ||
				book.getAuthor().contains(keyword)) {
				searchList.add(book);
			}
		}
		return searchList;
		
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		
		for(int i=0; i<bookList.size(); i++) {
			if(title.equals(bookList.get(i).getTitle()) &&
			   author.equals(bookList.get(i).getAuthor())) {
				bookList.remove(bookList.get(i));
				removeBook = bookList.get(i);
			}
		}
		return removeBook;
	}
	
	public void ascBook() {}
}
