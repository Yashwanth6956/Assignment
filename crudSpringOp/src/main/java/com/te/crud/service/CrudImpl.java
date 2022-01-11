package com.te.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.crud.doa.Employees;
import com.te.crud.doa.saveData;

@Service
public class CrudImpl implements Crud {
	
	@Autowired
	saveData saved;

	@Override
	public boolean add(Employees emp) {
		System.out.println(emp);
		if(emp==null) {
			return false;
		}else {
			return saved.save(emp);
		}
	}

	@Override
	public boolean remove(int id) {
		if(id==0) {
			return false;
		}
		return saved.remove(id);
	}

	@Override
	public boolean update(int id,String firstName) {
		if(firstName==null&&id==0) {
			return false;
		}else {
			return saved.update(id,firstName);
		}
	}

	@Override
	public boolean fetch() {
		return false;
		// TODO Auto-generated method stub
		
	}



}
