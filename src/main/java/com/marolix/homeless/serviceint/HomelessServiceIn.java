package com.marolix.homeless.serviceint;

import java.util.List;

import com.marolix.homeless.dto.HomlessDto;

public interface HomelessServiceIn {

	public List<HomlessDto> getAllHomeless();
	
	public HomlessDto getById(Integer id);
	
	public  HomlessDto saveAll(HomlessDto dto);
	
	public HomlessDto updateById(Integer id);
	
	public void deleteById(Integer id);
}
