package com.kh.practice.list.library.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;
public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {
		while(true) {
			System.out.println("== Welcome KH Library ==");
			System.out.println("메인 메뉴입니다.");
			System.out.println("1. 새도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
		
		
		
	}

	public void insertBook() {
		System.out.println();
		System.out.println("==== 새 도서 추가 ====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.println("도서명 : ");
		String bookName = sc.nextLine();
		
		System.out.println("저자명 : ");
		String authorName = sc.nextLine();
		
		System.out.println("장르 (1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int categoryNum = sc.nextInt();
	
		System.out.println("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		String category = "";
		
		switch (categoryNum) {
			case 1 : category = "인문"; break;
			case 2 : category = "과학"; break;
			case 3 : category = "외국어"; break;
			case 4 : category = "기타"; break;
		}
		
		Book bk = new Book(bookName, authorName, category, price);
		bc.insertBook(bk);
		
	}

	public void selectList() {
		System.out.println();
		System.out.println("==== 도서 전체 조회 ====");
		
		List<Book> book = bc.selectList();
		
		if(book.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(Book b : book) {
				System.out.println("("+b.getTitle() 
								+ "/" + b.getAuthor()
								+ "/" + b.getCategory()
								+ "/" + b.getPrice() + ")");
			}
		}
	}

	public void searchBook() {
		System.out.println("==== 도서 검색 ====");
		System.out.println("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		List<Book> searchList = bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book b : searchList) {
				System.out.println("(" + b.getTitle() +"/"
									   + b.getAuthor() + "/"
									   + b.getCategory() + "/"
									   + b.getPrice() + ")");
			}
			System.out.println();
		}
	}

	public void deleteBook() {
		System.out.println();
		System.out.println("==== 도서 삭제 ====");
		System.out.println("삭제할 도서 명 : ");
		String title = sc.nextLine();
		
		System.out.println("삭제할 저자 명 : ");
		String author = sc.nextLine();
		
		Book removebook = bc.deleteBook(title,  author);
		
		if(removebook != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다");
		}
	}

	public void ascBook() {
	}

}
