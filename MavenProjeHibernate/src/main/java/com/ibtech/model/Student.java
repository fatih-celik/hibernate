package com.ibtech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name = "Students", schema = "public")
public class Student{
	
	@Column(name="name")
	private String ad;
	@Column(name="surname")
	private String soyad;
    @Id
    @Column(name="sicil")
	private Integer sicilNo;
    @Column(name="title")
	private String title;
    @Transient
	private String email;
	@Transient
	boolean editable;
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Integer getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(Integer sicilNo) {
		this.sicilNo = sicilNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
}