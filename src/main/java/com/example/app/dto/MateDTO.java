package com.example.app.dto;

import java.security.Timestamp;
import java.util.Date;

public class MateDTO {
	
	
	private int mateNum;
	private int userNum;
	private String mateCourtname;
	private String mateCourtddr;
	private Date mateDate; 
	private Timestamp mateStarttime;
	private Timestamp mateEndtime;
	private int mateExp;
	private int mateNtrp;
	private String mateGametype; 
	private int mateMcount;
	private int mateWcount;
	private String mateContent; 
	private int commentCnt;
	private int atstatus;
	private Date mateWritedate;
	
	//게터, 세터
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
	public String getMateCourtddr() {
		return mateCourtddr;
	}
	public void setMateCourtddr(String mateCourtddr) {
		this.mateCourtddr = mateCourtddr;
	}
	public Date getMateDate() {
		return mateDate;
	}
	public void setMateDate(Date mateDate) {
		this.mateDate = mateDate;
	}
	public Timestamp getMateStarttime() {
		return mateStarttime;
	}
	public void setMateStarttime(Timestamp mateStarttime) {
		this.mateStarttime = mateStarttime;
	}
	public Timestamp getMateEndtime() {
		return mateEndtime;
	}
	public void setMateEndtime(Timestamp mateEndtime) {
		this.mateEndtime = mateEndtime;
	}
	public int getMateExp() {
		return mateExp;
	}
	public void setMateExp(int mateExp) {
		this.mateExp = mateExp;
	}
	public int getMateNtrp() {
		return mateNtrp;
	}
	public void setMateNtrp(int mateNtrp) {
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
	public int getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}
	public int getAtstatus() {
		return atstatus;
	}
	public void setAtstatus(int atstatus) {
		this.atstatus = atstatus;
	}
	public Date getMateWritedate() {
		return mateWritedate;
	}
	public void setMateWritedate(Date mateWritedate) {
		this.mateWritedate = mateWritedate;
	}
	
	@Override
	public String toString() {
		return "MateDTO [mateNum=" + mateNum + ", userNum=" + userNum + ", mateCourtname=" + mateCourtname
				+ ", mateCourtddr=" + mateCourtddr + ", mateDate=" + mateDate + ", mateStarttime=" + mateStarttime
				+ ", mateEndtime=" + mateEndtime + ", mateExp=" + mateExp + ", mateNtrp=" + mateNtrp + ", mateGametype="
				+ mateGametype + ", mateMcount=" + mateMcount + ", mateWcount=" + mateWcount + ", mateContent="
				+ mateContent + ", commentCnt=" + commentCnt + ", atstatus=" + atstatus + ", mateWritedate="
				+ mateWritedate + "]";
	}
	
	
	
	
	
}
