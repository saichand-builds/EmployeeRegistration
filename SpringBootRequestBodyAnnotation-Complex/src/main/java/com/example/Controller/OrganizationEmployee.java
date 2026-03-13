package com.example.Controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Model.Organization;

@Controller
@RequestMapping("/employee")
public class OrganizationEmployee {

	@PostMapping("/register")
	public ResponseEntity<String> registerEmployee(
			@RequestBody Organization org) throws IOException {

		StringBuilder result = new StringBuilder();

		result.append("Employee Name  :").append(org.getName()).append("\n");

		result.append("Employee Salary :").append(org.getSalary()).append("\n");

		result.append("Department").append(org.getDepartment().getDeptName())
				.append("-").append(org.getDepartment().getLocation())
				.append("\n");

		result.append("Skills \n");
		for (String skill : org.getSkills()) {
			result.append(skill).append("\n");
		}

		result.append("projects : \n");
		org.getProjects().forEach(project -> {
			result.append(project.getProjName()).append("\n")
					.append("Duration \n")
					.append(project.getProDuration()).append("months \n");
		});

		return ResponseEntity.ok(result.toString());
	}

}

/*
 * input
 * 
 * { "name":"Saichand", "salary":42252.2, "department" :{ "deptName":
 * "ITdepartment", "location": "Chennai" }, "skills" :[ "Java", "spring boot",
 * "Microservices" ], "projects": [ { "projName" :"Star health",
 * "proDuration":36 } ] }
 * 
 * 
 * output
 * 
 * Employee Name :Saichand Employee Salary :42252.2
 * DepartmentITdepartment-Chennai Skills Java spring boot Microservices projects
 * : Star health Duration 36months
 */



