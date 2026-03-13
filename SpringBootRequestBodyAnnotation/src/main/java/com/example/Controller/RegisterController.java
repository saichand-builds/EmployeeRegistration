package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Register;
import com.example.Service.IRegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private IRegisterService service;
	
	/**
	 * @RequestBody converts JSON request into Object
	 * And get the ID
	 * create the String Message and  Status Object and pass to the Return statment
	 * @param register
	 * @return
	 */
	
	
	@PostMapping("/save")
	public ResponseEntity<String> SaveRegister(@RequestBody Register register){
			
		Integer Id=service.saveRegister(register);
		String message="read the Json data and converted the Object  "+Id;
		HttpStatus status= HttpStatus.OK;
		return new ResponseEntity(message, status);
	}

}
