package com.example.app.dto;

import java.util.Date;

public class FreeCommentDTO {
	
//	comment_num INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
//    freeboard_num INT NOT NULL,
//    user_num INT NOT NULL,
//    comment_content TEXT NOT NULL,
//    comment_writedate DATETIME NOT null DEFAULT CURRENT_TIMESTAMP,
	
	  private int commentNum;
	  private int freeboardNum;
	  private int userNum;
	  private String commentContent;
	  private Date commentWriteDate;
	  
	  public FreeCommentDTO() {;}
	  
	public int getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}
	public int getFreeboardNum() {
		return freeboardNum;
	}
	public void setFreeboardNum(int freeboardNum) {
		this.freeboardNum = freeboardNum;
	}
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public Date getCommentWriteDate() {
		return commentWriteDate;
	}
	public void setCommentWriteDate(Date commentWriteDate) {
		this.commentWriteDate = commentWriteDate;
	}

	@Override
	public String toString() {
		return "FreeCommentDTO [commentNum=" + commentNum + ", freeboardNum=" + freeboardNum + ", userNum=" + userNum
				+ ", commentContent=" + commentContent + ", commentWriteDate=" + commentWriteDate + "]";
	}
	  
	
	  
	 
	

}
