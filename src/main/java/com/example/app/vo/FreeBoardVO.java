package com.example.app.vo;

import java.util.Date;

public class FreeBoardVO {

	private int userNum;
	private String userNickname;
	private String userGender;
	private int userExp;
	private double userNtrp;
	private int freeboardNum;
	private String freeboardTitle;
	private String freeboardContent;
	private int freeboardViewCnt;
	private int freeboardCommentCnt;
	private Date freeboardWriteDate;
	
	public FreeBoardVO() {
		super();
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
	
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public int getUserExp() {
		return userExp;
	}
	public void setUserExp(int userExp) {
		this.userExp = userExp;
	}
	public double getUserNtrp() {
		return userNtrp;
	}
	public void setUserNtrp(double userNtrp) {
		this.userNtrp = userNtrp;
	}
	
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
		return "FreeBoardVO [userNum=" + userNum + ", userNickname=" + userNickname + ", userGender=" + userGender
				+ ", userExp=" + userExp + ", userNtrp=" + userNtrp + ", freeboardNum=" + freeboardNum
				+ ", freeboardTitle=" + freeboardTitle + ", freeboardContent=" + freeboardContent
				+ ", freeboardViewCnt=" + freeboardViewCnt + ", freeboardCommentCnt=" + freeboardCommentCnt
				+ ", freeboardWriteDate=" + freeboardWriteDate + "]";
	}
	
	
	
	
	
}
