package com.example.app.dto;

import java.util.Date;

public class QnaCommentDTO {

	int commentNum;
	int qnaNum;
	int userNum;
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
		return "QnaCommentDTO [commentNum=" + commentNum + ", qnaNum=" + qnaNum + ", userNum=" + userNum
				+ ", commentContent=" + commentContent + ", commentWritedate=" + commentWritedate + "]";
	}

	

}
