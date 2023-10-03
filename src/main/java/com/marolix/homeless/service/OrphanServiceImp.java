package com.marolix.homeless.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marolix.homeless.dto.OrphanDto;
import com.marolix.homeless.entity.OrphanEntity;
import com.marolix.homeless.reposistry.OrphanReposistry;
import com.marolix.homeless.serviceint.OrphanService;

@Service
public class OrphanServiceImp implements OrphanService {

	@Autowired
	private OrphanReposistry orphanReposistry;
	
	@Override
	public List<OrphanDto> getAllOrphan() {
		List<OrphanEntity> list=orphanReposistry.findAll();
		return list.stream().map(orphanEntity ->new OrphanDto(orphanEntity.getId(),orphanEntity.getName(),orphanEntity.getMembers(),orphanEntity.getTown(),orphanEntity.getLandmark())).collect(Collectors.toList());
	}

	@Override
	public OrphanDto getById(int id) {
		OrphanEntity orphanEntity=orphanReposistry.getById(id);
		 OrphanDto dto=new OrphanDto(orphanEntity.getId(),orphanEntity.getName(),orphanEntity.getMembers(),orphanEntity.getTown(),orphanEntity.getLandmark());
		return dto;
	}

	@Override
	public OrphanDto saveAll(OrphanDto dto) {
		OrphanEntity orphanEntity=new OrphanEntity();
		orphanEntity.setId(dto.getId());
		orphanEntity.setName(dto.getName());
		orphanEntity.setMembers(dto.getMembers());
		orphanEntity.setTown(dto.getTown());
		orphanEntity.setLandmark(dto.getLandmark());
		orphanReposistry.save(orphanEntity);
		return dto;
	}

	@Override
	public OrphanDto updateAll(int id) {
		OrphanEntity orphanEntity=new OrphanEntity();
		OrphanDto dto=new OrphanDto();
		orphanEntity.setId(dto.getId());
		orphanEntity.setName(dto.getName());
		orphanEntity.setMembers(dto.getMembers());
		orphanEntity.setTown(dto.getTown());
		orphanEntity.setLandmark(dto.getLandmark());
		orphanReposistry.save(orphanEntity);
		return dto;
	}

	@Override
	public void deleteById(int id) {
		
		orphanReposistry.deleteById(id);
	}

}
