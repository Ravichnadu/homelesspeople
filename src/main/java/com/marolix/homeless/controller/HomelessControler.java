 package com.marolix.homeless.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marolix.homeless.dto.HomlessDto;
import com.marolix.homeless.service.HomelessService;

@CrossOrigin("*")
@RestController
public class HomelessControler {

	@Autowired
	private HomelessService homelessService;
	
	@GetMapping("/homeless")
	public ResponseEntity<List<HomlessDto>> getAllHomeless()
	{
		
		List<HomlessDto> dto=homelessService.getAllHomeless();
		
		return ResponseEntity.status(HttpStatus.OK).body(dto);
	}
	
	@GetMapping("/homeless/{id}")
	public ResponseEntity<HomlessDto> getById(@PathVariable("id") Integer id)
	{
		HomlessDto dto=homelessService.getById(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(dto);
	}
	
	@PostMapping("/homeless")
	public ResponseEntity<HomlessDto> saveAll(@RequestBody HomlessDto dto )
	{
			
		return new ResponseEntity<HomlessDto>(homelessService.saveAll(dto),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<HomlessDto> updateById(@PathParam("id") Integer id,@RequestBody HomlessDto dto)
	{
		
		
		return new ResponseEntity<HomlessDto>(homelessService.saveAll(dto),HttpStatus.OK);
	}
	
	@DeleteMapping("/homeless/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Integer id)
	{
		homelessService.deleteById(id);
		
		return new ResponseEntity<String>("delete Successfully",HttpStatus.OK);
	}
}
