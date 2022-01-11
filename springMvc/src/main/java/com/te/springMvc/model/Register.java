package com.te.springMvc.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

//@Data
@Entity
public class Register {
	@Id
	private String name;
	private String mail;
	private long number;
	private String address;
	@Override
	public int hashCode() {
		return Objects.hash(address, mail, name, number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Register other = (Register) obj;
		return Objects.equals(address, other.address) && Objects.equals(mail, other.mail)
				&& Objects.equals(name, other.name) && number == other.number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", mail=" + mail + ", number=" + number + ", address=" + address + "]";
	}
	
	
	

}