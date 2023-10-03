package com.marolix.homeless.controller;

import java.util.List;

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

import com.marolix.homeless.dto.OrphanDto;
import com.marolix.homeless.serviceint.OrphanService;
@CrossOrigin("*")
@RestController
public class OrphanController {
	
	@Autowired
	private OrphanService orphanService;
	
	@GetMapping("/orphan")
	public ResponseEntity<List<OrphanDto>> getAllOphans()
	{
		List<OrphanDto> dto=orphanService.getAllOrphan();
		
		return ResponseEntity.status(HttpStatus.OK).body(dto) ;
	}
	
	@GetMapping("/orphan/{id}")
	public ResponseEntity<OrphanDto> getById(@PathVariable("id") int id)
	{
		OrphanDto dto=orphanService.getById(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(dto);
		
	}
	
	@PostMapping("/orphan")
	public ResponseEntity<OrphanDto> saveAll(@RequestBody OrphanDto dto)
	{
		OrphanDto orphandto=orphanService.saveAll(dto);
		
		return ResponseEntity.status(HttpStatus.OK).body(orphandto);
	}
	
	@PutMapping("/orphan/{id}")
	public ResponseEntity<OrphanDto> updateById(@PathVariable("id") int id,@RequestBody OrphanDto dto)
	{
		OrphanDto orphanDto =orphanService.saveAll(dto);
		
		return ResponseEntity.status(HttpStatus.OK).body(orphanDto);
	}
	
	@DeleteMapping("/orphan/{id}")
	
	public ResponseEntity<String> deleteById(@PathVariable("id") int id)
	{
		return new ResponseEntity<String>("Delete Successfully",HttpStatus.OK);
	}

}
