package com.example.app.dto;

import java.util.Date;

public class QnaDTO {

	
//		    qna_num INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
//		    user_num INT NOT NULL,
//		    qna_title VARCHAR(300) NOT NULL,
//		    qna_content TEXT NOT NULL,
//		    qna_viewcnt INT DEFAULT 0,
//		    qna_commentcnt INT DEFAULT 0,
//		    qna_writedate DATETIME NOT null DEFAULT CURRENT_TIMESTAMP,
//		    FOREIGN KEY (user_num) REFERENCES TBL_USER(user_num)
		
	private int qnaNum;
	private int userNum;
	private String qnaTitle;
	private String qnaContent;
	private int QnaViewCnt;
	private int qnaCommentCnt;
	private Date qnaWriteDate;
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
	public Date getQnaWriteDate() {
		return qnaWriteDate;
	}
	public void setQnaWriteDate(Date qnaWriteDate) {
		this.qnaWriteDate = qnaWriteDate;
	}
	@Override
	public String toString() {
		return "QnaDTO [qnaNum=" + qnaNum + ", userNum=" + userNum + ", qnaTitle=" + qnaTitle + ", qnaContent="
				+ qnaContent + ", QnaViewCnt=" + QnaViewCnt + ", qnaCommentCnt=" + qnaCommentCnt + ", qnaWriteDate="
				+ qnaWriteDate + "]";
	}
	

	
	

	
	
	
}
