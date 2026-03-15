package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Tourist_Model;
import com.example.Service.ITouristService;

@RestController
@RequestMapping("/tourist")
public class enrollTourist {

	@Autowired
	public ITouristService service;

	@GetMapping("/register")
	public ResponseEntity<?> enrollTourist(@RequestBody Tourist_Model Tou) {

		try {
			String resultMsg = service.touristRegister(Tou);
			// return new ResponseEntity<String>(resultMsg, HttpStatus.OK);
			return ResponseEntity.ok(resultMsg);
		} catch (Exception e) {
			String message = "problem is in enrollment time";
			return ResponseEntity.internalServerError().body(message);
		}

	}

	/*
	 * @GetMapping("/getAll") public ResponseEntity<?> displayTourist() {
	 * 
	 * try { List<Tourist_Model> list = service.fetechAllTourist();
	 * 
	 * return ResponseEntity.ok(list); } catch (Exception e) { // TODO: handle
	 * exception return ResponseEntity.internalServerError()
	 * .body("Internal Server Error"); }
	 * 
	 * }
	 */
	@GetMapping("/getAll")
	public ResponseEntity<List<Tourist_Model>> displayTourist() {
		List<Tourist_Model> list = service.fetechAllTourist();

		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/find/{tId}")
	public ResponseEntity<Tourist_Model> getTourist(@PathVariable Integer tId){
		
		Tourist_Model tourist=service.fetchTouristById(tId);
		
		return ResponseEntity.ok(tourist);
	}

}
