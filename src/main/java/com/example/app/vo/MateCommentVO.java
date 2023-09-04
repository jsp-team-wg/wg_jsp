package com.example.app.vo;

import java.util.Date;

public class MateCommentVO {
	
	private int commentNum;
	private int mateNum;
	private int userNum;
	private String userNickname; 
	private String commentContent;
	private Date commentWritedate;
	
	
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
		return "MateCommentVO [commentNum=" + commentNum + ", mateNum=" + mateNum + ", userNum=" + userNum
				+ ", userNickname=" + userNickname + ", commentContent=" + commentContent + ", commentWritedate="
				+ commentWritedate + "]";
	}
	
	
	
}
