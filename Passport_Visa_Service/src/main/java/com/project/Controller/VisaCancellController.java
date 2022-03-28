package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Model.VisaCancell;
import com.project.Service.VisaCancellService;

public class VisaCancellController {
	
@RestController
@RequestMapping("/visacancel")

public class VisController {
	@Autowired
	VisaCancellService service;
	
	@PostMapping("/add")
	public ResponseEntity<VisaCancell> visaCancellation(@RequestBody VisaCancell v) {
		
		//String msg=null;
		System.out.println(v);
		
		VisaCancell v1=service.addVisaCancell(v);
		
	
	return new ResponseEntity<VisaCancell>(v1,HttpStatus.OK);
}
}

}
