package com.marolix.homeless.serviceint;

import java.util.List;

import com.marolix.homeless.dto.FuctionDto;

public interface FuctionServiceIn {

	public List<FuctionDto> getAllFuction();
	
	public FuctionDto getById(int id);
	
	public FuctionDto saveAll(FuctionDto dto);
	
	public FuctionDto updateById(int id);
	
	public void deleteById();
}
