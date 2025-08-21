package com.kh.idol.model.vo;

public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String userId;
	private String createDate;

	public Board() {
		super();
	}
	
	public Board(int boardNo, String boardTitle, String boardContent, String userId, String createDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.userId = userId;
		this.createDate = createDate;
	}

	public final int getBoardNo() {
		return boardNo;
	}

	public final void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public final String getBoardTitle() {
		return boardTitle;
	}

	public final void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public final String getBoardContent() {
		return boardContent;
	}

	public final void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public final String getUserId() {
		return userId;
	}

	public final void setUserId(String userId) {
		this.userId = userId;
	}

	public final String getCreateDate() {
		return createDate;
	}

	public final void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", userId=" + userId + ", createDate=" + createDate + "]";
	}
	
	
	
	
}
