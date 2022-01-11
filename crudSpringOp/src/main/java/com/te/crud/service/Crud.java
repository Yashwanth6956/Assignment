package com.te.crud.service;

import com.te.crud.doa.Employees;

public interface Crud {
	public boolean add(Employees emp);
	public boolean remove(int id);
	public boolean update(int id,String firstName);
	public  boolean fetch();
	

}
