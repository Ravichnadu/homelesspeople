package com.marolix.homeless.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marolix.homeless.dto.MyDataDto;
import com.marolix.homeless.service.MyDataService;

@RestController
public class MyDataController {

	@Autowired
	private MyDataService myDataService;
	
	@PostMapping("/")
	public ResponseEntity<MyDataDto> saveData(@RequestBody MyDataDto dto)
	{
		
		
		return new ResponseEntity<MyDataDto>(myDataService.saveAll(dto), HttpStatus.OK);
	}
}
