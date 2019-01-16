package com.haut.entity;

public class LoginUser {	

private int uid; //登录账号 
private String upass;//用户登录密码
private int flag;//用户权限 管理员/普通教师
private int ustate;//用户状态 禁用/正常
private int tid;//教师号 =uid
private int aid;//管理员号 =uid

public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
public int getFlag() {
	return flag;
}
public void setFlag(int flag) {
	this.flag = flag;
}
public int getUstate() {
	return ustate;
}
public void setUstate(int ustate) {
	this.ustate = ustate;
}
public int getTid() {

	return tid;
}
public void setTid(int tid) {
	if(this.flag==1){
		this.tid = this.uid;
	}else{
		this.tid=0;
	}
	
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	if(this.flag==0){
		this.aid = uid;
	}else{
		this.aid=0;
	}
	
}
public LoginUser(int uid, String upass) {
	super();
	this.uid = uid;
	this.upass = upass;
	this.tid=uid;
}

public LoginUser() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "LoginUser [uid=" + uid + ", upass=" + upass + ", flag=" + flag + ", ustate=" + ustate + ", tid=" + tid
			+ ", aid=" + aid + "]";
}

}
