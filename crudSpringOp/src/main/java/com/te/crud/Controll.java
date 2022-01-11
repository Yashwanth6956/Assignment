package com.te.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.crud.doa.Employees;
import com.te.crud.service.CrudImpl;

@Controller
public class Controll {

	@GetMapping("/add")
	public String add() {
		return "insert";
	}

	@Autowired
	CrudImpl service;

	@PostMapping("/add")
	public String addEmp(Employees emp) {
		System.out.println(emp);
		boolean add = service.add(emp);
		if (add) {
			return "success";
		} else {
			return "failure";
		}

	}

	@GetMapping("/delete")
	public String delete() {
		return "delete";

	}

	@PostMapping("/delete")
	public String deleteById(int id) {
		if (service.remove(id))
			return "success";
		return "failure";

	}

	@GetMapping("/update")
	public String update() {
		return "updateName";

	}

	@PostMapping("/update")
	public String updateByName(int id,String firstName) {
		if (service.update(id,firstName)) {
			return "success";
		} else {
			return "failure";

		}
	}
}
