package com.example.app.dto;

import java.util.Date;

public class MemberDTO {
	

	private int userNum;
	private String userId;
	private String userNickname;
	private String userPassword;
	private String userEmail;
	private String userName;
	private String userGender;
	private int userExp;
	private double userNtrp;
	private Date userJoindate;
	
	
	//getter, setter
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public Double getUserNtrp() {
		return userNtrp;
	}
	public void setUserNtrp(Double userNtrp) {
		this.userNtrp = userNtrp;
	}
	public Date getUserJoindate() {
		return userJoindate;
	}
	public void setUserJoindate(Date userJoindate) {
		this.userJoindate = userJoindate;
	}
	
	
	@Override
	public String toString() {
		return "UserDTO [userNum=" + userNum + ", userId=" + userId + ", userNickname=" + userNickname
				+ ", userPassword=" + userPassword + ", userEmail=" + userEmail + ", userName=" + userName
				+ ", userGender=" + userGender + ", userExp=" + userExp + ", ntrp=" + userNtrp + ", userJoindate="
				+ userJoindate + "]";
	}
	
}
