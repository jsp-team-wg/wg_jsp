package com.example.app.vo;

import java.util.Date;

public class QnaCommentVO {
	
	int commentNum;
	int qnaNum;
	int userNum;
	String userNickname; 
	String commentContent;
	Date commentWritedate;
	
	public int getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}
	public int getQnaNum() {
		return qnaNum;
	}
	public void setQnaNum(int qnaNum) {
		this.qnaNum = qnaNum;
	}
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
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
		return "QnaCommentVO [commentNum=" + commentNum + ", qnaNum=" + qnaNum + ", userNum=" + userNum
				+ ", userNickname=" + userNickname + ", commentContent=" + commentContent + ", commentWritedate="
				+ commentWritedate + "]";
	}
	
	
}
