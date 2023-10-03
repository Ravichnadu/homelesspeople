package com.marolix.homeless.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
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

import com.marolix.homeless.dto.FuctionDto;
import com.marolix.homeless.service.FuctionService;

@CrossOrigin("*")
@RestController
public class FuctionControler {

	@Autowired
	private FuctionService fuctionService;
	
	@GetMapping("/fuction")
	public ResponseEntity< List<FuctionDto>> getAllFuction()
	{
		List<FuctionDto> dto=fuctionService.getAllFuction();
		return ResponseEntity.status(HttpStatus.OK).body(dto);
	}
	
	@GetMapping("/fuction/{id}")
	public ResponseEntity<FuctionDto> getById(@PathVariable("id") int id)
	{
		FuctionDto dto=fuctionService.getById(id);
		return ResponseEntity.status(HttpStatus.OK).body(dto);
	}
	
	@PostMapping("fuction")
	public ResponseEntity<FuctionDto> saveAll(@RequestBody FuctionDto dto)
	{
		FuctionDto fuctiondto=fuctionService.saveAll(dto);
		return ResponseEntity.status(HttpStatus.OK).body(fuctiondto);
	}
	
	@PutMapping("fuction/{id}")
	public ResponseEntity<FuctionDto> updatebyId(@PathVariable("id") int id,@RequestBody FuctionDto dto)
	{
		
		return new ResponseEntity<FuctionDto>(fuctionService.saveAll(dto),HttpStatus.OK);
	}
	
	@DeleteMapping("fuction/{id}")
	
	public ResponseEntity<String> deleteById(@PathVariable("id") int id)
	{
		
		
		return new ResponseEntity<String>("delete successfully",HttpStatus.OK);
	}
	
}
