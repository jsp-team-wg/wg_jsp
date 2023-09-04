package com.example.app.vo;

import java.util.Date;

public class MateVO {
	
	private int mateNum;
	private int userNum;
	private String mateCourtname;
	private String mateCourtaddr;
	private Date mateDate; 
	private String mateStarttime;
	private String mateEndtime;
	private String mateExp;
	private Double mateNtrp;
	private String mateGametype; 
	private int mateMcount;
	private int mateWcount;
	private String mateContent; 
	private int mateCommentCnt;
	private int mateAtstatus;
	private Date mateWritedate;
	private String userNickname;
	private String userGender;
	private int userExp;
	private double userNtrp;
	
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
	public String getMateCourtname() {
		return mateCourtname;
	}
	public void setMateCourtname(String mateCourtname) {
		this.mateCourtname = mateCourtname;
	}
	public String getMateCourtaddr() {
		return mateCourtaddr;
	}
	public void setMateCourtaddr(String mateCourtaddr) {
		this.mateCourtaddr = mateCourtaddr;
	}
	public Date getMateDate() {
		return mateDate;
	}
	public void setMateDate(Date mateDate) {
		this.mateDate = mateDate;
	}
	public String getMateStarttime() {
		return mateStarttime;
	}
	public void setMateStarttime(String mateStarttime) {
		this.mateStarttime = mateStarttime;
	}
	public String getMateEndtime() {
		return mateEndtime;
	}
	public void setMateEndtime(String mateEndtime) {
		this.mateEndtime = mateEndtime;
	}
	public String getMateExp() {
		return mateExp;
	}
	public void setMateExp(String mateExp) {
		this.mateExp = mateExp;
	}
	public Double getMateNtrp() {
		return mateNtrp;
	}
	public void setMateNtrp(Double mateNtrp) {
		this.mateNtrp = mateNtrp;
	}
	public String getMateGametype() {
		return mateGametype;
	}
	public void setMateGametype(String mateGametype) {
		this.mateGametype = mateGametype;
	}
	public int getMateMcount() {
		return mateMcount;
	}
	public void setMateMcount(int mateMcount) {
		this.mateMcount = mateMcount;
	}
	public int getMateWcount() {
		return mateWcount;
	}
	public void setMateWcount(int mateWcount) {
		this.mateWcount = mateWcount;
	}
	public String getMateContent() {
		return mateContent;
	}
	public void setMateContent(String mateContent) {
		this.mateContent = mateContent;
	}
	public int getMateCommentCnt() {
		return mateCommentCnt;
	}
	public void setMateCommentCnt(int commentCnt) {
		this.mateCommentCnt = commentCnt;
	}
	public int getMateAtstatus() {
		return mateAtstatus;
	}
	public void setMateAtstatus(int atstatus) {
		this.mateAtstatus = atstatus;
	}
	public Date getMateWritedate() {
		return mateWritedate;
	}
	public void setMateWritedate(Date mateWritedate) {
		this.mateWritedate = mateWritedate;
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
	@Override
	public String toString() {
		return "MateVO [mateNum=" + mateNum + ", userNum=" + userNum + ", mateCourtname=" + mateCourtname
				+ ", mateCourtaddr=" + mateCourtaddr + ", mateDate=" + mateDate + ", mateStarttime=" + mateStarttime
				+ ", mateEndtime=" + mateEndtime + ", mateExp=" + mateExp + ", mateNtrp=" + mateNtrp + ", mateGametype="
				+ mateGametype + ", mateMcount=" + mateMcount + ", mateWcount=" + mateWcount + ", mateContent="
				+ mateContent + ", commentCnt=" + mateCommentCnt + ", atstatus=" + mateAtstatus + ", mateWritedate="
				+ mateWritedate + ", userNickname=" + userNickname + ", userGender=" + userGender + ", userExp="
				+ userExp + ", userNtrp=" + userNtrp + "]";
	}
	
	
}
