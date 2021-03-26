package com.iu.s3.notice;

import java.sql.Date;

public class NoticeDTO {
	
	private Number num;
	private String title;
	private String writer;
	private String contents;
	private Number hit;
	private Date regdate;
	
	public Number getNum() {
		return num;
	}
	public void setNum(Number num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Number getHit() {
		return hit;
	}
	public void setHit(Number hit) {
		this.hit = hit;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
}
