package com.example.app.vo;

import java.util.Date;

public class QnaViewDetailVo {

	private int qnaNum;
	private int userNum;
	
	private String qnaTitle;
	private String userNickname;
	private String userGender;
	private String userNTRP;
	private String userExp;
	private Date qnaWriteDate;
	private String qnaContent;
	private int QnaViewCnt;
	private int qnaCommentCnt;
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
	public String getQnaTitle() {
		return qnaTitle;
	}
	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
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
	public String getUserNTRP() {
		return userNTRP;
	}
	public void setUserNTRP(String userNTRP) {
		this.userNTRP = userNTRP;
	}
	public String getUserExp() {
		return userExp;
	}
	public void setUserExp(String userExp) {
		this.userExp = userExp;
	}
	public Date getQnaWriteDate() {
		return qnaWriteDate;
	}
	public void setQnaWriteDate(Date qnaWriteDate) {
		this.qnaWriteDate = qnaWriteDate;
	}
	public String getQnaContent() {
		return qnaContent;
	}
	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}
	public int getQnaViewCnt() {
		return QnaViewCnt;
	}
	public void setQnaViewCnt(int qnaViewCnt) {
		QnaViewCnt = qnaViewCnt;
	}
	public int getQnaCommentCnt() {
		return qnaCommentCnt;
	}
	public void setQnaCommentCnt(int qnaCommentCnt) {
		this.qnaCommentCnt = qnaCommentCnt;
	}
	@Override
	public String toString() {
		return "QnaViewDetailVo [qnaNum=" + qnaNum + ", userNum=" + userNum + ", qnaTitle=" + qnaTitle
				+ ", userNickname=" + userNickname + ", userGender=" + userGender + ", userNTRP=" + userNTRP
				+ ", userExp=" + userExp + ", qnaWriteDate=" + qnaWriteDate + ", qnaContent=" + qnaContent
				+ ", QnaViewCnt=" + QnaViewCnt + ", qnaCommentCnt=" + qnaCommentCnt + "]";
	}
	
	
	
	
}
