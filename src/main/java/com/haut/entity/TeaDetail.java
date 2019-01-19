package com.haut.entity;

public class TeaDetail {

	private int tid; //教师号
	private String tname; //教师名
	private String tcollege; //教师所在学院
	private String tposition; //教师职位
	private double balance; //账户余额
	private String sex;
	private String minzu;
	private String xueli;
	private String tschool;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTcollege() {
		return tcollege;
	}
	public void setTcollege(String tcollege) {
		this.tcollege = tcollege;
	}
	public String getTposition() {
		return tposition;
	}
	public void setTposition(String tposition) {
		this.tposition = tposition;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMinzu() {
		return minzu;
	}
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	public String getXueli() {
		return xueli;
	}
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	public String getTschool() {
		return tschool;
	}
	public void setTschool(String tschool) {
		this.tschool = tschool;
	}
	@Override
	public String toString() {
		return "TeaDetail [tid=" + tid + ", tname=" + tname + ", tcollege=" + tcollege + ", tposition=" + tposition
				+ ", balance=" + balance + ", sex=" + sex + ", minzu=" + minzu + ", xueli=" + xueli + ", tschool="
				+ tschool + "]";
	}
	public TeaDetail(int tid, String tname, String tcollege, String tposition, double balance, String sex, String minzu,
			String xueli, String tschool) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tcollege = tcollege;
		this.tposition = tposition;
		this.balance = balance;
		this.sex = sex;
		this.minzu = minzu;
		this.xueli = xueli;
		this.tschool = tschool;
	}
	public TeaDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
