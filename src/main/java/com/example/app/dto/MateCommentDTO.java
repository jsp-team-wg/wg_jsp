package com.example.app.dto;

import java.util.Date;

public class MateCommentDTO {
	
	int commentNum;
	int mateNum;
	int userNum;
	String commentContent;
	Date commentWritedate;
	
	public int getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}
	public int getMateNum() {
		return mateNum;
	}
	public void setMateNum(int mateNum) {
		this.mateNum = mateNum;
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
	public Date getCommentWritedate() {
		return commentWritedate;
	}
	public void setCommentWritedate(Date commentWritedate) {
		this.commentWritedate = commentWritedate;
	}
	
	@Override
	public String toString() {
		return "MateCommentDTO [commentNum=" + commentNum + ", mateNum=" + mateNum + ", userNum=" + userNum
				+ ", commentContent=" + commentContent + ", commentWritedate=" + commentWritedate + "]";
	}
	
	
	
	
}
