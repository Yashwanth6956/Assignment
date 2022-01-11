package com.te.onetoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Boy {
	@Id
	private int bid;
	private String name;
	@ManyToOne
	private  Girl girl;



	public int getBid() {
		return bid;
	}



	public void setBid(int bid) {
		this.bid = bid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Girl getGirl() {
		return girl;
	}



	public void setGirl(Girl girl) {
		this.girl = girl;
	}



	@Override
	public String toString() {
		return "Boy [bid=" + bid + ", name=" + name + ", girl=" + girl + "]";
	}




}
