package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringbootRequestParamApplication;
import com.example.Model.Apiresponse;
import com.example.Model.House;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/house")
public class HouseController {

	private final SpringbootRequestParamApplication springbootRequestParamApplication;

	HouseController(
			SpringbootRequestParamApplication springbootRequestParamApplication) {
		this.springbootRequestParamApplication = springbootRequestParamApplication;
	}

	@GetMapping("/register")
	public ResponseEntity<String> registerHouse(
			
			@RequestParam("id") Integer drNno,
			@RequestParam(required = false) String name) {
		String Message;
		
		/*
		 * if(name == null) { Message="@true"; return new
		 * ResponseEntity<String>(Message, HttpStatus.OK); } else { Message=
		 * "@false"; return new ResponseEntity<String>(Message, HttpStatus.OK);
		 * 
		 * }
		 */
		if(name.equalsIgnoreCase("admin")) {
			Message="Request parameter";
		}
		else {
			Message ="Else part";
		}
		return new ResponseEntity<String>(Message, HttpStatus.OK);
	}
	// http://localhost:8080/Springboot-RequestParam/house/register?id=12&name=saichand

	@GetMapping("/save")
	public ResponseEntity<String> getCost(@RequestParam("cost") double cost) {

		String message = "Request parameter Saved";
		return new ResponseEntity<String>(message, HttpStatus.OK);

		// http://localhost:8080/Springboot-RequestParam/house/save?cost=873.3

	}

	@GetMapping("/get")
	public ResponseEntity<Apiresponse> house(@RequestParam("rio") Integer no) {
		House house = new House();
		String message = "@request Param";

		Apiresponse response = new Apiresponse(message, house);
		return ResponseEntity.ok(response);

	}

}
