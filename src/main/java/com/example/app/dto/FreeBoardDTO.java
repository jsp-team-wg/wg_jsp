package com.example.app.dto;

import java.util.Date;

public class FreeBoardDTO {
	
//	freeboard_num INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
//    user_num INT NOT NULL,
//    freeboard_title VARCHAR(300) NOT NULL,
//    freeboard_content TEXT NOT NULL,
//    freeboard_viewcnt INT DEFAULT 0,
//    freeboard_commentcnt INT DEFAULT 0,
//    freeboard_writedate DATETIME NOT null DEFAULT CURRENT_TIMESTAMP,
	
	private int freeboardNum;
	private String freeboardTitle;
	private String freeboardContent;
	private int freeboardViewCnt;
	private int freeboardCommentCnt;
	private Date freeboardWriteDate;
	
	public FreeBoardDTO() {;}

	

	public int getFreeboardNum() {
		return freeboardNum;
	}



	public void setFreeboardNum(int freeboardNum) {
		this.freeboardNum = freeboardNum;
	}



	public String getFreeboardTitle() {
		return freeboardTitle;
	}



	public void setFreeboardTitle(String freeboardTitle) {
		this.freeboardTitle = freeboardTitle;
	}



	public String getFreeboardContent() {
		return freeboardContent;
	}



	public void setFreeboardContent(String freeboardContent) {
		this.freeboardContent = freeboardContent;
	}



	public int getFreeboardViewCnt() {
		return freeboardViewCnt;
	}



	public void setFreeboardViewCnt(int freeboardViewCnt) {
		this.freeboardViewCnt = freeboardViewCnt;
	}



	public int getFreeboardCommentCnt() {
		return freeboardCommentCnt;
	}



	public void setFreeboardCommentCnt(int freeboardCommentCnt) {
		this.freeboardCommentCnt = freeboardCommentCnt;
	}



	public Date getFreeboardWriteDate() {
		return freeboardWriteDate;
	}



	public void setFreeboardWriteDate(Date freeboardWriteDate) {
		this.freeboardWriteDate = freeboardWriteDate;
	}



	@Override
	public String toString() {
		return "FreeBoardDTO [freeboardNum=" + freeboardNum + ", freeboardTitle=" + freeboardTitle
				+ ", freeboardContent=" + freeboardContent + ", freeboardViewCnt=" + freeboardViewCnt
				+ ", freeboardCommentCnt=" + freeboardCommentCnt + ", freeboardWriteDate=" + freeboardWriteDate + "]";
	}
	
	
	

}
