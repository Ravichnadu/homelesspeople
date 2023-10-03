package com.marolix.homeless.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.marolix.homeless.dto.HomlessDto;
import com.marolix.homeless.entity.HomelessEntity;
import com.marolix.homeless.reposistry.HomlessReposistry;
import com.marolix.homeless.serviceint.HomelessServiceIn;

@Service
public class HomelessService implements HomelessServiceIn {

	
	@Autowired
	private HomlessReposistry homelessReposistry;
	
	public List<HomlessDto> getAllHomeless()
	{
		List<HomelessEntity> list=homelessReposistry.findAll();
		
		return list.stream().map(homelessEntity ->new HomlessDto(homelessEntity.getId(), homelessEntity.getTown(), homelessEntity.getMembers(),homelessEntity.getLandmark())).collect(Collectors.toList());
	}

	@Override
	public HomlessDto getById(Integer id) {
		HomelessEntity homelessEntity=homelessReposistry.getById(id);
		
		HomlessDto dto=new HomlessDto(homelessEntity.getId(),homelessEntity.getTown(),homelessEntity.getMembers(),homelessEntity.getLandmark());
		return dto;
	}

	@Override
	public HomlessDto saveAll(HomlessDto dto) {
		HomelessEntity homelessEntity= new HomelessEntity();
		
		homelessEntity.setId(dto.getId());
		homelessEntity.setTown(dto.getTown());
		homelessEntity.setMembers(dto.getMembers());
		homelessEntity.setLandmark(dto.getLandmark());
		homelessReposistry.save(homelessEntity);
		return dto;
	}

	@Override
	public HomlessDto updateById(Integer id) {
	HomelessEntity homelessEntity= new HomelessEntity();
		HomlessDto dto=new HomlessDto();
		homelessEntity.setId(dto.getId());
		homelessEntity.setTown(dto.getTown());
		homelessEntity.setMembers(dto.getMembers());
		homelessEntity.setLandmark(dto.getLandmark());
		homelessReposistry.save(homelessEntity);
		return dto;
	}

	@Override
	public void deleteById(Integer id) {
		homelessReposistry.deleteById(id);
		
	}


}
