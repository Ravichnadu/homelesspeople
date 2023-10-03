package com.marolix.homeless.serviceint;

import java.util.List;


import com.marolix.homeless.dto.OrphanDto;
public interface OrphanService {

	public List<OrphanDto> getAllOrphan();
	
	public OrphanDto getById(int id);
	
	public OrphanDto saveAll(OrphanDto dto);
	
	public OrphanDto updateAll(int id);
	
	public void deleteById(int id);
}
