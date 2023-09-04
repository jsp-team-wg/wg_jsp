package com.example.app.dto;

import java.util.Date;

public class NoticeDTO {

	int noticeNum;
	int adminNum;
	String noticeTitle;
	String noticeContent;
	Date noticeWritedate;
	
	
	public int getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(int noticeNum) {
		this.noticeNum = noticeNum;
	}
	public int getAdminNum() {
		return adminNum;
	}
	public void setAdminNum(int adminNum) {
		this.adminNum = adminNum;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public Date getNoticeWritedate() {
		return noticeWritedate;
	}
	public void setNoticeWritedate(Date noticeWritedate) {
		this.noticeWritedate = noticeWritedate;
	}
	@Override
	public String toString() {
		return "NoticeDTO [noticeNum=" + noticeNum + ", adminNum=" + adminNum + ", noticeTitle=" + noticeTitle
				+ ", noticeContent=" + noticeContent + ", noticeWritedate=" + noticeWritedate + "]";
	}
	
	
	
}
