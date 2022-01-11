package com.te.springMvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.te.springMvc.Daolayer.DaoOperations;
import com.te.springMvc.model.Register;



@Component
public class Service {
	@Autowired
	DaoOperations dataOperations;

	public boolean save(Register reg) {
		if (reg == null) {
			return false;
		} else {
			
			boolean save = dataOperations.save(reg);
			return save;
		}

	}
}
