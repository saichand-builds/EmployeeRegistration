package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Model.Employee;
import com.example.Service.IEmployeeService;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@GetMapping("/register")
	public String showRegister() {

		return "EmployeeRegister";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee, Model model) {
		Integer Id = service.empRegister(employee);
		String messge = "Employee is saved" + Id;
		model.addAttribute("message", messge);
		return "EmployeeRegister";
	}

}
